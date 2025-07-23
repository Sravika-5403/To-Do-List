package to_do_list;
import java.time.*;
public class Task {
		    public String title;
		    public LocalDate dueDate;
		    public String Status;

		    public Task(String title, LocalDate dueDate, String Status) {
		        this.title = title; 
		        this.dueDate = dueDate;
		        this.Status = Status;
		    }
		}
