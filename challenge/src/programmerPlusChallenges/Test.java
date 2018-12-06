package programmerPlusChallenges;

import java.io.File;
import java.io.FileReader;

public class Test  {

	public void read() throws Exception
	{

		File myfile= new File("E:/log.txt");
		long fl=myfile.length();
		char data[]=new char[(int)fl];
		FileReader fr=new FileReader("E:/log.txt");
		int no=fr.read(data);
		System.out.println(no);
		System.out.println(data);
	}
	
	

}
