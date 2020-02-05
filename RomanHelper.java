/*
 * This program takes a number and converts it into
 * a Roman numeral
 * 
 * Momin Choudhry 
 * 10/15/2019
 * Professor Ben White
 * CSC15
 *
 */

// Import scanner  
import java.util.Scanner;
// Class that will print description and convert integer to Roman numerals 
public class RomanHelper {
	// Method called description that will print what 
	// this program does and what the user has to do 
	public static void description () {
	// Print 52 asterisks 
	System.out.println("****************************************************");
	/*
	 * Let user know what he or she has to do to be able to 
	 * use this converter correctly 
	 */
	System.out.println("* Welcome to the Roman Numeral Converter!          *");
	System.out.println("* You can use this tool to convert any decimal     *");
	System.out.println("* value into a Roman Numeral. To get started       *");
	System.out.println("* please enter the how many decimal numbers you    *");
	System.out.println("* need to convert.                                 *");
	// Print another 52 asterisks
	System.out.println("****************************************************\n");	
	
	}
	/*
	 * Methods called getRoman 
	 * gets A number as a parameter and returns 
	 * a string (Roman Numeral)
	 */
	public static String getRoman (int convert) {
		// Place holder for the string Letter 
		String letter= "";
	// If int variable convert is less than or equal to 1000 
	// Run through this if statement 
	if (convert >= 1000) {
		// loop until i is not greater than 1000 while subtracting
		// 1000 from i everytime loop is ran
		for (int i = convert ;i>= 1000;i-=1000) {
			// Add "M" to variable letter everytime loop is ran 
			letter += "M";
			// Minus convert by 1000 everytime loop is ran
			convert-=1000;
			}
		
	}
	// If convert variable is less than or equal to 900
	// run through this if statement
	if (convert >= 900) {
		// loop until i is not greater than 900 while subtracting
		// 900 from i everytime loop is ran
		for (int i = convert;i>= 900;i-=900) {
			// Add "CM" to variable letter everytime loop is ran 
			letter += "CM";
			// Minus convert by 900 everytime loop is ran
			convert-=900;
			}
	
	}
	// If convert variable is less than or equal to 500
	// run through this if statement
	if (convert >= 500) {
		// loop until i is not greater than 500 while subtracting
		// 500 from i everytime loop is ran
		for (int i = convert;i>= 500;i-=500) {
			// Add "D" to variable letter everytime loop is ran 
			letter += "D";
			// Minus convert by 500 everytime loop is ran
			convert-=500;
			}
	
	}
	// If convert variable is less than or equal to 400
	// run through this if statement
	if (convert >= 400) {
		// loop until i is not greater than 400 while subtracting
		// 400 from i everytime loop is ran
		for (int i = convert;i>= 400;i-=400) {
			// Add "CD" to variable letter everytime loop is ran 
			letter += "CD";
			// Minus convert by 400 everytime loop is ran
			convert-=400;
			}	
			
	}
	// If convert variable is less than or equal to 100
	// run through this if statement
	if (convert >= 100) {
		// loop until i is not greater than 100 while subtracting
		// 100 from i everytime loop is ran
		for (int i = convert;i>= 100; i -= 100) {
			// Add "C" to variable letter everytime loop is ran  
			letter += "C";
			// Minus convert by 100 everytime loop is ran
			convert-=100;
			}
		
	}
	// If convert variable is less than or equal to 90
	// run through this if statement
	if (convert >= 90) {
		// loop until i is not greater than 90 while subtracting
		// 90 from i everytime loop is ran
		for (int i = convert;i>= 90; i -= 90) {
			// Add "XC" to variable letter everytime loop is ran 
			letter += "XC";
			// Minus convert by 90 everytime loop is ran
			convert-=90;
			}				

	}
	// If convert variable is less than or equal to 50
	// run through this if statement
	if (convert >= 50) {
		// loop until i is not greater than 50 while subtracting
		// 50 from i everytime loop is ran
		for (int i = convert;i>= 50; i -= 50) {
			// Add "L" to variable letter everytime loop is ran 
			letter += "L";
			// Minus convert by 50 everytime loop is ran
			convert-=50;
			}	
	}
	//If convert variable is less than or equal to 40
	// run through this if statement
	if (convert >= 40) {
		// loop until i is not greater than 40 while subtracting
		// 40 from i everytime loop is ran
		for (int i = convert;i>= 40; i -= 40) {
			// Add "XL" to variable letter everytime loop is ran 
			letter += "XL";
			// Minus convert by 40 everytime loop is ran
			convert-=40;
			}	
	}
	// If convert variable is less than or equal to 10
	// run through this if statement
	if (convert >= 10) {
		// loop until i is not greater than 10 while subtracting
		// 10 from i everytime loop is ran
		for (int i = convert;i>= 10; i -= 10) {
			// Add "X" to variable letter everytime loop is ran 
			letter += "X";
			// Minus convert by 10 everytime loop is ran
			convert-=10;
			}
	}
	// If convert variable is less than or equal to 9
	// run through this if statement
	if (convert >= 9) {
		// loop until i is not greater than 9 while subtracting
		// 9 from i everytime loop is ran
		for (int i = convert;i>= 9; i -= 9) {
			// Add "IX" to variable letter everytime loop is ran  
			letter += "IX";
			// Minus convert by 9 everytime loop is ran
			convert-=9;
			}	
	}
	// If convert variable is less than or equal to 5
	// run through this if statement
	if (convert >= 5) {
		// loop until i is not greater than 5 while subtracting
		// 5 from i everytime loop is ran
		for (int i = convert;i>= 5; i -= 5) {
			// Add "V" to variable letter everytime loop is ran 
			letter += "V";
			// Minus convert by 5 everytime loop is ran
			convert-=5;
			}	
			
	}
	// If convert variable is less than or equal to 4
	// run through this if statement
	if (convert >=4) {
		// loop until i is not greater than 4 while subtracting
		// 4 from i everytime loop is ran
		for (int i = convert;i>= 4; i -= 4) {
			// Add "IV" to variable letter everytime loop is ran 
			letter += "IV";
			// Minus convert by 4 everytime loop is ran
			convert-=4;
			}
	}	
	// If convert variable is less than or equal to 1
	// run through this if statement
	if (convert >= 1) {
		// loop until i is not greater than 1 while subtracting
		// 1 from i everytime loop is ran
		for (int i = convert;i>= 1; i -= 1) {
			// Add "I" to variable letter everytime loop is ran 
			letter += "I";
			// Minus convert by 1 everytime loop is ran
			convert-=1;
			}	
	}
	// Once convert variable = 0, return letter 
	return letter;
		
	}

}
	
