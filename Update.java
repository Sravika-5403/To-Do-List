package to_do_list;

import java.util.Scanner;

public class Update {
	public static void updateStatus(User1 u)
	{
		Scanner sc = new Scanner(System.in);
		if(u.taskList == null || u.taskList.isEmpty())
		{
			System.out.println("No task to edit");
			return;
		}
		System.out.println("Tasks are:");
		for(int i=0;i<u.taskList.size();i++)
		{
			Task t = u.taskList.get(i);
			System.out.println((i+1)+". "+t.title+" "+t.dueDate+" "+t.Status);
		}
		System.out.println("Enter the task number for which status should be updated");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice < 1 || choice>u.taskList.size())
		{
			System.out.println("Invalid Choice");
			return;
		}
		Task selectedTask = u.taskList.get(choice-1);
		System.out.println("Enter the Status yoy want to update");
		String newStatus = sc.next();
		selectedTask.Status = newStatus;
		System.out.println("Status Successfully updated");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 User1 u = new User1();
	        u.taskList = new java.util.ArrayList<>();
	        updateStatus(u);
	        System.out.println("\nUpdated Tasks:");
	        for (Task t : u.taskList) {
	            System.out.println(t.title + " | " + t.dueDate + " | " + t.Status);
	        }

	}

}
