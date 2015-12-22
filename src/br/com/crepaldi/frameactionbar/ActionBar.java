package br.com.crepaldi.frameactionbar;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.crepaldi.sample.MyComponentListener;
import br.com.crepaldi.sample.Principal;

public class ActionBar {
	
	private Principal principal;
	private int height;
	private JPanel panel;
	private Color color;
	
	public ActionBar(Principal principal){
		this.principal = principal;
		
		panel = new JPanel();
		height = 45;
		color = Color.decode("#2196F3");
		
		System.out.println("heigth " + getHeight());
	
		JLabel iconMoreVert = new JLabel("");
		iconMoreVert.setIcon(new ImageIcon(Principal.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_white_24dp.png")));
		iconMoreVert.setBounds(principal.getWidth()-50, 0, 30, getHeight());
		iconMoreVert.setBackground(Color.decode("#c1c1c1"));
		principal.add(iconMoreVert);
		
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
