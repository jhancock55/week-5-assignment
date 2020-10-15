package week5code;

public class SpacedLogger implements Logger {

	// method to use logInfo
	public void Log(String logInfo) {
		System.out.println(spacedString(logInfo));
	}

	// method to use errorInfo
	public void Error(String errorInfo) {
		System.out.println("ERROR:" + spacedString(errorInfo));
	}

	//method to add spaces between characters in a string
	public String spacedString(String info) {

		StringBuilder spaceString = new StringBuilder();

		for (int i = 0; i < info.length(); i++) {
			spaceString.append(info.charAt(i));
			spaceString.append(" ");
		}
		return (spaceString.toString());
	}
}
