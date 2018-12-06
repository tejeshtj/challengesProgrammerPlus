package programmerPlusChallenges;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Challenge4 {

	public static void main(String[] args) {
		
		DecimalFormat df=new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.FLOOR);
		Double result=new Double(df.format(3.4545568));
		System.out.println(result);
	}
}
