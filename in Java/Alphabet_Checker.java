import java.util.Scanner;
public class Alphabet_Checker
{
public static void main(String args[])
{
System.out.println("Enter the alphabet: ");
Scanner input= new Scanner(System.in);
char ch=input.next().charAt(0);
if(ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o' || ch == 'U' ||ch == 'u')
{
System.out.println(ch + " is a vowel.");
}
else if(Character.isAlphabetic(ch))
{
System.out.println(ch + " is an alphabet.");
}
else
{
System.out.println(ch + " is not an alphabet.");
} 
input.close();
}
}


