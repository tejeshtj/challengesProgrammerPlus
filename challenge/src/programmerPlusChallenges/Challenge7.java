package programmerPlusChallenges;

public class Challenge7 {
	static String input="Spring almost never forces you to implement a Spring-specific interface or extend "
			+ "a Spring-specific class. Instead, the classes in a Spring-bases application often"
			+ " have no indication that they’re being used by Spring. At worst a class may be annotated with one of Springs "
			+ "annotation, but it’s otherwise a POJO";
	static int count=0;	

	public static void counter(String testText)
		
	 {
		
			String filtered=input.replace(".","").replace(",","").replace("-"," ");
			
			String inputArray[]=filtered.split(" ");
			
			System.out.println(inputArray[10]);
			
			for(int i=0;i<inputArray.length;i++) {
				if(testText.equalsIgnoreCase(inputArray[i])) {
					System.out.println(inputArray[i]+" "+i);
				++count;
				}
				
			}
			
	}
	public static void main(String[] args) {
		counter("spring");
		System.out.println(count);
	}
}
