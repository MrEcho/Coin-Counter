package net.mrecho.coin;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.mrecho.coin.coins.Coin;
import net.mrecho.coin.coins.CoinTypes;
import net.mrecho.coin.coins.Coins;

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
	
	
	public boolean fill(Coin coin) {
		logger.debug("-------------- Penny");
		boolean full = false;
		clearJar();
		
		filler(coin, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}
	
	public boolean putCoin(Coin coin, int count){
		return false;
		
	}

	/**
	 * This is used to randomly fill up the Jar with random {@link Coins}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean randomFill() {
		logger.debug("-------------- Random Fill");
		boolean full = false;
		clearJar();
		
		Random RANDOM = new Random();
		List<CoinTypes> VALUES = Arrays.asList(CoinTypes.values());
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			
			CoinTypes r = VALUES.get(RANDOM.nextInt(VALUES.size()));
						
			full = addCoin(new Coin(r), 1);
			if(full == true){
				break;
			}
		}
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

}
