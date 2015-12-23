package br.com.crepaldi.frameactionbar.interfaces;

import javax.swing.JFrame;

public interface ABInterface {

	public JFrame getFrameContext();
	
	public void setIconMore(String imagePath);
	
	public void setHeight(int height);
	
	public int getHeight();
	
	public void setTheme(int theme);
	
	public void show();
}
