import java.util.Scanner; 
public class Palindrome
{
    static boolean palindrome(String str, int si,int ei)
    {
        if(si>=ei)
        {
            return true;
        }
        char a = str.charAt(si);
        char b = str.charAt(ei);
        if(a != b)
        {
            return false;
        }
        boolean c = palindrome(str,si+1,ei-1);
        return c;
    }
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner (System.in);
	    String str = input.nextLine();
	    int si = 0;
	    int ei = str.length()-1;
	    boolean b = palindrome(str,si,ei);
	    if(b)
	    {
	        System.out.print("true");
	    }
	    else
	    {
	        System.out.print("false");
	    }
	    input.close();
 	}
}
