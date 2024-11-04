public class Task {
    public String status;
    public String description;
    public String name;
    Task next;

    Task(String description) {
        this.description = description;
        this.next = null;
    }

    Task(String name, String description, String status) {
        this.status = status;
        this.description = description;
        this.name = name;
        this.next = null;
    }

    public void finishTask(Task task) {
        this.status = "completed";
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
       return "Task { Name: " + this.name + " Status: " + this.status + " Description: " + this.description + " }";
    }

}
