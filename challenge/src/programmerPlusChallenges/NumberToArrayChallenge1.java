package programmerPlusChallenges;

import java.util.ArrayList;

public class NumberToArrayChallenge1 {
	
	String afterconvert=null;
	ArrayList<String> list=new ArrayList<>();
	public int myconvert(int number) {
		
		String afterc=""+number;
		char[] array=afterc.toCharArray();
		for(Object obj:array) {
			
			list.add(obj.toString());
		}
		
		System.out.print(list);
		
		return 0;
		
	}
	
public static void main(String[] args) {
	
 NumberToArrayChallenge1 num=new NumberToArrayChallenge1();
	num.myconvert(124);
	

}
}
