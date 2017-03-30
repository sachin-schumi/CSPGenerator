
public class CSPGenerator {

	public static void main(String[] args) {
		String fileName = ""; // Read from command line
		InputParser parser = new InputParser();
		boolean isParsed = parser.Parse();
		
		if (false == isParsed)
		{
			// Get error
			System.err.println();
			// exit
		}
		
		InputState inputState = parser.getInputState();
		
		// given this input state generate CSP
	}

}
