package br.com.crepaldi.frameactionbar.elements;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import br.com.crepaldi.frameactionbar.ActionBar;

@SuppressWarnings("serial")
public class ShadowAB extends JPanel {
	
	public ShadowAB(ActionBar actionBar){
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = actionBar.getJFrame();
                ShadowAB panel = new ShadowAB(actionBar);
                panel.setBounds(0, actionBar.getHeight(), actionBar.getFrameContext().getWidth(), 6);
                frame.add(panel);
                //frame.setLocationRelativeTo(null);
                //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });	
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        Color color1 = new Color(154,154,154);
        Color color2 = new Color(154,154,154,00); // (R, G, B, ALPHA)
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
    }
}
