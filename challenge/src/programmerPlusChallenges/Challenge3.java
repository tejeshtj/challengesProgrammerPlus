package programmerPlusChallenges;

import java.util.*;

public class Challenge3 {

	String morse[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..",
			"--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..",
			"|",".---","..---","...--","....-",".....","-....","--...","---..","----.","-----"};

	String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ 1234567890";

	

	

	public void stringToMorse(String input) {

		String convertedCase=input.toUpperCase();
		
		for(int i=0;i<input.length();i++) {

			if(input.equals("")) {
				System.out.println("nothing is entered");
			}
			else {
				for(int j=0;j<alphabet.length();j++) {


					if(convertedCase.charAt(i)==alphabet.charAt(j)){

						String convertedMorse=morse[j];
						System.out.print(convertedMorse+" ");
					}

				}
			}
		}

		
	}

public static void main(String[] args) {
	Challenge3 challenge3=new Challenge3();
	System.out.println("enter the string");
	Scanner in=new Scanner(System.in);
	String originalString=in.nextLine();
	challenge3.stringToMorse(originalString);
}

}
