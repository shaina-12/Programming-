import java.util.Scanner;
public class String_Breaker
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		int n = input.nextInt();
		int pi = 0;
		int ni = pi+n-1;
		if(str.length() % n == 0)
		{
		    while(ni < str.length())
		    {
		        String s1 = str.substring(pi,ni+1);
		        System.out.print(s1 + "\n");
		        pi = ni+1;
		        ni = pi+n-1;
		    }
		}
		else
		{
		    System.out.print("Cannot Divide The String !");
		}
		input.close();
	}
}