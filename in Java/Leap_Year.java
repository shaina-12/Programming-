import java.util.Scanner;
public class Leap_Year
{
public static void main(String args[])
{
System.out.println("\nEnter a year: ");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
if(a%100 == 0)
{
if(a%400 ==0)
{
System.out.println(a + " is a leap year.");
}
}
else if(a%4 == 0)
{
System.out.println(a + " is a leap year.");
}
else
{
System.out.println(a + " is not a leap year.");
}
input.close();
}
}