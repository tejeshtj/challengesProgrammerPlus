package programmerPlusChallenges;
import java.util.TreeSet;

public class Bun {

	static String s1;
	static String s2;
	public static void main(String[] args) {


		/*Comparator<String> comp=(s1,s2)->{
			return s1.compareTo(s2);

		};
		comp.compare( s1, s2);
		 */		
		TreeSet<String> set=new TreeSet<String>(new mycompare()) ;
		set.add("tejesh");
		set.add("bejesh");
		set.add("dejesh");
		set.add("hejesh");
		set.add("jejesh");


		set.forEach(str -> System.out.println(str));

		/*Iterator it= set.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }*/

		/* for(Object str:set) {
			 System.out.println(str);
		 }*/





	}
}
