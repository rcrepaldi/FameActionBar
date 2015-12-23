package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;

import javax.swing.JPanel;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	
	private Color color = Color.decode("#2196F3");
	private int height = 45;
	
	public MyPanel(ActionBar actionBar){
		super();
		
		// Create a panel background with params default
		this.setBackground(color);
		this.setBounds(0, 0, actionBar.getFrameContext().getWidth(), height);
		this.setLayout(null);
	}

	public void setBackgroundColor(Color color){
		this.color = color;
		this.setBackground(color);
	}
	
	public Color getBackgroundColor(){
		return color;
	}
	
	public void setHeight(int height){
		this.height = height;
	}

	public int getHeight(){
		return height;
	}
}
