package task;

public class Task {
	int id;
	String title;
	String description;
	String priority;
	String status;
	
	
	public Task(int id, String title, String description, String priority, String status) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription1() {
		return description;
	}
	public void  setDescription(String description) {
		this.description=description;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task ID: " + id + ", Title: " + title + ", Description: " + description + ", Priority: " + priority
				+ ", Status: " + status + "\n";
	}	
}
