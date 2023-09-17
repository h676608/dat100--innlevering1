package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;



public class B4 {

	public static void main(String[] args) {
		String bruttoLonn = showInputDialog("Oppgi bruttolønn: ");
		int brutto = parseInt(bruttoLonn);
		double trinn1 = 0.017;
		double trinn2 = 0.04;
		double trinn3 = 0.134;
		double trinn4 = 0.164;
		double trinn5 = 0.174;
		
		
		
				
				if(brutto >= 0 &&  brutto < 190350) {
					System.out.println("inntekten tillsier at du slipper å betale trinnskatt: ");
				}else if (brutto >= 190350 && brutto <= 267899) {
						System.out.println("inntekten din tilsier at du må betale: " + (brutto*trinn1) + "kr i trinnskatt, dvs. 1,7% av bruttolonnen din");
				}else if (brutto >= 267900 && brutto <=643799) {
						System.out.println("inntekten din tilsier at du må betale: " + (brutto*trinn2) + "kr i trinnskatt, dvs. 4% av bruttolonnen din");
				}else if (brutto >= 643800 && brutto <= 969199 ) {
					System.out.println("inntekten din tilsier at du må betale: " + (brutto*trinn3) + "kr i trinnskatt, dvs. 13,4% av bruttolonnen din");
				}else if (brutto >= 969200 && brutto <= 1999999) {
						System.out.println("inntekten din tilsier at du må betale: " + (brutto*trinn4) +  "kr i trinnskatt, dvs. 16,4% av bruttolonnen din");
				}else if (brutto >= 2000000) {
					
						System.out.println("inntekten din tilsier at du må betale: " + (brutto*trinn5) + "kr i trinnskatt, dvs. 17,4% av bruttolonnen din");
}


					
										
					
					
				
}	
}	
