package h08;


import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Opdracht8_2 extends Applet {

	
	Button mButton;
	Button vButton;
	Button mlButton;
	Button vlButton;
	int man;
	int vrouw;
	int vrouwL;
	int manL;
	int totaal;
	

public void init() { 
setBackground(Color.white);
setSize(1200,550);

	mButton	= new Button("Man");
			add(mButton);
			
			Manknopluisteraar mkl = new Manknopluisteraar();
			mButton.addActionListener(mkl);
			
			
			
					
	vButton	= new Button("Vrouw");
			add(vButton);
			vButton.addActionListener(new Vrouwknopluisteraar());
			
			
			
			
	mlButton = new Button("Man LL");
			add(mlButton);
			mlButton.addActionListener(new ManLknopluisteraar());
			
	vlButton = new Button("Vrouw LL");
			add(vlButton);
			vlButton.addActionListener(new VrouwLknopluisteraar());
			
	man = 0;
	vrouw = 0;
	vrouwL = 0;
	manL = 0;
	totaal = 0;
	
	
			
			
}



public void paint (Graphics g) {
	
	int x = 50;
	int y =70;
	g.drawString("aantal mannen: "+ man ,x,y);
	y +=20;
	
	g.drawString("aantal vrouwen: "+ vrouw ,x,y);
	y +=20;
	
	g.drawString("aantal mannelijke leerlingen: "+ manL ,x,y);
	y +=20;
	
	g.drawString("aantal vrouwlijke leerlingen: "+ vrouwL ,x,y);
	y +=20;
	
	
	
	
	
	

}
	
class Manknopluisteraar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			man++;
			totaal++;
			repaint();

		}
		
}
class Vrouwknopluisteraar implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				vrouw++;
				totaal++;
				repaint();
			}
}
		
class ManLknopluisteraar implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				manL++;
				totaal++;
				repaint();
			}
}
		
class VrouwLknopluisteraar implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				vrouwL++;
				totaal++;
				repaint();
			}
}
		
}
