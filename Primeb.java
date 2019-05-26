public class Primeb
{
	public static void main(String[] args) {
		int n=1,q=10;

        while (n<q) {
            boolean flag = false;
            for(int i = 2; i <= n/2; ++i) {
                // condition for nonprime number
                if(n% i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                System.out.print(n + " ");

            ++n;
        }
	}
}
