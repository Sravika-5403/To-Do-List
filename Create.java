package to_do_list;
import java.util.*;
import java.time.*;
public class Create {
	public static void createNewTask(User1 u)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Current date: "+LocalDate.now());
		System.out.print("Enter Title: ");
		String title=sc.nextLine();
		System.out.print("Enter Target Date (YYYY-MM-DD): ");
		String dueDate = sc.next();
		LocalDate targetDate;
		try {
			targetDate = LocalDate.parse(dueDate);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Date format");
			return;
		}
		System.out.print("Enter Status of your task: ");
		String Status = sc.next();
		Task task = new Task(title, targetDate, Status);
        u.taskList.add(task);

        System.out.println("Task added successfully!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u = new User1();
		u.tasks = new ArrayList<>();
		createNewTask(u);
	}

}
