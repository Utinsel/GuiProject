package gui.view;

import gui.controller.GuiController;

import javax.swing.JFrame;

/**
 * Main GUI Framework for the Loop Project.
 * @author Berry Echols
 * @version 1.2 11/5/13 Added documentation and supporting methods.
 */
public class GuiFrame extends JFrame
{
	/**
	 * The referenced controller object.
	 */
	private GuiController baseController;
	/**
	 * The applications main panel for GUI.
	 */
	private GuiPanel basePanel;
	
	/**
	 * Creates a GuiFrame object with a linked GuiController for the MVC paradigm 
	 * @param baseController The referring controller.
	 */
	public GuiFrame(GuiController baseController)
	{
		this.baseController = baseController;
		basePanel = new GuiPanel(baseController);
		
		setupFrame();
	}
	
	/**
	 * Sets the content, size and visibility of the frame.
	 */
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500, 500);
		this.setVisible(true);
	}
}
