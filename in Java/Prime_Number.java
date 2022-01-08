import java.util.Scanner;
public class Prime_Number
{
public static void main(String args[])
{
System.out.println("Enter a number");
Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=2;
int flag=0;
int n=a;
while(b!=n)
{
if(n%b==0)
{
flag=0;
break;
}
else
{
flag=1;
b++;
}
}
if(flag == 1)
{
System.out.println(a + " is a prime number.");
}
else
{
System.out.println(a + " is not a prime number.");
}
input.close();
}
}