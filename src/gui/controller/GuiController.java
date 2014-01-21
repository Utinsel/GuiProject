package gui.controller;

import gui.model.Gui;
import gui.view.GuiFrame;

/**
 * Controller object for the Gui project.
 * @author Berry Echols
 * @version 1.0 11/5/13 Added data members and start method.
 */
public class GuiController
{
	private GuiFrame appFrame;
	private Gui myGui;
	
	public GuiController()
	{
		this.myGui = new Gui();
	}

	/**
	 * Starts the application.
	 */
	public void start()
	{
		appFrame = new GuiFrame(this);
	}
	
	public String getLoopResults()
	{
		String currentResults = myGui.LoopTestOne();
		return currentResults;
	}
}