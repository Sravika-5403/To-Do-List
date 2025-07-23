package to_do_list;

import java.util.ArrayList;

public class View {
	public static void viewList(User1 u)
	{
		if(u.taskList==null || u.taskList.isEmpty())
		{
			System.out.println("Task List is empty");
		}
		int count = 1;
		System.out.println("Total tasks are: "+u.taskList.size());
		for(Task t : u.taskList)
		{
			System.out.println("Task Number: "+count++);
			System.out.println("Task Title: "+t.title);
			System.out.println("Task Due Date: "+t.dueDate);
			System.out.println("Task Status: "+t.Status);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User1 u = new User1();
		u.taskList = new ArrayList<>();
		viewList(u);
	}

}
