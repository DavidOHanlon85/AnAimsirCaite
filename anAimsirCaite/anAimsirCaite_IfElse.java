/**
 * 
 */
package anAimsirCaite;

import java.util.Scanner;

/**
 * 
 */
public class anAimsirCaite_IfElse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Declare and Initialise Variables

		String userInput, verbOutput = null;
		String repeat;

		// Instantiate Scanner

		Scanner myScan = new Scanner(System.in);

		// Prompt User
		
		do {

		System.out.println("What verb would you like conjugated into the past tense?");
		userInput = myScan.nextLine();

		// Set up If Else...

		
		if (userInput.equalsIgnoreCase("beir")) {
			verbOutput = "Rug";
		} else if (userInput.equalsIgnoreCase("clois")) {
			verbOutput = "Chuala";
		} else if (userInput.equalsIgnoreCase("cluin")) {
			verbOutput = "Chuala";
		} else if (userInput.equalsIgnoreCase("ith")) {
			verbOutput = "D'ith";
		} else if (userInput.equalsIgnoreCase("tabhair")) {
			verbOutput = "Thug";
		} else if (userInput.equalsIgnoreCase("tar")) {
			verbOutput = "Tháinig";
		} else if (userInput.equalsIgnoreCase("abair")) {
			verbOutput = "Dúirt";
		} else if (userInput.equalsIgnoreCase("bí")) {
			verbOutput = "Bhí";
		} else if (userInput.equalsIgnoreCase("déan")) {
			verbOutput = "Rinne";
		} else if (userInput.equalsIgnoreCase("faigh")) {
			verbOutput = "Fuair";
		} else if (userInput.equalsIgnoreCase("feic")) {
			verbOutput = "Chonaic";
		} else if (userInput.equalsIgnoreCase("téigh")) {
			verbOutput = "Chuaigh";
		} else if (userInput.charAt(0) == 'A' || userInput.charAt(0) == 'a') {
			verbOutput = "D'" + userInput;
		} else if (userInput.charAt(0) == 'E' || userInput.charAt(0) == 'e') {
			verbOutput = "D'" + userInput;
		} else if (userInput.charAt(0) == 'I' || userInput.charAt(0) == 'i') {
			verbOutput = "D'" + userInput;
		} else if (userInput.charAt(0) == 'O' || userInput.charAt(0) == 'o') {
			verbOutput = "D'" + userInput;
		} else if (userInput.charAt(0) == 'U' || userInput.charAt(0) == 'u') {
			verbOutput = "D'" + userInput;
		} else if (userInput.charAt(0) == 'S' || userInput.charAt(0) == 's' && userInput.charAt(1) == 'C'
				|| userInput.charAt(1) == 'c') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'S' || userInput.charAt(0) == 's' && userInput.charAt(1) == 'M'
				|| userInput.charAt(1) == 'm') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'S' || userInput.charAt(0) == 's' && userInput.charAt(1) == 'P'
				|| userInput.charAt(1) == 'p') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'S' || userInput.charAt(0) == 's' && userInput.charAt(1) == 'T'
				|| userInput.charAt(1) == 't') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'F' || userInput.charAt(0) == 'f') {
			verbOutput = "D'" + userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'B' || userInput.charAt(0) == 'b') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'C' || userInput.charAt(0) == 'c') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'D' || userInput.charAt(0) == 'd') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'G' || userInput.charAt(0) == 'g') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'H' || userInput.charAt(0) == 'h') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'L' || userInput.charAt(0) == 'l') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'M' || userInput.charAt(0) == 'm') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'N' || userInput.charAt(0) == 'n') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'P' || userInput.charAt(0) == 'p') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'R' || userInput.charAt(0) == 'r') {
			verbOutput = userInput;
		} else if (userInput.charAt(0) == 'S' || userInput.charAt(0) == 's') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		} else if (userInput.charAt(0) == 'T' || userInput.charAt(0) == 't') {
			verbOutput = userInput.charAt(0) + "h" + userInput.substring(1);
		}

		System.out.println("___________________\n");
		System.out.println(verbOutput + " mé ");
		System.out.println(verbOutput + " tú ");
		System.out.println(verbOutput + " sé ");
		System.out.println(verbOutput + " sí ");
		System.out.println(verbOutput + " muid ");
		System.out.println(verbOutput + " sibh ");
		System.out.println(verbOutput + " siad ");
		System.out.println("___________________\n");
		
		// Reprompt
		
		System.out.println("Would you like to input another verb to be conjugated (Y/N)?");
		repeat = myScan.nextLine(); 
		
		} while (repeat.charAt(0) == 'Y' || repeat.charAt(0) == 'y');

		myScan.close();
	}

}
