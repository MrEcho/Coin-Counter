package net.mrecho.coin;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

import net.mrecho.coin.coins.Coin;
import net.mrecho.coin.coins.Coin.CoinValues;
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
	private HashMap<CoinTypes, Integer> CoinCount = new HashMap<CoinTypes,Integer>(6);
	
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
	 * @param coin {@link Coins}
	 * @param count How many Coins you want added at a time
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean addCoin(Coin coin,int count){
		boolean full = false;
		
		if(CurrentVolume < MaxVolume){
			
			float coinVolume = (coin.getCoinVolume() * count);
			float newVolume = CurrentVolume + coinVolume;
			
			if(newVolume <= MaxVolume){
				CurrentVolume = newVolume;
					
				//int newcount = count + CoinCount.get(coin.getName());
				//CoinCount.put(coin.getName(),  newcount);
				
				int newcount = count + CoinCount.get(coin.getType());
				CoinCount.put(coin.getType(),  newcount);
					
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
		
		CoinCount.clear();
		CoinCount.put(CoinTypes.Penny, 0);
		CoinCount.put(CoinTypes.Nickel, 0);
		CoinCount.put(CoinTypes.Dime, 0);
		CoinCount.put(CoinTypes.Quarter, 0);
		CoinCount.put(CoinTypes.HalfDollar, 0);
		CoinCount.put(CoinTypes.Dollar, 0);

		return reset;
	}
	
	/**
	 * Counts up the total money value of all {@link Coins} that are stored in this Jar
	 * @return <code>float</code>
	 */
	public float getTotalValue(){
		
		float totalValue = 0;
		
		for(Map.Entry<CoinTypes, Integer> entry : CoinCount.entrySet()){
			CoinTypes coin = entry.getKey();
			int count = entry.getValue();
			
			// Java ieee floating point issue
			BigDecimal bd = new BigDecimal((count * CoinValues.valueOf(coin.getName()).value() ), MathContext.DECIMAL32);
			bd = bd.setScale(2);
			float value = bd.floatValue();
			//logger.debug("coin:"+ coin +" count:"+ count + " value:"+ value);

			totalValue = totalValue + value;
		}
		//logger.debug("Total Value:"+ totalValue);
		
		return totalValue;
	}
	
	/**
	 * Returns the HashMap of the current coins in the Jar
	 * @return
	 */
	public HashMap<CoinTypes, Integer> getCoinCount() {
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
