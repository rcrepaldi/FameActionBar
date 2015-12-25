package br.com.crepaldi.frameactionbar.elements;

import javax.naming.Context;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class IconBack extends JLabel{
	
	private ActionBar actionBar;
	
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
		ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_white_24dp.png"));
		this.setIcon(imageIcon);
		this.setBounds(10, 0, 30, actionBar.getHeight());
		
		actionBar.getTitleComponent().setMarginLeft(40);
		
		actionBar.getPanel().add(this);
	}
}
