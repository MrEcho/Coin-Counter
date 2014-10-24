package net.mrecho.coin;

import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;

import org.apache.logging.log4j.Logger;

import net.mrecho.coin.constants.Coins;

public class SlotMachine {

	private Jar jar;
	private Logger logger;

	public SlotMachine(Logger logger, Jar coinjar) {
		this.jar = coinjar;
		this.logger = logger;
		this.jar.clearJar();
	}

	public Jar getJar(){
		return this.jar;
	}
	
	public void clearJar(){
		this.jar.clearJar();
	}
	
	public int getCoinCount(){
		
		int totalCount = 0;
		
		for(Entry<Coins, Integer> coin : jar.getCoinCount().entrySet()){
			totalCount = totalCount + coin.getValue();
		}
		
		return totalCount;
	}
	
	public float getTotalValue(){
		return jar.getTotalValue();
	}
	
	public boolean addCoin(constants.Coins coin, int count){
		boolean full = false;
		
		if(jar.addCoin(coin, count) == false){
			full = false;
		} else {
			full = true;
		}
		
		return full;
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.Penny, 1);
			if(full == true){
				break;
			}
		}
		
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.Nickel, 1);
			if(full == true){
				break;
			}
		}
		
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.Dime, 1);
			if(full == true){
				break;
			}
		}
		
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.Quarter, 1);
			if(full == true){
				break;
			}
		}
		
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.HalfDollar, 1);
			if(full == true){
				break;
			}
		}
		
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
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(constants.Coins.Dollar, 1);
			if(full == true){
				break;
			}
		}
		
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
