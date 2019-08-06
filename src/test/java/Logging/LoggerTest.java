package Logging;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoggerTest {
	
	static String projectLocation = System.getProperty("user.dir");
	static String configPath = projectLocation +"/log4j.properties";
	/*
	 * initialize the logger class 
	 */
	public static final Logger logger = Logger.getLogger(LoggerTest.class.getName());
	
	@BeforeClass
	public static void getlogger() {
		System.out.println(configPath);
		// reading the property file at this stage 
		PropertyConfigurator.configure(configPath);
	}
	
	@Test
	public void testLogger() {
logger.info("testcase passed");
logger.warn("please check the warning");
logger.error("critical error");
logger.info("testcase 3 passed");

	}
	



}
