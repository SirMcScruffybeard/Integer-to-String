
public class Launcher {

	public static void main(String[] args) {
		
		IntToString intToString = new IntToString();
		
		intToString.promptUser();
		
		intToString.displayNumberString(intToString.toString(intToString.getInput()));
		
		intToString.close();
	}

}
