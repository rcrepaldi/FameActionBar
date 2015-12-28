package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;

import javax.swing.JPanel;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class MyPanel extends JPanel{
	
	private ActionBar actionBar;
	private Color color = Color.decode("#2196F3");
	private int height = 45;
	
	public MyPanel(ActionBar actionBar){
		super();
		
		this.actionBar = actionBar;
		
		// Create a panel background with params default
		this.setBackground(color);
		this.setBounds(0, 0, actionBar.getFrameContext().getWidth(), height);
		this.setLayout(null);

		// TODO shadow actionbar
		/*
		JPanel panelShadow = new JPanel();
		panelShadow.setBounds(0, this.getHeight(), this.getWidth(), 10);
		panelShadow.setBackground(Color.DARK_GRAY);
		actionBar.getFrameContext().add(panelShadow);
		
		JLabel labelShadow = new JLabel();
		ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/shadow_actionbar.png"));
		labelShadow.setIcon(imageIcon);
		this.setBounds(0, this.getHeight(), this.getWidth(), 10);
		*/
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
		actionBar.getTitleView().update();
	}

	public int getHeight(){
		return height;
	}
}
