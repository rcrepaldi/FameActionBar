package br.com.crepaldi.sample;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.crepaldi.frameactionbar.ActionBar;


@SuppressWarnings("serial")
public class Principal extends JFrame {

	private JPanel contentPane;
	//private JLabel homer;

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
		//actionBar.setTitle("write new tittle");
		actionBar.show();
		
		/** Callback event click icon menu **/
		actionBar.setOnClickIconMenu(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				
				System.out.println("Clicou Icone");
				
				if(actionBar.getMenuNavigation().isOpenned())
					actionBar.getMenuNavigation().close();
				else
					actionBar.getMenuNavigation().open();
			}
		});
		
		
		/*
		// Create icone more with params default
		homer = new JLabel("");
		ImageIcon imageIcon = new ImageIcon(Context.class.getResource("/br/com/crepaldi/frameactionbar/icons/homer.png"));
		homer.setIcon(imageIcon);
		homer.setBounds(contentPane.getWidth()/2, contentPane.getHeight() /2 , getWidth(), getHeight());
		homer.setHorizontalAlignment(SwingConstants.CENTER);
		add(homer);
		*/


		/*		
		int panelLength = 150;
		JPanel menuPanel = new JPanel();
		menuPanel.setBounds(-panelLength+3, actionBar.getHeight(), panelLength, getHeight() - actionBar.getHeight());
		menuPanel.setBackground(new Color(64, 64, 64, 70));
		add(menuPanel);

		Animation animation = new Animation(menuPanel);
		actionBar.getIconBack().addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent event) {
				menuPanel.setBackground(new Color(64, 64, 64));
				animation.animationStartSlide();
			}
		});
		*/
	}
}
