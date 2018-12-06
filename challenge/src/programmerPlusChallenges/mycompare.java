package programmerPlusChallenges;
import java.util.Comparator;

class mycompare implements Comparator<String>{

		@Override
		public int compare(String o1, String o2) {//o1 is object we are going to insert andd o2 is object alredy inserted and we are comparing
																//o1 with o2
			
			return -o1.compareTo(o2);//to reverse the sorting
		}
		
	}

