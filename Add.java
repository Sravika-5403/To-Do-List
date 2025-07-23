package to_do_list;

import java.time.LocalDate;
import java.util.*;;

public class Add {
	public static void addTask(User1 u)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of tasks to add: ");
		int noofTasks = sc.nextInt();
		sc.nextLine();
		for(int i =0;i<noofTasks;i++)
		{
			System.out.println("\nTask " + (i + 1));
		System.out.println("Current date: "+LocalDate.now());
		System.out.print("Enter Title: ");
		String title=sc.nextLine();
		System.out.print("Enter Target Date (YYYY-MM-DD): ");
		String dueDate = sc.next();
		sc.nextLine();
		LocalDate targetDate;
		try {
			targetDate = LocalDate.parse(dueDate);
		}
		catch(Exception e) 
		{ 
			System.out.println("Invalid Date format");
			continue;
		}
		System.out.print("Enter Status of your task: ");
		String Status = sc.nextLine();
		
		
		 Task task = new Task(title, targetDate, Status);
         u.taskList.add(task);

         System.out.println("Task added successfully!");
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u = new User1();
		u.taskList = new ArrayList<>();
        addTask(u);

        for (Task t : u.taskList) {
            System.out.println("\nTask: " + t.title + ", Due: " + t.dueDate + ", Status: " + t.Status);
        }
	}

}

