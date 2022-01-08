import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Hello_Name
{
	public static void main(String [] args)throws Exception
	{
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		System.out.print("Enter Your Name: ");
		String name = br.readLine();
		System.out.println("Hello " + name + "!");
	}
} 
		