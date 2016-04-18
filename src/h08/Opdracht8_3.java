package h08;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

		
	public class Opdracht8_3 extends Applet	{
	private static final long serialVersionUID = 1L;
	
	double antwoord;	
	Button plus;
	Button min;
	Button keer;
	Button gedeeld;
	
	TextField tekstvak;
	TextField tekstvak1;
	
	public void init()	{
		setSize(800,500);
		setBackground(Color.white);
		
		tekstvak  = new TextField ("",20);
		tekstvak1 = new TextField ("",20);
		
		plus = new Button("+");
		min = new Button("-");
		keer = new Button("*");
		gedeeld = new Button("/");
		
		
		plus.addActionListener( new plusknopListener() );
		min.addActionListener( new minknopListener() );
		keer.addActionListener( new keerknopListener() );
		gedeeld.addActionListener( new gedeeldknopListener() );
		
		
	
		add(tekstvak);
		add(tekstvak1);
		
		add(plus);
		add(min);
		add(keer);
		add(gedeeld);
		
		
	}
	
	
	public void paint (Graphics g){
		
		int x = 50;
		int y =70;
		g.drawString("" + antwoord,x,y);
		
				
	}
		
	class plusknopListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
			double imput1 = Double.parseDouble(tekstvak.getText());
			double imput2 = Double.parseDouble(tekstvak1.getText());
			antwoord=imput1+imput2;
			repaint();
	        }	
		}
	
	class minknopListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double imput1 = Double.parseDouble(tekstvak.getText());
			double imput2 = Double.parseDouble(tekstvak1.getText());
			antwoord=imput1-imput2;
		repaint();
        }	
	}
	class keerknopListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double imput1 = Double.parseDouble(tekstvak.getText());
			double imput2 = Double.parseDouble(tekstvak1.getText());
			antwoord=imput1*imput2;
		repaint();	
        }	
	}
	
	class gedeeldknopListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double imput1 = Double.parseDouble(tekstvak.getText());
			double imput2 = Double.parseDouble(tekstvak1.getText());
			antwoord=imput1/imput2;
		repaint();
        }	
	}
	
	
}