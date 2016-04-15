
package h06;


import java.awt.*;
import java.applet.*;



	public class Opdracht2 extends Applet {

		
		String	s;
		String	u;
		String	d;
		String	j;
		int	seconde;
		int	uur;
		int	dag;
		int jaar;
		int uitkomst;
		int uitkomst2;
		int uitkomst3;
		int uitkomst4;
		

	
	public void init() { 
		
		setBackground(Color.white);
		s	="seconde :";
		u	="uur :";
		d	="dag :";
		j	="jaar :";
		
		seconde =60;
		uur	=24;
		dag		=365;
		uitkomst = seconde * seconde ;
		uitkomst2= uitkomst * uur  ;
		uitkomst3= uitkomst2 * dag;
		uitkomst4= uitkomst3 ;
	}
	
	
	public void paint (Graphics g) {
		
		g.drawString("hoeveel seconde zit er in een jaar",50,30);
		
		int x = 50;
		int y =70;
		
		g.drawString(u+uitkomst,x, y);
		y +=20;
		g.drawString(d+uitkomst2, x, y);
		y +=20;
		g.drawString(j+uitkomst3, x, y);
		y +=20;
		
	} 
	
}
