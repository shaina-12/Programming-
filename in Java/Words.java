import java.util.Scanner;
public class Words
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner (System.in);
		String str = input.nextLine();
		int ctr=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch = str.charAt(i);
		    if(ch == ' ')
		    {
		        ctr++;
		    }
		}
		ctr++;
		System.out.print(ctr);
		input.close();
	}
}