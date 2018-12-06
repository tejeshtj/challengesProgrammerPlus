package programmerPlusChallenges;

public class Challenge6 {

	static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void findNextLetter(String input) {
		
		String convertedCase=input.toUpperCase();

		for(int i=0;i<input.length();i++) {

			if(input.equals("")) {
				System.out.println("nothing is entered");
			}
			else {
				for(int j=0;j<alphabet.length();j++) {


					if(convertedCase.charAt(i)==alphabet.charAt(j)){
						if(i==input.length()-1) {
						
							System.out.println(alphabet.charAt(j+1));
						}
					}

				}
			}
		}

	}
	public static void main(String[] args) {
		System.out.println("enter the string: ");
		java.util.Scanner scanner =new java.util.Scanner(System.in);
		String input=scanner.nextLine();
		findNextLetter(input);
	}

	
}
