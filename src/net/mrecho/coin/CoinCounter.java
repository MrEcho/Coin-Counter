package net.mrecho.coin;

import net.mrecho.coin.coins.Coin;
import net.mrecho.coin.coins.CoinTypes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CoinCounter {

	private static Logger logger = null;
	
	public static void main(String[] args) {
		
		logging();

		Jar coinjar = new Jar(logger);
		
		SlotMachine machine = new SlotMachine(logger, coinjar);
		
		RunTests(machine);
	}
	
	/**
	 * Testing all the different types of {@link constants.Coins} that are possible
	 * @param machine
	 */
	private static void RunTests(SlotMachine machine) {
		
		machine.fill(new Coin(CoinTypes.Penny));
		
		machine.fill(new Coin(CoinTypes.Nickel));
		
		machine.fill(new Coin(CoinTypes.Dime));
		
		machine.fill(new Coin(CoinTypes.Quarter));
		
		machine.fill(new Coin(CoinTypes.HalfDollar));
		
		machine.fill(new Coin(CoinTypes.Dollar));
		
		machine.randomFill();
		
	}


	/**
	 * Setup basic logging for the whole system
	 */
	private static void logging(){

		System.setProperty("log4j.configurationFile", "./libs/log4j2.xml");
		
		logger = LogManager.getRootLogger();
		
	}

}
