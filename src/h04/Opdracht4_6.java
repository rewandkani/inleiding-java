package h04;

import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;


public class Opdracht4_6 extends Applet {
	
	
public void init(){
setBackground(Color.white);
setSize(720,360);

}


public void paint (Graphics g) {
	
	g.setColor(Color.black);
	g.fillRoundRect(25,25,75,175,55,55);
	g.drawRoundRect(25,25,75,175,55,55);
	
	g.setColor(Color.red);
	g.fillRoundRect(45, 40, 35, 40, 55, 55);
	g.drawRoundRect(45, 40, 35, 40, 55, 55);
	
	g.setColor(Color.orange);
	g.fillRoundRect(45, 90, 35, 40, 55, 55);
	g.drawRoundRect(45, 90, 35, 40, 55, 55);
	
	g.setColor(Color.green);
	g.fillRoundRect(45, 140, 35, 40, 55, 55);
	g.drawRoundRect(45, 140, 35, 40, 55, 55);
	
	g.setColor(Color.black);
	g.drawRect(90, 50, 0, 250);
	g.drawRect(35, 50, 0, 250);

	
}
	
}