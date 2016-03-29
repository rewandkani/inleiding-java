package h04;


import java.applet.*;
import java.awt.color.*;
import java.awt.Color;
import java.awt.Graphics;



public class Opdracht4_Praktijkopdracht extends Applet {

public void init() { 
	setBackground(Color.white);
	setSize(1200,550);
	

}


public void paint (Graphics g) {
		
	g.setColor(Color.blue);
	
	g.drawRect(25,50,200,0);
	
	g.drawRect(25,100,200,100);
	
	g.drawRoundRect(25,250,200,100,10,10);
	
	g.drawRect(250,100,250,100);
	g.fillRect(250,100,250,100);
	
	g.setColor(Color.white);
	g.drawOval(250,100,250,100);
	
	g.setColor(Color.blue);
	g.drawOval(250,250,250,99);
	g.fillOval(250,250,250,100);
	
	g.drawOval(550,100,250,100);
	g.drawArc(550, 100,250,100, 90, 82);
	g.fillArc(550, 100,250,100, 90, 82);
	
	g.drawOval(600,250,100,100);
}


}
