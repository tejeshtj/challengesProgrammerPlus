package programmerPlusChallenges;

import java.util.Scanner;

public class Challenge8 {

	static int count;
	public static void searchCounter(String testText) {
		String input="aa_aa_bb_bb_dd_cc_ff_aa_bb_";
		String inputArray[]=input.split("_");
		for(int i=0;i<inputArray.length;i++) {
			if(testText.equalsIgnoreCase(inputArray[i])) {
				count++;
			}
		}
		System.out.println(count);
	
				
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the string u need to search");
		String testText=scanner.nextLine();
		searchCounter(testText) ;
	}
}
