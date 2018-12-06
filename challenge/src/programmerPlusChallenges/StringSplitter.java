package programmerPlusChallenges;

public class StringSplitter {

	public static void main(String[] args) {
		
		String input="hi bro how are you";
		String splitted[]=input.split(" ");
		for(String str:splitted) {
			System.out.println(str);
		}
	}
}
