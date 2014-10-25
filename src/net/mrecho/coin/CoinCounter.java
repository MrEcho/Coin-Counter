package net.mrecho.coin;

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
		
		machine.fillWithPennys();
		machine.putPenny(100, true);
		
		machine.fillWithNickels();
		machine.putNickel(100, true);
		
		machine.fillWithDimes();
		machine.putDime(100, true);
		
		machine.fillWithQuarters();
		machine.putQuarter(100, true);
		
		machine.fillWithHalfDollars();
		machine.putHalfDollar(100, true);
		
		machine.fillWithDollars();
		machine.putDollar(100, true);
		
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
