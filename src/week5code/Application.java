package week5code;

public class Application {

	public static void main(String[] args) {
		
		//create new instances for Logger with the class AstriskLogger and SpacedLogger
		Logger logger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
		//test the Logger and SpacedLogger methods
		logger.Log("hello");
		logger.Error("to bad");
		
		spacedLogger.Log("trythis");
		spacedLogger.Error("bad code");
	}

}
