package task;

import java.util.*;

public class TaskManager {
	List<Task> tasks;
	
	public Task getTaskById(int id) {
		for(Task task:tasks) {
			if(task.getId()==id) {
				return task;
			}
		}
		return  null;
	}
	
	public TaskManager() {
		tasks=new ArrayList<>();
	}
	public void addTask(String title,String description,String priority,String status) {
		int taskid=tasks.size()+1;
		Task newtask=new Task(taskid,title,description,priority,status);
		tasks.add(newtask);
		System.out.println("task added");
		}
	
	public void editTask(int id,String title,String description,String priority,String status ) {
		Task task=getTaskById(id);
		if(task!=null) {
			if(title!=null) {
				task.setTitle(title);
			}
			if(description!=null) {
				task.setDescription(description);
			}
			if(priority!=null) {
				task.setPriority(priority);
			}
			if(status!=null) {
				task.setStatus(status);
			}
		}
		
	}
	
	public void deleteTask(int id) {
		Task task=getTaskById(id);
		if(task!=null) {
			tasks.remove(id-1);
		}
	}
	
	public String ViewAllTask(){
		String str= "";
		for(int i=0;i<tasks.size();i++) {
			str+=tasks.get(i);
		}
		return str;
	}
	
	public void  filterTasksByPriority(String priority){
		List<Task> filteredTask=new ArrayList<>();
		for(Task task:tasks) {
			if(task.getPriority().equalsIgnoreCase(priority)) {
				filteredTask.add(task);
			}
		}
		for(int i=0;i<filteredTask.size();i++) {
			System.out.print(filteredTask.get(i));
		}
	}
}
