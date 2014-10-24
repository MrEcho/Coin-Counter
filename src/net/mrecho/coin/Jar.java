package net.mrecho.coin;

import java.util.HashMap;

import net.mrecho.coin.constants.Coins;

import org.apache.logging.log4j.Logger;

/**
 * 
 * @author mrecho
 *
 */
public class Jar {

	private Logger logger;
	
	private int MaxVolume = 0;
	private float CurrentVolume = 0;

	private HashMap<Coins, Integer> CoinCount = new HashMap<Coins,Integer>(6);
	

	/**
	 * 
	 * @param logger
	 */
	public Jar(Logger logger){
		this.logger = logger;
	}
	
	/**
	 * 
	 * @param coin
	 * @param count
	 * @return
	 */
	public boolean addCoin(Coins coin,int count){
		boolean full = false;
		
		if(CurrentVolume < MaxVolume){
			
			float coinVolume = (constants.getCoinVolume(coin) * count);
			float newVolume = CurrentVolume + coinVolume;
			
			if(newVolume <= MaxVolume){
				CurrentVolume = newVolume;
					
				int newcount = count + CoinCount.get(coin);
				CoinCount.put(coin,  newcount);
					
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
	 * 
	 * @return
	 */
	public boolean clearJar(){
		boolean reset = false;
		
		MaxVolume = constants.getVolume();
		CurrentVolume = 0;
		
		CoinCount.clear();
		CoinCount.put(Coins.Penny, 0);
		CoinCount.put(Coins.Nickel, 0);
		CoinCount.put(Coins.Dime, 0);
		CoinCount.put(Coins.Quarter, 0);
		CoinCount.put(Coins.HalfDollar, 0);
		CoinCount.put(Coins.Dollar, 0);
		
		logger.debug(CoinCount);
		
		logger.info("Jar Cleared");
		return reset;
	}
	
	public HashMap<Coins, Integer> getCoinCount() {
		return CoinCount;
	}
	
	public double remainningVolume(){
		double remain = MaxVolume - CurrentVolume;
		return remain;
	}
	
	public double getCurrentVolume() {
		return CurrentVolume;
	}

	public void setCurrentVolume(float currentVolume) {
		CurrentVolume = currentVolume;
	}
}
