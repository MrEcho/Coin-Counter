package net.mrecho.coin;

import java.util.ArrayList;

import net.mrecho.coin.coins.CoinTypes;
import net.mrecho.coin.coins.types.*;

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
		
		machine.fill(new Penny());
		
		machine.fill(new Nickel());
		
		machine.fill(new Dime());
		
		machine.fill(new Quarter());
		
		machine.fill(new HalfDollar());
		
		machine.fill(new Dollar());
		
		ArrayList<CoinTypes> coins = new ArrayList<CoinTypes>();
		coins.add(new Penny());
		coins.add(new Nickel());
		coins.add(new Dime());
		coins.add(new Quarter());
		coins.add(new HalfDollar());
		coins.add(new Dollar());
		
		machine.randomFill(coins);
		
	}


	/**
	 * Setup basic logging for the whole system
	 */
	private static void logging(){

		System.setProperty("log4j.configurationFile", "./libs/log4j2.xml");
		
		logger = LogManager.getRootLogger();
		
	}

}
