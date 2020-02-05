/*
cndsnsdsdr sjsf f  e mdkrmkfjdfner n er dsr efejr * This program takes a number and converts it into
 * a Roman numeral
 * 
 * Momin Choudhry 
 * 10/15/2019
 * Professor Ben White
 * CSC15
 */

// Import Scanner 
import java.util.Scanner;
// Class that outputs all the methods from helper class
public class RomanDriver {
	// Main method that calls the runProgram method 
	// and has a scanner as a parameter 
	public static void main(String[] args) {
	// Create Scanner called console
	Scanner console = new Scanner (System.in);
	// Call runProgram with scanner as a parameter 
	runProgram(console);
	

	}
	/*
	 * runProgram method with a scanner as a parameter 
	 * Calls method from the helper class 
	 * and ask user how many times to run the program
	 */
	public static void runProgram(Scanner console) {
		// Call description method from helper class 
		RomanHelper.description();
		// Ask user how many times to run the program 
		System.out.print("How many times would you like to run this program? ");
		// Hold user input in variable called digit
		int digit = console.nextInt();
		// If digit is less than 1
		// throw IllegalArgumentException
		if (digit < 1 ) {
			throw new IllegalArgumentException();
		}
		// For loop that will run getNextNumber "digit" amount of times 
		for (int i = 1; i<= digit; i++) {
			getNextNumber();
		}
	
	}
	// Method called getNextNumber 
	// Gets user number input and converts it to a Roman numeral
	public static void getNextNumber() {
		// Create Scanner 
		Scanner console = new Scanner (System.in);
		// Ask user to enter a number 
		System.out.print("Please enter the number that you would like to convert: ");
		// Hold users number in convert variable 
		int convert = console.nextInt();
		// if users input is less than 1
		// throw illegalArgumentException
		if (convert < 1) {
			throw new IllegalArgumentException();
		}
		// Using printf, print the users number as a Roman numeral is "  "
		System.out.printf("%d as a Roman Numeral is %s\n" , convert, RomanHelper.getRoman(convert));
		
	}
	
}
