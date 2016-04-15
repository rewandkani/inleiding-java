package hO6;

import java.awt.*;
import java.applet.*;

import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
	public class Opdracht6_1 extends Applet {
		String J;
		String A;
		String JE;
		String R;
		double bedrag;
		double aantalpersonen;
		double uitkomst;
 
	public void init() { 	
		setBackground(Color.white);
		setSize(1200,550);
		J	="Jan :";
		A	="Ali :";
		JE	="Jeannette :";
		R	="Rewand :";
		bedrag = 113;
		aantalpersonen = 4;
		uitkomst = bedrag / aantalpersonen ;
	}
	
	public void paint (Graphics g) {
		
		g.drawString("113 euro verdelen",50,30);	
		int x = 50;
		int y =70;
		g.drawString(J+uitkomst, x, y);
		y +=20;
		g.drawString(A+uitkomst, x, y);
		y +=20;
		g.drawString(JE+uitkomst, x, y);
		y +=20;
		g.drawString(R+uitkomst, x, y);
		y +=20;
	}	
}
