package br.com.crepaldi.frameactionbar.objects;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JFrame;

import br.com.crepaldi.frameactionbar.ActionBar;

public class MyComponentListener implements ComponentListener {

	private JFrame jFrame;
	private ActionBar actionBar;
	
	public MyComponentListener(JFrame jFrame, ActionBar actionBar) {
		this.jFrame = jFrame;
		this.actionBar = actionBar;
	}

	@Override
	public void componentResized(ComponentEvent e) {
		
		// Update width actionBar background
		actionBar.getPanel().setBounds(0, 0, jFrame.getWidth(), actionBar.getPanel().getHeight());
		
		// Update position IconMore
		actionBar.getIconMore().setBounds(jFrame.getWidth()-50, 0, 30, actionBar.getPanel().getHeight());
		
		actionBar.getTitleComponent().setBounds(20, 0, actionBar.getWidth(), actionBar.getHeight());
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}
