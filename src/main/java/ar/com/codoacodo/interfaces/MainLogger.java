package ar.com.codoacodo.interfaces;

public class MainLogger {
	
	public static void main(String[] args) {
		
		
		ILogger[] loggers = new ILogger[3];
		loggers[0] = LoggerManager.getLogger("A");
		loggers[1] = LoggerManager.getLogger("B");
		loggers[2] = LoggerManager.getLogger("C");
		
		
		String target = getTargetFromDB();
		
		ILogger logger = LoggerManager.getLogger(target);
		
		logger.log();
	}
	
	public static String getTargetFromDB() {
		return "B"; 
	}
}
