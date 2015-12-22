package br.com.crepaldi.sample;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JPanel;

public class MyComponentListener implements ComponentListener {

	private Principal principal;
	private JPanel panel;
	
	public MyComponentListener(Principal principal, JPanel panel) {
		this.principal = principal;
		this.panel = panel;
	}

	@Override
	public void componentResized(ComponentEvent e) {
		panel.setBounds(0, 0, principal.getWidth(), panel.getHeight());
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
