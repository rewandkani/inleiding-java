package h06;


import java.applet.*;
import java.awt.*;

	

	
	public class Opdracht6_4 extends Applet {

		
		int gemiddelde = (int) ((5.9+6.3+6.9)/3*10);
		double einde = (double) gemiddelde/10;
		
		

	public void init() { 
		
		setBackground(Color.white);

	}

	public void paint (Graphics g) {
		int x = 50;
		int y =70;
		
		g.drawString("test " + einde, 100, 100);
		
	g.drawString("het gemiddelde is : "+(double)	(int)	(	(5.9+6.3+6.9)	/3*10)	/10 ,x,y);

	}
	
}
