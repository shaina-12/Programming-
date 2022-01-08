import java.util.Scanner;
public class Print_All_Prime_Numbers_Till_A_Limit
{
public static void main(String args[])
{
Scanner input= new Scanner(System.in);
System.out.println("Enter the upper limit: ");
int ul=input.nextInt();
System.out.println("Enter the lower limit: ");
int ll=input.nextInt();
System.out.println("\nThe prime numbers are:" );
System.out.println("\n");
for(int i=ll;i<=ul;i++)
{
int b=2;
int flag=1;
int n=i;
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
System.out.println(i);
}
}
input.close();
}
}