import java.util.Scanner;
public class Fibonacci_Series
{
public static void main(String args[])
{
System.out.println("Enter the number of terms of fibonacci series: ");
Scanner input= new Scanner(System.in);
int n=input.nextInt();
int a=0;
int b=1;
int c=1;
System.out.println("\n" + a);
System.out.println("\n" + b);
System.out.println("\n" + c);
int i=0;
while(i<n-3)
{
a=b;
b=c;
c=a+b;
System.out.println("\n" + c);
i++;
}
input.close();
}
}
