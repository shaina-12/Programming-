//package assignment2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap; //If You Want You Can Remove It
class User
{
	public int userID;
	public String userName;
	public boolean userStatus;
	User()
	{
		this.userID=000;
		this.userName="Anonymous";
		this.userStatus=false;
	}
}
class UserAlreadyExistException extends RuntimeException{
	UserAlreadyExistException(String str)
	{
		super(str);
	}
}
class UserAccountIsBlockedException extends Exception{
	UserAccountIsBlockedException(String str)
	{
		super(str);
	}
}
interface UserService{
	public void addUser(User user) throws UserAlreadyExistException;
	public User getUser(int userID) throws UserAccountIsBlockedException;
	public void updateUser(User user);
	public void deleteUser(int userID);
	public void unblockUser(int userID);
	public ArrayList <User> getAllUsers();
}
class InMemoryUserService implements UserService
{
	Scanner input = new Scanner(System.in); 
	ArrayList <User> entries = new ArrayList<>();
	HashMap <Integer,Boolean> uniqueEntries = new HashMap<>(); //If you Want Don't Use It
	//System.out.print("Enter the no of users whose entries that you want to add");
	public void addUser(User user) throws UserAlreadyExistException{
		if(uniqueEntries.containsKey(user.userID)) //If You Want You Can Avoid It
        {
			Integer x = user.userID;
			String s1 = Integer.toString(x);
			String s2 = "The user account " + s1 + " is already exist.";
            throw new UserAlreadyExistException(s2);
        }
		else
		{
			//int a = user.userID;
			//Boolean b = user.userStatus;
			entries.add(user);
			uniqueEntries.put(user.userID,user.userStatus);	
			System.out.println("The account has been created successfully.");
		}
	}
	public User getUser(int userID) throws UserAccountIsBlockedException{
		User u = new User();
		int i;
		for(i=0;i<entries.size();i++)
		{
			if(entries.get(i).userID==userID)
			{
				u=entries.get(i);
				break;
			}
		}
		if(i==entries.size())
		{
			System.out.println("The user id that you have typed is not avaliable.");
			return null;
		}
		else if(!u.userStatus)
		{
			Integer x = userID;
			String s1 = Integer.toString(x);
			String s2 = "The user account " + s1 + " you are searching for is blocked. You have to unblock it before you access its details.";
			throw new UserAccountIsBlockedException(s2);
		}
		else 
		{
			return u;
		}
	}
	public void updateUser(User user) {
		int id=user.userID;
		int index=-1;
		for(int i=0;i<entries.size();i++)
		{
			if(entries.get(i).userID==id)
			{
				index=i;
			}
		}
		if(index == -1)
		{
			System.out.println("The user id that you have typed is not available.");
		}
		else
		{
			System.out.print("Do you want to change the name of the user (y/n)?");
			char ch1=input.next().charAt(0);
			if(ch1 == 'y')
			{
				System.out.print("Enter the name: ");
				String name = input.next();
				entries.get(index).userName=name;
				System.out.print("The user details has been updated successfully.\n");
			}
			System.out.print("Do you want to change the status of the account of the user (y/n)?");
			char ch2=input.next().charAt(0);
			if(ch2 == 'y')
			{
				System.out.print("Enter the status: ");
				boolean status= input.nextBoolean();
				entries.get(index).userStatus=status;
				System.out.print("The user details has been updated successfully.\n");
			}
		}
	}
	/*public int search(int userID) {
		/*System.out.print("enter the user id that you want to update");
		int id= input.nextInt();*/
		/*return 0;
	}*/
	public void deleteUser(int userID) {
		//User u = new User();
		//int i;
		int index=-1;
		for(int i=0;i<entries.size();i++)
		{
			if(entries.get(i).userID==userID)
			{
				index=i;
			}
		}
		if(index == -1)
		{
			System.out.println("The user id that you have typed is not available.");
		}
		else
		{
			uniqueEntries.remove(entries.get(index).userID);
			entries.remove(index);//If You Want You Can Avoid It
			System.out.println("The user details has been deleted successfully.");
		}
	}
	public void unblockUser(int userID) {
		int index=-1;
		for(int i=0;i<entries.size();i++)
		{
			if(entries.get(i).userID==userID)
			{
				index=i;
			}
		}
		if(index == -1)
		{
			System.out.println("The user id that you have typed is not available.");
		}
		else
		{
			if(entries.get(index).userStatus)
			{
				System.out.println("The user account is already unblocked.");
			}
			else
			{
				entries.get(index).userStatus=true;
				System.out.println("The user details has been unblocked successfully.");
			}
		}
	}
	public ArrayList <User> getAllUsers(){
		return entries;
	}
}
public class UserTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		InMemoryUserService ims = new InMemoryUserService();
		//User u1 = new User();
		//User u2 = new User();
		User u3 = new User();
		int id1, id2, id3;
		int choice;
		ArrayList <User> entry;
		while(true)
		{
			System.out.println("Main Menu");
			System.out.println("1.Create The User Account");
			System.out.println("2.Delete The User Account");
			System.out.println("3.List The All Users");
			System.out.println("4.Update The User Information");
			System.out.println("5.Unblock The Blocked User");
			System.out.println("6.Show The User Account");
			System.out.println("7.Exit");
			System.out.print("Enter Your Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1: try 
						{
							User u1 = new User();
							System.out.print("Enter the ID: ");
							u1.userID=sc.nextInt();
							System.out.print("Enter the name (Only a single word): ");// Avoid Adding Many Words (2 or more than  words)
							u1.userName=sc.next();
							System.out.print("Enter the status (true/false): ");
							u1.userStatus=sc.nextBoolean();
							ims.addUser(u1);
				        }
				        catch(UserAlreadyExistException e1)
						{
				        	System.out.println(e1);
				        }
				break;
				case 2: System.out.print("Enter the user ID to be deleted: ");	
						id1=sc.nextInt();
						ims.deleteUser(id1);
				break;
				case 3: entry = ims.getAllUsers();
						for(int i=0;i<entry.size();i++)
						{
							int a=i+1;
							System.out.println("User " + a);
							System.out.println("ID: " + entry.get(i).userID);
							System.out.println("Name: " + entry.get(i).userName);
							System.out.println("Status: " + entry.get(i).userStatus);
						}
				break;
				case 4: System.out.print("Enter the user ID to be updated: ");
						User u2 = new User();
						u2.userID = sc.nextInt();
						ims.updateUser(u2);
				break;
				case 5: System.out.print("Enter the user ID for unblocking its account: ");
						id2 = sc.nextInt();
						ims.unblockUser(id2);
				break;
				case 6: try
						{
							System.out.print("Enter the user ID to be accessed: ");	
							id3=sc.nextInt();
							u3 = ims.getUser(id3);
							if(u3 != null)
							{
								System.out.println("ID: " + u3.userID);
								System.out.println("Name: " + u3.userName);
								System.out.println("Status: " + u3.userStatus);
							}
						}
			    		catch(UserAccountIsBlockedException e2)
			    		{
			    			System.out.println(e2);
			    		}
				break;
				case 7: System.exit(0);
				break;
			}
		}
	}
}