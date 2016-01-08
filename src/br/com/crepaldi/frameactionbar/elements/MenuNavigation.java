package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class MenuNavigation extends JPanel {

	private ActionBar actionBar;
	private int panelLength = 200;
	private boolean isOpenned;
	
	public MenuNavigation(ActionBar actionBar){
		this.actionBar = actionBar;
		this.isOpenned = false;

		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                setBounds(-panelLength+3, actionBar.getHeight(), panelLength, actionBar.getJFrame().getHeight() - actionBar.getHeight());
                setBackground(new Color(64, 64, 64, 70));
                actionBar.getFrameContext().add(MenuNavigation.this);
                actionBar.getFrameContext().setVisible(true);

            }
        });
	}

	public int getPanelHeigth(){
		return panelLength;
	}
	
	public void open() {
		setBounds(0, actionBar.getHeight(), panelLength, actionBar.getJFrame().getHeight() - actionBar.getHeight());
		isOpenned = true;
	}

	public void close() {
		setBounds(-panelLength+3, actionBar.getHeight(), panelLength, actionBar.getJFrame().getHeight() - actionBar.getHeight());
		isOpenned = false;
	}

	public boolean isOpenned() {
		return isOpenned;
	}
}
