import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class FileHandling1{
public static void main(String args[]){
try{
Scanner sc = new Scanner(System.in);
System.out.println("3rd Part: To Append The Text In The File:");
FileWriter f4 = new FileWriter("D:/MyFile.txt",true);
System.out.println("Enter the string to be added: ");
String s1=sc.nextLine();
f4.write(s1);
f4.close();
System.out.println("The file has been appended sucessfully.");
}
catch(IOException e){
System.out.println("Exception Occured 1");
e.printStackTrace();
}
}
}