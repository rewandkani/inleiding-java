package hO5;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht4_5 extends Applet {

	
public void init () {
setBackground(Color.blue);
setSize(720,360);

}


public void paint (Graphics g) {
	g.setColor(Color.yellow);
	g.drawOval(550,100,250,100);
	g.drawArc(550, 100,250,100, 90, 82);
	g.fillArc(550, 100,250,100, 90, 82);

}
}
