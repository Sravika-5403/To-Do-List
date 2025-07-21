package to_do_list;
import java.util.*;
public class Register {

	public static User1 Registeruser() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		User1 u = new User1();
		System.out.println("Enter your Email Address");
		u.email = sc.next();
		System.out.println("Enter your Name");
		u.name = sc.next(); 
		System.out.println("Create your userID");
		u.userid = sc.nextInt();
		System.out.println("Create your password");
		u.pwd = sc.next();
		boolean flag = false;
		if(u.name.matches("[a-zA-Z]+"))
		{ 
			flag = true;
		}
		String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"; 
		if(u.email.matches(emailRegex))
		{
			flag = true;
		}
		
		if(flag)
		{
			System.out.println(u.name+" Registration Sucessful");
			return u;
		}
		else
		{
			System.out.println("Check your credintials"); 
			return null;
		}
	}
	public static void main(String args[])
	{
		User1 u = Registeruser();
		if(u != null)
		{
			login.LoginUser(u);
		}
	}

}
