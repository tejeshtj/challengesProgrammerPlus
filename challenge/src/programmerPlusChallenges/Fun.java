package programmerPlusChallenges;

public class Fun {
	public static void main(String[] args) {
		regexcode done=new regexcode();
		boolean validname=done.isStringOnlyAlphabet("tejesh");
		System.out.println(validname);
		System.out.println(done.passvalid("tejesh@"));
	}
}
