package net.mrecho.coin;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

public class CoinCounter {

	private static Logger logger = null;
	
	public static void main(String[] args) {
		
		logging();

		Jar coinjar = new Jar(logger);
		
	}
	
	private static void logging(){

		System.setProperty(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "./libs/log4j2.xml");
		System.setProperty("log4j.configurationFile", "./libs/log4j2.xml");
		
		logger = LogManager.getRootLogger();
		
	}

}
