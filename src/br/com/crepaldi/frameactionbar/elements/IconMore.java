package br.com.crepaldi.frameactionbar.elements;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.naming.Context;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class IconMore extends JLabel {
	
	private ActionBar actionBar;
	
	public IconMore(ActionBar actionBar){
		super();
		
		this.actionBar = actionBar;
		
		initElements();

		eventsComponents();
	}
	
	public Component getContextIcon(){
		return this;
	}

	public void setImage(String imagePath){
		this.setIcon(new ImageIcon(Context.class.getResource(imagePath)));
	}
	
	/**
	 * Set theme in icon more
	 * @param theme
	 */
	public void setTheme(int theme){
		if (theme == ActionBar.DARK) {
			this.setIcon(new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_black_24dp.png")));
		} else {
			this.setIcon(new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_white_24dp.png")));
		}
	}
	
	/**
	 * Instatiate componets 
	 * @param actionBar
	 */
	private void initElements(){

		// Create icone more with params default
		ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_white_24dp.png"));
		this.setIcon(imageIcon);
		this.setBounds(actionBar.getPanel().getWidth()-50, 0, 30, actionBar.getPanel().getHeight());
	}
	

	/**
	 * Events callback of click
	 */
	private void eventsComponents(){
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				System.out.println("Clicou");
			}
		});
	}
}
