import java.util.Scanner;
public class Odd
{
	public static void main(String[] args) {
		int n,q;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		n=s.nextInt();
		System.out.println("enter q:");
		q=s.nextInt();
		System.out.println("the odd numbers are:");
		for(int i=n;i<=q;i++)
		{
		    if(i%2!=0)
		    {
		        System.out.println(i+"  ");
		    }
		}
	}
}
