package programmerPlusChallenges;

import java.util.Scanner;

public class Challenge2 //sum of fibanocci
{
static int n;
int num1=0;
int num2=1;
int sum;
public int sumFactorial(int n) {
	
	for(int i=0;i<n;++i) {
	    sum =num1+num2;
		num1=num2;
		num2=sum;
	}
	
	return sum;
}
	public static void main(String[] args) {
		Challenge2 challenge2=new Challenge2();
		System.out.println("enter your choice to sum of first n fibannoci numbers: ");
		Scanner in=new Scanner(System.in);
		n=Integer.parseInt(in.nextLine());
		int result=challenge2.sumFactorial(n);
		System.out.println("sum of "+n+"fibannoci numbers is: "+result);
	}
}
