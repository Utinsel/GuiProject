package gui.view;

import gui.controller.GuiController;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;

/**
 * Panel for the Gui Project.
 * @author Berry Echols
 * @version 1.3 11/5/13 Basic framework, setupPanel, setupListeners, setupLayout methods
 */
public class GuiPanel extends JPanel
{
	private GuiController baseController;
	private SpringLayout baseLayout;
	private JTextArea loopTextArea;
	private JButton submitButton;
	private JScrollPane textPane;
	
	/**
	 * Creates a GuiPanel object linked via the controller for MVC paradigm
	 * @param baseController The linked controller object.
	 */
	public GuiPanel(GuiController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		loopTextArea = new JTextArea(10,20);
		textPane = new JScrollPane(loopTextArea);
		submitButton = new JButton("Click me. I dare you.");

		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	
	/**
	 * Adds all components to the panel, sets color and component settings. 
	 */
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(new Color(20, 150, 80));
		this.add(submitButton);
		this.add(textPane);
		
		loopTextArea.setWrapStyleWord(true);
		loopTextArea.setLineWrap(true);
		loopTextArea.setEditable(false);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, submitButton, 69, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, submitButton, 38, SpringLayout.EAST, textPane);
		baseLayout.putConstraint(SpringLayout.NORTH, textPane, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textPane, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textPane, 156, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textPane, 235, SpringLayout.WEST, this);
	}
	
	private void setupListeners()
	{
		submitButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				loopTextArea.append(baseController.getLoopResults());
			}
		});
				
	}
}