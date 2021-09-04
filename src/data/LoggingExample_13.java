package data;

import org.apache.log4j.Logger;

public class LoggingExample_13 {

	public static void main(String[] args) {
		
		Logger a = Logger.getLogger("devpinoyLogger");
		a.debug("Hello"); //system.out.println();
		a.debug("We are writing in to a log file");
		a.debug("Starting the test case xyz test");
		a.debug("Starting the test case xyz test1");
	}

}
