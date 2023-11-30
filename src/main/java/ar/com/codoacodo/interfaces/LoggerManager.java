package ar.com.codoacodo.interfaces;

public class LoggerManager {
	
	public static ILogger getLogger(String target) {
		
		ILogger logger;
		
		switch (target) {
		
			case "A":
				logger = new SMSLogger();
				break;
			case "B": 
				logger = new FSLogger();
				break;
			case "C": 
				logger = new EmailLogger();
				break;
			default:
				logger = null;
		}
		return logger;
	}
}
