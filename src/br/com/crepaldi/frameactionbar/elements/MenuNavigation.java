package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class MenuNavigation extends JPanel {

	public MenuNavigation(ActionBar actionBar){

		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

            	int panelLength = 200;

                setBounds(-panelLength+3, actionBar.getHeight(), panelLength, actionBar.getJFrame().getHeight() - actionBar.getHeight());
                setBackground(new Color(64, 64, 64, 70));
                actionBar.getFrameContext().add(MenuNavigation.this);
                actionBar.getFrameContext().setVisible(true);

            }
        });
	}
	
	
}
