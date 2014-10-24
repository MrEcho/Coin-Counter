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
	
	private static void RunTests(SlotMachine machine) {
		
		machine.fillWithPennys();
		machine.putPenny(100);
		
		machine.fillWithNickels();
		machine.putNickel(100);
		
		machine.fillWithDimes();
		machine.putDime(100);
		
		machine.fillWithQuarters();
		machine.putQuarter(100);
		
		machine.fillWithHalfDollars();
		machine.putHalfDollar(100);
		
		machine.fillWithDollars();
		machine.putDollar(100);
		
		machine.randomFill();
	}

	private static void logging(){

		System.setProperty("log4j.configurationFile", "./libs/log4j2.xml");
		
		logger = LogManager.getRootLogger();
		
	}

}
