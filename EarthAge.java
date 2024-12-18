package EarthAge;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class EarthAge {

	public static void main(String[] args) {
	
	
//	1. Use meaningful variable names. Example: instead of using M for mercury, I would 
//	use mercuryAge. 
//	2. Use FINALs for 365, 88, 225, 4380 and 10757. 
//	3. Format the output to two decimal places using the String.format statement. 
//	4. Make sure to document your program (comments) anywhere that is appropriate. 
//	5. Important: Must use Input and output dialog boxes. Not the console. 
	
	
	
//	Mercury      88 
//	Venus      225 
//	Jupiter      4380 
//	Saturn     10767 
	
	
	
	/* 𝑃𝑙𝑎𝑛𝑒𝑡 𝑌 𝑎𝑔𝑒= 𝐴𝑔𝑒 𝑜𝑛 𝐸𝑎𝑟𝑡ℎ × 365/d */
	
	
 double MyAgeOnEarth;
 
 final int daysMercury = 88;
  final int daysVenus = 225;
  final int daysJupiter = 4380;
final int daysSaturn = 10760;

//Integer.parseInt(ageString);
String ageString =
JOptionPane.showInputDialog("Enter age on Eath:");

MyAgeOnEarth =  Integer.parseInt(ageString);
// calculate age on planets
double ageMercury = MyAgeOnEarth*365/daysMercury;
double ageVenus = MyAgeOnEarth*365/daysVenus;
double ageJupiter = MyAgeOnEarth*365/daysJupiter;
double ageSaturn = MyAgeOnEarth*365/daysSaturn;


System.out.println("Your age on Mercury is:"
		+ " " + String.format("%.2f", ageMercury));
System.out.println("Your age on Venus is:"
		+ " " + String.format("%.2f", ageVenus));
System.out.println("Your age on Jupiter is:"
		+ " " + String.format("%.2f", ageJupiter));
System.out.println("Your age on Saturn is:"
		+ " " + String.format("%.2f", ageSaturn));










 
	
	
	
	
	
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
