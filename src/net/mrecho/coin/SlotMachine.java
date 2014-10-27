package net.mrecho.coin;

import java.util.ArrayList;
import java.util.Random;

import net.mrecho.coin.coins.CoinList.Coins;
import net.mrecho.coin.coins.CoinTypes;

import org.apache.logging.log4j.Logger;


/**
 * 
 *
 */
public class SlotMachine extends Machine {

	public SlotMachine(Logger logger, Jar coinjar) {
		this.jar = coinjar;
		this.logger = logger;
		jar.clearJar();
	}
	
	
	public boolean fill(CoinTypes cointype) {
		logger.debug("-------------- Penny");
		boolean full = false;
		clearJar();
		
		filler(cointype, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}
	
	public boolean putCoin(CoinTypes cointype, int count){
		return false;
		
	}
	
	/**
	 * This is used to randomly fill up the Jar with random {@link Coins}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean randomFill(ArrayList<CoinTypes> coins) {
		logger.debug("-------------- Random Fill");
		boolean full = false;
		clearJar();
		
		Random RANDOM = new Random();
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			
			CoinTypes r = coins.get(RANDOM.nextInt(coins.size()));
						
			full = addCoin(r, 1);
			if(full == true){
				break;
			}
			
		}
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}
}