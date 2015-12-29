package br.com.crepaldi.frameactionbar.elements;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Animation {

    private JPanel panel;
    private int slide;

    public Animation(JPanel panel){
	    this.panel = panel;

    }

    public void animationStartSlide(){
    	
    	slide = -panel.getWidth()+3;

		Timer timer = new Timer(10, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	        	SwingUtilities.invokeLater(new Runnable() {
	                @Override
	                public void run() {
	                	System.out.println("slide - " + slide);

	    	        	if(slide < 0){
	    	        		panel.setLocation(slide, panel.getY());
	    	        	}else{ 
	    	        		((Timer)e.getSource()).stop();
	    	        	}
	    	        	
	            		slide+=4;


	    	        	panel.repaint();
	                }
	            });	
	        	


	        	/*
	        	long duration = System.currentTimeMillis() - startTime;
	            double progress = (double)duration / (double)RUN_TIME;
	            
	            System.out.println("2B - " + progress);
	            
	            if (progress > 1f) {
	                progress = 1f;
	                ((Timer)e.getSource()).stop();
	            }
	            panel.setBounds(0, 50, 200, 200);
	            */

	        }
	    });
	    timer.setInitialDelay(0);
	    timer.start();

    }

}
