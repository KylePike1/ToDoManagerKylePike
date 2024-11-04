public class TaskList {
    private Task head;
    public TaskList() {
        head = null;
    }
    // Add a new task with name, description, and status
    public void addTask(String name, String description, String status) {
        Task newTask = new Task(name, description, status);
        if (head == null) {
            head = newTask; // If the list is empty, set head to new task
        } else {
            Task current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newTask; // Link the new task
        }
    }

    // Display all tasks
    public void displayTasks() {
        Task current = head;
        if (current == null) {
            System.out.println("No tasks in the list.");
            return;
        }
        while (current != null) {
            System.out.println("Name: " + current.name +
                    ", Description: " + current.description +
                    ", Status: " + current.status);
            current = current.next;
        }
    }

    // Remove a task by name
    public void removeTask(String name) {
        if (head == null) return; // If list is empty

        // If the task to remove is the head
        if (head.name.equals(name)) {
            head = head.next; // Move head to next task
            return;
        }

        Task current = head;
        while (current.next != null) {
            if (current.next.name.equals(name)) {
                current.next = current.next.next; // Remove the task
                return;
            }
            current = current.next; // Move to the next task
        }
    }
    public Task findTask(String name) {
        Task current = head;
        while (current != null) {
            if (current.name.equals(name)) {
                return current; // Return the found task
            }
            current = current.next;
        }
        return null; // Return null if the task is not found
    }
}

