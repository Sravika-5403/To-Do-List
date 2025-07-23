package to_do_list;

import java.util.Scanner;

public class Delete {
	public static void deleteTask(User1 u)
	{
		Scanner sc = new Scanner(System.in);
		if(u.taskList == null || u.taskList.isEmpty())
		{
			System.out.println("No task to delete");
			return;
		}
		System.out.println("Tasks are:");
		for(int i=0;i<u.taskList.size();i++)
		{
			Task t = u.taskList.get(i);
			System.out.println((i+1)+". "+t.title+" "+t.dueDate+" "+t.Status);
		}
		System.out.println("Enter the task number to delete");
		int taskNum = sc.nextInt();
		sc.nextLine();
		if(taskNum < 1 || taskNum>u.taskList.size())
		{
			System.out.println("Invalid Choice");
			return;
		}
		Task removedTask = u.taskList.remove(taskNum-1);
		System.out.println("Task "+removedTask.title+" has been deleted.");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u = new User1();
        u.taskList = new java.util.ArrayList<>();
        deleteTask(u);
        System.out.println("\nUpdated Task List:");
        for (Task t : u.taskList) {
            System.out.println(t.title + " | " + t.dueDate + " | " + t.Status);
        }

	}

}
