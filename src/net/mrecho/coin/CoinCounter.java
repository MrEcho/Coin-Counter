package net.mrecho.coin;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.xml.XmlConfigurationFactory;

public class CoinCounter {

	private static Logger logger = null;
	
	public static void main(String[] args) {
		
		logging();
		logger.debug("test");

	}
	
	private static void logging(){
		
		String current = null;
		try {
			current = new java.io.File( "." ).getCanonicalPath();
			System.out.println("Current dir: "+current);
		} catch (IOException e1) { e1.printStackTrace(); }

		System.setProperty(XmlConfigurationFactory.CONFIGURATION_FILE_PROPERTY, "./libs/log4j2.xml");
		System.setProperty("log4j.configurationFile", "./libs/log4j2.xml");
		
		logger = LogManager.getRootLogger();
	}

}
