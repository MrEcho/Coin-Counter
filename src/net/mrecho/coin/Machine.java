package net.mrecho.coin;

import java.util.Map.Entry;

import org.apache.logging.log4j.Logger;

import net.mrecho.coin.constants.Coins;

public class Machine {

	protected Jar jar;
	protected Logger logger;
	
	public Machine() {
		super();
	}

	public Jar getJar() {
		return this.jar;
	}

	public void clearJar() {
		this.jar.clearJar();
	}

	public int getCoinCount() {
		
		int totalCount = 0;
		
		for(Entry<Coins, Integer> coin : jar.getCoinCount().entrySet()){
			totalCount = totalCount + coin.getValue();
		}
		
		return totalCount;
	}

	public float getTotalValue() {
		return jar.getTotalValue();
	}

	public boolean addCoin(constants.Coins coin, int count) {
		boolean full = false;
		
		if(jar.addCoin(coin, count) == false){
			full = false;
		} else {
			full = true;
		}
		
		return full;
	}

	public boolean filler(constants.Coins coin, int count){
		boolean full = false;
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(coin, count);
			if(full == true){
				break;
			}
		}
		
		return full;
	}
}