package br.com.crepaldi.frameactionbar.elements;

import javax.naming.Context;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class IconBack extends JLabel{
	
	private ActionBar actionBar;
	private int marginTitleLeft = 40;
	
	public IconBack(ActionBar actionBar){
		super();
		this.actionBar = actionBar;
		
		initElements();

	}

	/**
	 * Instatiate componets 
	 * @param actionBar
	 */
	private void initElements(){

		// Create icone more with params default
		ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_menu_white_24dp.png"));
		this.setIcon(imageIcon);
		this.setBounds(10, 0, 30, actionBar.getHeight());
		
		actionBar.getTitleView().setMarginLeft(marginTitleLeft);
		
		actionBar.getPanel().add(this);
	}
	
	public int getMarginTitle(){
		return marginTitleLeft;
	}

	/**
	 * Set theme in icon more
	 * @param theme
	 */
	public void setTheme(int theme){
		if (theme == ActionBar.DARK) {
			this.setIcon(new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_menu_black_24dp.png")));
		} else {
			this.setIcon(new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_menu_white_24dp.png")));
		}
	}
}
