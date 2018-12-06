package programmerPlusChallenges;
import java.util.HashMap;
import java.util.Set;
import java.util.function.Predicate;

public class Gun {

	public static void main(String[] args) {
		HashMap<Integer, String> map =new HashMap<>();
		map.put(1,"tejesh");
		map.put(2,"rajesh");
		map.put(3, "vaishu");
		
		Set <Integer>keys =map.keySet();
		
		/*for(Integer i2:keys) {
			if(i2%2==0) {
				String str=map.get(i2);
				System.out.println(str);
			}
		}*/
		//keys.forEach(key->System.out.println(map.get(key)));
		/*keys.forEach(key->{if(key%2==0) 
								{String str=map.get(key);
									System.out.println(str);
									}
		}
		);*/
		for(int i1:map.keySet()) {
			System.out.println(map.get(i1));
		}
	}
}
