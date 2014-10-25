package net.mrecho.coin;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.Logger;

import net.mrecho.coin.constants.Coins;

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
	
	/**
	 * This is used to randomly fill up the Jar with random {@link Coins}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean randomFill() {
		logger.debug("-------------- Random Fill");
		boolean full = false;
		clearJar();
		
		Random RANDOM = new Random();
		List<Coins> VALUES = Arrays.asList(constants.Coins.values());
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
		
			constants.Coins r = VALUES.get(RANDOM.nextInt(VALUES.size()));
			
			full = addCoin(r, 1);
			if(full == true){
				break;
			}
		}
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}
	
	/**
	 * Used to fill the Jar with all {@link Coins.Penny}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithPennys() {
		logger.debug("-------------- Penny");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Penny, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putPenny(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Penny, count);
		
		return full;
	}

	/**
	 * Used to fill the Jar with all {@link Coins.Nickel}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithNickels() {
		logger.debug("-------------- Nickel");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Nickel, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putNickel(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Nickel, count);
		
		return full;
	}

	/**
	 * Used to fill the Jar with all {@link Coins.Dime}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithDimes() {
		logger.debug("-------------- Dime");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Dime, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putDime(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Dime, count);
		
		return full;
	}

	/**
	 * Used to fill the Jar with all {@link Coins.Quarter}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithQuarters() {
		logger.debug("-------------- Quarter");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Quarter, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;	
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putQuarter(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Quarter, count);
		
		return full;	
	}

	/**
	 * Used to fill the Jar with all {@link Coins.HalfDollar}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithHalfDollars() {
		logger.debug("-------------- Half Dollar");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.HalfDollar, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putHalfDollar(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.HalfDollar, count);
		
		return full;	
	}

	/**
	 * Used to fill the Jar with all {@link Coins.Dollar}
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean fillWithDollars() {
		logger.debug("-------------- Dollar");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Dollar, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	/**
	 * 
	 * @param count How many {@link Coins} you want in the Jar
	 * @param clearjar To reset the Jar to an empty state
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean putDollar(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Dollar, count);
		
		return full;	
	}

}
