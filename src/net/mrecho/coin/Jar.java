package net.mrecho.coin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map.Entry;

import net.mrecho.coin.coins.CoinList;
import net.mrecho.coin.coins.CoinList.Coins;
import net.mrecho.coin.coins.CoinTypes;

import org.apache.logging.log4j.Logger;

/**
 * 
 * @author mrecho
 *
 */
public class Jar {

	private Logger logger;
	
	private static int JarVolume = 946353;
	
	private int MaxVolume = 0;
	private float CurrentVolume = 0;

	// The list of coins used and how many
	private HashMap<Coins, Integer> CoinCount = new HashMap<Coins,Integer>(6);
	
	private HashMap<Coins, Float> CoinTypeValue = new HashMap<Coins,Float>(6);
	
	/**
	 * 
	 * @param logger
	 */
	public Jar(Logger logger){
		this.logger = logger;
	}
	
	/**
	 * This adds the type of {@link Coins} to this Jar.
	 * And keeps track of the different types of coins used.
	 * 
	 * @param cointype {@link Coins}
	 * @param count How many Coins you want added at a time
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean addCoin(CoinTypes cointype,int count){
		boolean full = false;
		
		if(CurrentVolume < MaxVolume){
			
			float coinVolume = (cointype.getVolume() * count);
			float newVolume = CurrentVolume + coinVolume;
			
			if(newVolume <= MaxVolume){
				CurrentVolume = newVolume;
					
				//int newcount = count + CoinCount.get(coin.getName());
				//CoinCount.put(coin.getName(),  newcount);
				
				int newcount = count + CoinCount.get(cointype.getType());
				CoinCount.put(cointype.getType(),  newcount);
				
				CoinTypeValue.put(cointype.getType(), cointype.getValue());
					
				//logger.debug("remaining: "+ remainningVolume());
				full = false;
				
			} else {
				full = true;
			}
			
		} else {
			full = true;
		}
		
		return full;
	}

	/**
	 * This is used to reset the Jar
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean clearJar(){
		boolean reset = false;
		
		MaxVolume = JarVolume;
		CurrentVolume = 0;
		
		// I keep changing this, and just going to keep it for now
		
		CoinCount.clear();
		CoinCount.put(CoinList.Coins.Penny, 0);
		CoinCount.put(CoinList.Coins.Nickel, 0);
		CoinCount.put(CoinList.Coins.Dime, 0);
		CoinCount.put(CoinList.Coins.Quarter, 0);
		CoinCount.put(CoinList.Coins.HalfDollar, 0);
		CoinCount.put(CoinList.Coins.Dollar, 0);
		
		
		// Needs to be a loop or something
		/*
		CoinCount.clear();
		CoinCount.put("Penny", 0);
		CoinCount.put("Nickel", 0);
		CoinCount.put("Dime", 0);
		CoinCount.put("Quarter", 0);
		CoinCount.put("HalfDollar", 0);
		CoinCount.put("Dollar", 0);
		*/
		
		return reset;
	}
	
	/**
	 * Counts up the total money value of all {@link Coins} that are stored in this Jar
	 * @return <code>float</code>
	 */
	public float getTotalValue(){
		
		float totalValue = 0;
		
		
		for(Entry<Coins, Integer> entry : CoinCount.entrySet()){
			Coins coins = entry.getKey();
			int count = entry.getValue();
			
			float value = 0;

			// Java ieee floating point issue
			try {
				Float cointypevalue = CoinTypeValue.get(coins);
				//logger.debug(CoinTypeValue);
				BigDecimal bd = new BigDecimal((count * cointypevalue ), MathContext.DECIMAL32);
				bd = bd.setScale(2);
				value = bd.floatValue();
				//logger.debug("coin:"+ coins.name() +" count:"+ count + " value:"+ value);
			} catch (Exception e){
				
			}
			totalValue = totalValue + value;
			
		}
		//logger.debug("Total Value:"+ totalValue);
		
		return totalValue;
	}
	
	/**
	 * Returns the HashMap of the current coins in the Jar
	 * @return
	 */
	public HashMap<Coins, Integer> getCoinCount() {
		return CoinCount;
	}
	
	/**
	 * How much is left in the Jar
	 * @return
	 */
	public double remainningVolume(){
		double remain = MaxVolume - CurrentVolume;
		return remain;
	}
	
	/**
	 * The current Volume in the Jar
	 * @return
	 */
	public double getCurrentVolume() {
		return CurrentVolume;
	}

	/**
	 * Reset the Volume of the Jar
	 * @param currentVolume
	 */
	public void setCurrentVolume(float currentVolume) {
		CurrentVolume = currentVolume;
	}
}
