package to_do_list;
import java.util.*;
import java.time.*;

public class Edit {
	public static void editTask(User1 u)
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
		System.out.println("Enter the task number you want to edit");
		int choice = sc.nextInt();
		sc.nextLine();
		if(choice < 1 || choice>u.taskList.size())
		{
			System.out.println("Invalid Choice");
			return;
		}
		Task selectedTask = u.taskList.get(choice-1);
		System.out.println("Enter want you want to edit/update - Title/DueDate");
		String edit = sc.nextLine().trim().toLowerCase();
		edit.toLowerCase();
		if(edit.equals("title"))
		{
			System.out.println("Enter new Title to be Updated");
			String newTitle = sc.nextLine();
			selectedTask.title = newTitle;
			System.out.println("Title Succesfully Updated");
		}
		if(edit.equals("duedate"))
		{
			System.out.println("Enter new DueDate to be Updated --> (YYYY-MM-DD)");
			String newDueDate = sc.nextLine();
			selectedTask.dueDate = LocalDate.parse(newDueDate);
			System.out.println("DueDate Succesfully Updated");
		}
		
		
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 User1 u = new User1();
	        u.taskList = new java.util.ArrayList<>();
	        editTask(u); 
	        System.out.println("\nUpdated Tasks:");
	        for (Task t : u.taskList) {
	            System.out.println(t.title + " | " + t.dueDate + " | " + t.Status);
	        }

	}

}

