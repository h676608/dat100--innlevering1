package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

public class B5 {

	public static void main(String[] args) {
		int repitisjoner = 10;
		
		for (int i = 1; i<=repitisjoner; i+=1) {
			String poengsum = showInputDialog("din poengsum: ");
		
		
		int poeng = parseInt(poengsum);
		
		if (poeng > 100 || poeng < 0 ) {
			System.out.println("dette er ikke en gyldig poengsum, prøv igjen "); 
			repitisjoner += 1;
		}else if (poeng >= 0 && poeng <=39) {
			System.out.println("karakter F");
		}else if (poeng >= 40 && poeng <=49) {
				System.out.println("karakter E ");
		}else if (poeng >= 50 && poeng <=59) {
			System.out.println("karakter D");
		}else if (poeng >=60 && poeng <=79) {
			System.out.println("karakter C");
		}else if (poeng >=80 && poeng <=89) {
			System.out.println( "karakter B");
		}else if ( poeng >= 90 && poeng <=100) {
			System.out.println("karakter A");
		}else {
			
		}
			
		
		
	}
	}
}


