import java.util.Scanner;
public class Even
{
	public static void main(String[] args) {
		int n,q;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n:");
		n=s.nextInt();
		System.out.println("enter q:");
		q=s.nextInt();
		System.out.println("the even numbers are:");
		for(int i=n;i<=q;i++)
		{
		    if(i%2==0)
		    {
		        System.out.println(i+"  ");
		    }
		}
	}
}
