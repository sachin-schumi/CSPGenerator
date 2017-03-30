class AgentParser
{
	public boolean Parse()
	{
		return true;
	}
}

public class InputParser {
	public boolean Parse()
	{
		// Parse agent
		// Parse message type
		String line = "";
		
		switch(line)
		{
			case Constants.Agent:
				break;
			case Constants.MessageType:
				break;
		}
		
		return true;
	}
	
	public String getError()
	{
		String error = "";
		return error;
	}
	
	public InputState getInputState()
	{
		InputState inputState = new InputState();
		
		return inputState;
	}
}
