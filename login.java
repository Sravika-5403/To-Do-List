package to_do_list;
import java.util.*;
public class login {

	public static User1 LoginUser(User1 u) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your userID");
		int userID = sc.nextInt();
		System.out.println("Enter your Password");
		String password = sc.next();
		boolean flag = false;
		if(userID == u.userid)
		{
			flag = true;
		}
		if(password.equals(u.pwd))
		{
			flag = true;
		}
		if(flag)
		{
			System.out.println("You are succesfully logged in");
		}
		else
		{
			System.out.println("Check your credintials");
		}
	}
	public static void main(String args[])
	{
		User1 u = Register.Registeruser();
		if(u!=null)
		{
			User1 loggenInUser = LoginUser(u);
			if(loggenInUser != null)
			{
			Home.Dashboard(loggenInUser);
			}
		}
	}

}
