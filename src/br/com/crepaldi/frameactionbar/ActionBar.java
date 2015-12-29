package br.com.crepaldi.frameactionbar;

import java.awt.Color;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;

import br.com.crepaldi.frameactionbar.elements.IconBack;
import br.com.crepaldi.frameactionbar.elements.IconMore;
import br.com.crepaldi.frameactionbar.elements.MenuNavigation;
import br.com.crepaldi.frameactionbar.elements.MyPanel;
import br.com.crepaldi.frameactionbar.elements.ShadowAB;
import br.com.crepaldi.frameactionbar.elements.Title;
import br.com.crepaldi.frameactionbar.interfaces.ABInterface;
import br.com.crepaldi.frameactionbar.objects.MyComponentListener;

public class ActionBar implements ABInterface {
	
	private JFrame jFrame;
	private MyPanel myPanel;
	private IconMore iconMore;
	private IconBack iconBack;
	private Title title;
	private ShadowAB panelShadow;
	public MenuNavigation menuNavigation;
	
	public static int LIGHT = 0;
	public static int DARK = 1;

	
	public ActionBar(JFrame jFrame){
		this.jFrame = jFrame;

		// Cria os componentes que fazem parte da ActionBar
		myPanel = new MyPanel(this);
		title = new Title(this);
		iconMore = new IconMore(this);
		menuNavigation = new MenuNavigation(this);
		panelShadow = new ShadowAB(this);
        

		// Adiciona um ouvinte que alinha os componentes ao redimensiona a janela
		jFrame.addComponentListener(new MyComponentListener(jFrame, this));
	}

	public ShadowAB getShadow() {
		return panelShadow;
	}
	
	public IconBack getIconBack(){
		return iconBack;
	}
	
	public void addIconBack() {
		iconBack = new IconBack(this);
	}
	
	public Title getTitleView() {
		return title;
	}
	public String getTextTitle(){
		return title.getTextTitle();
	}
	
	public void setTitle(String str){
		title.setTitle(str);
	}
	
	public JFrame getJFrame(){
		return jFrame;
	}
	
	public MyPanel getPanel(){
		return myPanel;
	}

	public IconMore getIconMore(){
		return iconMore;
	}
	
	public void setBackgroundColor(Color color){
		myPanel.setBackgroundColor(color);
	}
	
	public JFrame getFrameContext(){
		return jFrame;
	}
	
	public void setIconMore(String imagePath){
		iconMore.setImage(imagePath);
	}
	
	public void setHeight(int height){
		myPanel.setHeight(height);
	}
	
	public int getHeight(){
		return myPanel.getHeight();
	}
	
	public int getWidth(){
		return myPanel.getWidth();
	}
	
	public void setTheme(int theme){
		iconMore.setTheme(theme);
		iconBack.setTheme(theme);
		title.setTheme(theme);
	}
	
	public void show(){
		myPanel.add(iconMore);
		myPanel.add(title);
		jFrame.add(myPanel);
		myPanel.add(panelShadow);
		jFrame.add(menuNavigation);
	}
	
	@Override
	public void setOnClickIconMenu(MouseAdapter mouseAdapter) {
		iconBack.addMouseListener(mouseAdapter);
		
		//menuNavigation.open();
	}
}
