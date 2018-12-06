package programmerPlusChallenges;

import com.sun.java_cup.internal.runtime.Scanner;

public class Challenge5 {
	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


	public static void printPosition(String input){
		
		
		String convertedCase=input.toUpperCase();

		for(int i=0;i<input.length();i++) {

			if(input.equals("")) {
				System.out.println("nothing is entered");
			}
			else {
				for(int j=0;j<alphabet.length();j++) {


					if(convertedCase.charAt(i)==alphabet.charAt(j)){


						System.out.print(alphabet.indexOf(convertedCase.charAt(i))+1+" ");
					}

				}
			}
		}

	}
	
	public static void main(String[] args) {
		System.out.println("enter the string: ");
		java.util.Scanner scanner =new java.util.Scanner(System.in);
		String input=scanner.nextLine();
		printPosition(input);
		
	}
}
