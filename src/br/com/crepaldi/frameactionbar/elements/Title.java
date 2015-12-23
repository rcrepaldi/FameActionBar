package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class Title extends JLabel {

	private String title = "Insert the title";
	
	public Title(ActionBar actionBar){
		super();
		
		this.setText(title);
		this.setForeground(Color.WHITE);
		this.setVerticalAlignment(SwingConstants.CENTER);
		this.setFont(new Font("Roboto", Font.BOLD, 14));
		this.setBounds(20, 0, actionBar.getWidth(), actionBar.getPanel().getHeight());
				
	}

	public Title getTitleComponent() {
		return this;
	}

	public void setTitle(String str){
		this.setText(str);
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTheme(int theme){
		if (theme == ActionBar.DARK) {
			this.setForeground(Color.BLACK);
		} else {
			this.setForeground(Color.WHITE);
		}
	}
}
