package br.com.crepaldi.frameactionbar;

import java.awt.Color;

import javax.swing.JPanel;

import br.com.crepaldi.sample.MyComponentListener;
import br.com.crepaldi.sample.Principal;

public class ActionBar {
	
	private Principal principal;
	private int height = 45;
	private JPanel panel;
	private IconMore iconMore;
	private Color color = Color.decode("#2196F3");;
	
	public ActionBar(Principal principal){
		this.principal = principal;

		panel = new JPanel();
		iconMore = new IconMore(this, principal);
	}
	
	public void setIconMore(String imagePath){
		iconMore.setImage(imagePath);
	}
	
	public JPanel getPanel() {
		return panel;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getHeight(){
		return height;
	}
	
	public void setColor(Color color){
		this.color = color;
	}
	
	public void show(){
		
		panel.setBackground(color);
		panel.setBounds(0, 0, principal.getWidth(), getHeight());
	
		principal.addComponentListener(new MyComponentListener(principal, panel));
		
		principal.add(panel);
	}
}
