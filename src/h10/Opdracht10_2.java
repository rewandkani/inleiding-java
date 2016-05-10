package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;



		
	public class Opdracht10_2 extends Applet	{
	private static final long serialVersionUID = 1L;
	int grootstegetal;
	int	kleinstegetal;
	Button ok;
	TextField tekstvak;
	
	
	public void init()	{
		setSize(800,500);
		setBackground(Color.white);
		
		ok = new Button	("OK");
		tekstvak = new TextField("");
		
		ok.addActionListener(new oklistener());
		
		add(tekstvak);
		add(ok);
		
	}
	
	
	public void paint (Graphics g){
		
		int x = 50;
		int y =70;
		g.drawString(kleinstegetal+" is kleiner dan "+grootstegetal,x,y);

		
				
	}
		
	class oklistener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
		int getal = Integer.parseInt(tekstvak.getText());
		if (getal > kleinstegetal) { grootstegetal = getal; }
		else kleinstegetal = getal;
		repaint();
        }	
	}
	
}