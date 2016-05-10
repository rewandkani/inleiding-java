package h10;


import java.applet.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Opdracht10_4 extends Applet {
	TextField tekstvak;
	Label label;
	String s,tekst; 
	int jaren;
	public void init(){
		setSize(500,500);
		tekstvak = new TextField ("",20);
		label = new Label ("typ jaartal");
		tekstvak.addActionListener( new TekstvakListener() );
		tekst = "";
		
		add(label);
		add(tekstvak);
		
	}
	
	public void paint (Graphics g){
		
		
		 g.drawString(tekst, 50, 60 );
		
	}
	
    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            jaren = Integer.parseInt( s);
            if ( (jaren % 4 == 0 && !(jaren % 100 == 0)) || 
            		jaren % 400 == 0 ) {
                tekst = ""+ jaren + " is een schrikkeljaar";
            }
            else {
                tekst = ""+ jaren + " is geen schrikkeljaar";
            }
            repaint();
        }
    }
}