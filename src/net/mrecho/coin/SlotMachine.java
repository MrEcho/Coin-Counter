package net.mrecho.coin;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.Logger;

import net.mrecho.coin.constants.Coins;

public class SlotMachine extends Machine {

	public SlotMachine(Logger logger, Jar coinjar) {
		jar = coinjar;
		logger = logger;
		jar.clearJar();
	}

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
	
	public boolean fillWithPennys() {
		logger.debug("-------------- Penny");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Penny, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	public boolean putPenny(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Penny, count);
		
		return full;
	}

	public boolean fillWithNickels() {
		logger.debug("-------------- Nickel");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Nickel, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	public boolean putNickel(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Nickel, count);
		
		return full;
	}

	public boolean fillWithDimes() {
		logger.debug("-------------- Dime");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Dime, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	public boolean putDime(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Dime, count);
		
		return full;
	}

	public boolean fillWithQuarters() {
		logger.debug("-------------- Quarter");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Quarter, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;	
	}

	public boolean putQuarter(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Quarter, count);
		
		return full;	
	}

	public boolean fillWithHalfDollars() {
		logger.debug("-------------- Half Dollar");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.HalfDollar, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	public boolean putHalfDollar(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.HalfDollar, count);
		
		return full;	
	}

	public boolean fillWithDollars() {
		logger.debug("-------------- Dollar");
		boolean full = false;
		clearJar();
		
		filler(constants.Coins.Dollar, 1);
		
		logger.info("Coin Count: "+ jar.getCoinCount());
		logger.info("Total Value: "+ jar.getTotalValue());
		
		return full;
	}

	public boolean putDollar(int count, boolean clearjar) {
		boolean full = false;
		
		if(clearjar){ clearJar(); }
		
		full = addCoin(constants.Coins.Dollar, count);
		
		return full;	
	}

}
