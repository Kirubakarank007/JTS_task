package task;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		TaskManager taskmanager=new TaskManager(); 
		boolean exit=true;
		while(exit) {
			Scanner sc=new Scanner(System.in);
			System.out.println("1. Add task\n2. Edit Task\n3. Delete Task\n4. Viewl All Task\n5. Filter Task By Priority\n6. Exit\n");
			System.out.print("Enter Your Choice(1-6): ");
			int choice=sc.nextInt();
			String task,desc,priority,status;
			
			if(choice>=1&&choice<=6) {
				switch(choice) {
				
				case 1:
					System.out.print("Enter task title: ");
					task=sc.next();
					System.out.print("Enter task describtion: ");
					desc=sc.next();
					System.out.print("Enter task priority (High/Medium/Low): ");
					priority=sc.next();
					System.out.print("Enter task status (Pending/In Progress/Completed): " );
					status=sc.next();
					taskmanager.addTask(task, desc, priority, status);
					System.out.println();
					break;
				case 2:
					System.out.print("Enter task ID to edit : ");
					int id=sc.nextInt();
					System.out.print("Enter new title (leave blank to keep existing): ");
					String newTitle=sc.next();
					System.out.print("Enter new description (leave blank to keep existing): ");
					String newDesc=sc.next();
					System.out.println("Enter new priority (leave blank to keep existing): ");
					String newPriority=sc.next();
					System.out.println("Enter new status (leave blank to keep existing): ");
					String newStatus=sc.next();
					taskmanager.editTask(id, newTitle, newDesc, newPriority, newStatus);
					break;
				case 3:
					System.out.println("Enter task Id to delete: ");
					id=sc.nextInt();
					taskmanager.deleteTask(id);
					break;
				case 4:
					System.out.println(taskmanager.ViewAllTask());
					System.out.println();
					break;
				case 5:
					System.out.println("Enter priority to filter tasks (High/Medium/Low): ");
					 priority=sc.next();
					 taskmanager.filterTasksByPriority(priority);
					 break;
				case 6:
					exit=false;
			}
			}
			else {
				System.out.println("Invalid choice. Please enter a number\n");
			}

		}
	}

}
