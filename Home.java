package to_do_list;
import java.util.*;
public class Home {
	public static void Dashboard(User1 u)
	{
		Scanner sc = new Scanner(System.in);
		int choice;
		do
		{
		System.out.println("===============TO-Do-LIST DASHBOARD================");
		System.out.println("Welcome "+u.userid+" "+u.name);
		System.out.println("1:Create a new TO-DO-LIST");
		System.out.println("2:Add a new task in TO-DO-LIST");
		System.out.println("3:View all TO-DO-LIST Tasks");
		System.out.println("4:Edit a task in TO-DO-LIST");
		System.out.println("5:Delete a TO-DO-LIST task");
		System.out.println("6:Update TO-DO-LIST task status");
		System.out.println("Enter your choice:");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			Create.createUser(u);
			break;
		case 2:
			Add.addTask(u);
			break;
		case 3:
			View.viewList(u);
			break;
		case 4: 
			Edit.editTask(u);
			break;
		case 5:
			Delete.deleteTask(u);
			break;
		case 6:
			Update.updateStatus(u);
			break;
		}
		}while(choice!=6);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please login");
	}

}
