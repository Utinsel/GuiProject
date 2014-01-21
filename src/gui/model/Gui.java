package gui.model;

public class Gui
{
	public Gui()
	{
		
	}
	public String LoopTestOne()
	{
		String loopResult = "";
		int timesLooped = 0;
		
		for(int loopCounter = 0; loopCounter <10; loopCounter++)
		{
			loopResult += loopCounter + ", ";
			timesLooped++;
		}
		
		loopResult += "\nThe loop executed " + timesLooped + " times" + "\nAlso I'm a GUI!!!";
		
		return loopResult;
	}
	
	public String LoopTestTwo()
	{
		String loopResult = "";
		
		
		return loopResult;
	}
}
