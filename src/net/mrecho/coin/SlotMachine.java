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
	
	public boolean randomFill() {
		boolean full = false;
		clearJar();
		
		Random RANDOM = new Random();
		List<Coins> VALUES = Arrays.asList(constants.Coins.values());
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
		
			constants.Coins r = VALUES.get(RANDOM.nextInt(VALUES.size()));
		
			if(jar.addCoin(r, 1) == false){
				full = true;
			} else {
				full = true;
				
				logger.info(jar.getCoinCount());
				jar.getTotalValue();
				
				break;
			}
		}
		
		return full;
	}
	
	public boolean fillWithPennys() {
		boolean full = false;
		clearJar();
		
		return full;
	}

	public boolean putPenny(int penny) {
		boolean full = false;
		
		return full;
	}

	public boolean fillWithNickels() {
		boolean full = false;
		clearJar();
		
		return full;
	}

	public boolean putNickel(int i) {
		boolean full = false;
		
		return full;
	}

	public boolean fillWithDimes() {
		boolean full = false;
		clearJar();
		
		return full;
	}

	public boolean putDime(int i) {
		boolean full = false;
		
		return full;
	}

	public boolean fillWithQuarters() {
		boolean full = false;
		clearJar();
		
		return full;	
	}

	public boolean putQuarter(int i) {
		boolean full = false;
		
		return full;	
	}

	public boolean fillWithHalfDollars() {
		boolean full = false;
		clearJar();
		
		return full;
	}

	public boolean putHalfDollar(int i) {
		boolean full = false;
		
		return full;	
	}

	public boolean fillWithDollars() {
		boolean full = false;
		clearJar();
		
		return full;
	}

	public boolean putDollar(int i) {
		boolean full = false;
		
		return full;	
	}

}
