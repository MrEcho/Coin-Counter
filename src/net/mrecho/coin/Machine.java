package net.mrecho.coin;

import org.apache.logging.log4j.Logger;

import net.mrecho.coin.coins.CoinTypes;

/**
 * Low level logic of the SlotMachine
 *
 */
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
	/**
	 * This counts up all the {@link Coins} in the Jar
	 * @return <code>int</code>
	 */
	/*public int getCoinCount() {
		
		int totalCount = 0;
		
		for(Entry<Coins, Integer> coin : jar.getCoinCount().entrySet()){
			totalCount = totalCount + coin.getValue();
		}
		
		return totalCount;
	}*/

	/**
	 * @see Jar#getTotalValue
	 * @return <code>float</code>
	 */
	/*public float getTotalValue() {
		return jar.getTotalValue();
	}*/

	/**
	 * This is used to add a <code>int</code> amount of {@link Coins#coin}
	 * @param cointype {@link Coins}
	 * @param count How many Coins you want added at a time
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean addCoin(CoinTypes cointype, int count) {
		boolean full = false;
		
		if(jar.addCoin(cointype, count) == false){
			full = false;
		} else {
			full = true;
		}
		
		return full;
	}

	/**
	 * This is used to fill up the Jar with a single {@link Coins#coin}
	 * @param cointype {@link Coins}
	 * @param count How many Coins you want added at a time
	 * @return <code>true</code> or <code>false</code>
	 */
	public boolean filler(CoinTypes cointype, int count){
		boolean full = false;
		
		for(int i = 0; Integer.MAX_VALUE > i; i++){
			full = addCoin(cointype, count);
			if(full == true){
				break;
			}
		}
		
		return full;
	}
}