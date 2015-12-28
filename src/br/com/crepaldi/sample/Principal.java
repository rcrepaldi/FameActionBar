package br.com.crepaldi.sample;
import java.awt.EventQueue;

import javax.naming.Context;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import br.com.crepaldi.frameactionbar.ActionBar;


@SuppressWarnings("serial")
public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Inicia a aplicação
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria o frame
	 */
	public Principal() {
		
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/** Create Frame actionBar **/
		ActionBar actionBar = new ActionBar(this);
		actionBar.addIconBack();
		//actionBar.setTheme(ActionBar.DARK);
		//actionBar.setBackgroundColor(Color.decode("#c1c1c1"));
		//actionBar.setIconMore("/br/com/crepaldi/frameactionbar/icons/ic_mode_edit_black_36dp.png");
		//actionBar.setHeight(100);
		//actionBar.setTitle("Erasmos goy!");
		actionBar.show();
		
		
		
		
		
		// Create icone more with params default
		final JLabel homer = new JLabel("");
		final ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/homer.png"));
		homer.setIcon(imageIcon);
		homer.setBounds(contentPane.getWidth()/2, contentPane.getHeight() /2 , getWidth(), getHeight());
		homer.setHorizontalAlignment(SwingConstants.CENTER);
		add(homer);

	}
}
