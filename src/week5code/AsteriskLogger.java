package week5code;

public class AsteriskLogger implements Logger {

	// method to print out logInfo
	public void Log(String logInfo) {
		System.out.println("***" + logInfo + "***");
	}

	// method to print out errorInfo in a box
	public void Error(String errorInfo) {
		System.out.print("**********");
		for (int i = 0; i < errorInfo.length(); i++) {
			System.out.print("*");
		}
		System.out.println("***");
		System.out.println("***ERROR: " + errorInfo + "***");
		System.out.print("**********");
		for (int i = 0; i < errorInfo.length(); i++) {
			System.out.print("*");
		}
		System.out.println("***");
	}

}
