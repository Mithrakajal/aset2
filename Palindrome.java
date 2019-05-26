import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args) {
		int n;
		int reversedInteger=0, remainder, originalInteger;
		originalInteger=n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		n=s.nextInt();
		while(n!=0)
		{
		    remainder=n%10;
		    reversedInteger=reversedInteger*10+remainder;
		    n/=10;
		}
		if(originalInteger==reversedInteger)
		System.out.println(originalInteger+" is a palindrome");
		else
		System.out.println(originalInteger+" is not a palindrome");
	}
}
