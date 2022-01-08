import java.util.Scanner;
public class Power_Of_A_Number
{
public static void main(String args[])
{
System.out.println("Enter a no: "); 
Scanner input= new Scanner(System.in);
int a=input.nextInt();
System.out.println("Enter a no of times do you want to enter a number: ");
int n=input.nextInt();
System.out.println("The power of a number is: " + Math.pow(a,n));
input.close();
}
}