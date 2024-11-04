public class User {
    private String name;
    private TaskList taskList;

    public User(String name, TaskList taskList) {
        this.name = name;
        this.taskList = taskList;
    }
    public User(String name) {
        this.name = name;
        this.taskList = new TaskList();
    }
    public String getName() {
        return name;

    }
    public void setName(String name) {
        this.name = name;
    }
    public TaskList getTaskList() {
        return taskList;
    }
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    public void addTask(Task task) {
        taskList.addTask(task.getName(), task.getDescription(), task.getStatus());
    }
    public void completeTask(String taskName) {
        Task task = taskList.findTask(taskName);
        if (task != null) {
            task.finishTask(task); // Mark the existing task as completed
            taskList.removeTask(taskName); // Optionally remove the task or leave it in the list
        } else {
            System.out.println("Task not found: " + taskName);
        }
    }
    public String toString() {
        return "User [name=" + name + ", taskList=" + taskList + "]";
    }
}
