package br.com.crepaldi.sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;

@SuppressWarnings("serial")
public class Teste extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teste frame = new Teste();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Teste() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label = new JLabel("MEU MENU");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(359, 6, 85, 16);
		contentPane.add(label);
		
		JLabel lblRodrigo = new JLabel("Rodrigo");
		lblRodrigo.setFont(new Font("Roboto", Font.BOLD, 13));
		lblRodrigo.setBackground(Color.BLUE);
		lblRodrigo.setForeground(Color.RED);
		lblRodrigo.setBounds(383, 34, 61, 115);
		contentPane.add(lblRodrigo);

		
	}
}
