package br.com.crepaldi.frameactionbar;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import br.com.crepaldi.sample.Principal;

public class IconMore {
	
	private JLabel iconMoreVert;
	
	public IconMore(ActionBar actionBar, Principal principal){
		
		iconMoreVert = new JLabel("");
		iconMoreVert.setIcon(new ImageIcon(Principal.class.getResource("/br/com/crepaldi/frameactionbar/icons/ic_more_vert_white_36dp.png")));
		iconMoreVert.setBounds(principal.getWidth()-50, 0, 30, actionBar.getHeight());
		iconMoreVert.setBackground(Color.decode("#c1c1c1"));
		principal.add(iconMoreVert);	
	}
	
	public void setImage(String imagePath){
		iconMoreVert.setIcon(new ImageIcon(Principal.class.getResource(imagePath)));
	}
}
