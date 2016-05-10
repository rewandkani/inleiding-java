package h10;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Opdracht10_5 extends Applet {
	double cijfer;
	int klik;
	Button knop;
	TextField tekstvak;
	String O;
	
	public void init()	{
		knop = new Button ("Ok");
		knop.addActionListener(new knoplistener());
		tekstvak = new TextField("typ een getal",20);
		
		add(knop);
		add(tekstvak);
		
		
		
	}
	
	public void paint (Graphics g){
		int x = 50;
		int y = 80;
		g.drawString(""+O, x, y);
		y+=20;
		g.drawString("gemiddelde is "+cijfer/klik , x, y);
		y+=20;
		if(cijfer/klik < 5.5) g.drawString("gezakt",x,y);
		else g.drawString("Geslaagd",x,y);
	}
	
	 class knoplistener implements ActionListener {
	        public void actionPerformed(ActionEvent e) {
	            double getal = Double.parseDouble(tekstvak.getText());
	            if ( getal > 0 && getal < 11){
	            	if(getal < 5.5 ) O="onvoldoende";
	            	else O="voldoende";
	            	cijfer+=getal;
	            	klik++;
	            	
	            }
	            	
	            repaint();
	        }
	    }
	
	
	
	
}