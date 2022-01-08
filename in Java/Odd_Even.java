import java.util.Scanner;
public class Odd_Even
{
public static void main(String args[])
{
System.out.println("\nEnter a number: ");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
if(a%2 == 0)
{
System.out.println(a + " is an even number.");
}
else
{
System.out.println(a + " is an odd number.");
}
input.close();
}
}
