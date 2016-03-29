package hO5;

import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;



public class Opdracht4_4 extends Applet {

public void init() { 
	setBackground(Color.white);
	setSize(720,360);

}
	
	
public void paint (Graphics g) {
	
	g.setColor(Color.red);
	g.drawString("Jeroen: 100 kg",10,260);
	g.setColor(Color.blue);
	g.drawString("Hans: 80 kg",10,280);
	g.setColor(Color.yellow);
	g.drawString("Valerie: 40 kg",10,300);
	
	g.setColor(Color.BLACK);
	g.drawRect(140, 50, 0, 200);
	g.setColor(Color.BLACK);
	g.drawRect(140, 250, 200, 0);
	
	//Jeroen
	g.setColor(Color.red);
	g.fillRect(150,100,25,150);
	g.setColor(Color.BLACK);
	g.drawRect(150,100,25,150);
	
	//Hans
	g.setColor(Color.blue);
	g.fillRect(190,130,25,120);
	g.setColor(Color.BLACK);
	g.drawRect(190,130,25,120);
	
	//Valerie
	g.setColor(Color.yellow);
	g.fillRect(230,185,25,65);
	g.setColor(Color.BLACK);
	g.drawRect(230,185,25,65);
	
	g.drawString("120", 110, 85);
	g.drawString("100", 110, 110);
	g.drawString("80", 110, 135);
	g.drawString("60", 110, 165);
	g.drawString("40", 110, 195);
	g.drawString("20", 110, 225);
	g.drawString("0", 110, 255);
	
	
}   

}