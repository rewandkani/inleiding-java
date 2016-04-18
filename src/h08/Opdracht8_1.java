package h08;

import java.awt.Graphics;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.*;

	
public class Opdracht8_1 extends Applet	{
private static final long serialVersionUID = 1L;

																			
		Button Knop;
		String schermtekst;

	public void init()	{
		setBackground(Color.white);
		setSize(800,500);
		
		schermtekst = "doet deze knop wel ?";
																		
		Knop = new Button("klik op mij");
		KnopListener kl = new KnopListener();
        Knop.addActionListener(kl);
																			
		add (Knop);
		
		

	}
	
	
	public void paint (Graphics g){
		int x = 50;
		int y =70;
		
		g.drawString(schermtekst, x, y);
			
	}
	
	class KnopListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			schermtekst = "ja,deze knop doet wel";
			repaint();
		}
		
		
	}
	
	
}
