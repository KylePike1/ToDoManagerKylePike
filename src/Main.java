

public class Main {
    public static void main(String[] args) {
        // Create an array of users
        User[] users = new User[3];
        users[0] = new User("Alice");
        users[1] = new User("Bob");
        users[2] = new User("Charlie");

        // Add tasks to users' task lists
        users[0].addTask(new Task("Grocery Shopping", "Buy groceries for the week", "pending"));
        users[0].addTask(new Task("Reading", "Read '1984'", "pending"));

        users[1].addTask(new Task("Homework", "Complete math assignment", "pending"));
        users[1].addTask(new Task("Gym", "Go to the gym", "pending"));

        users[2].addTask(new Task("Dog Walk", "Take the dog for a walk", "pending"));
        users[2].addTask(new Task("Laundry", "Do the laundry", "pending"));

        //Print Task for each User before deletion
        System.out.println("All Users TaskLists before any Completion");
        System.out.println("============================================");
        for (User user : users) {
            System.out.println("Tasks for " + user.getName() + ":");
            user.getTaskList().displayTasks();
            System.out.println();
        }

        // Mark tasks as completed using the task name
        users[0].completeTask("Reading");
        users[1].completeTask("Homework");

        // Print all tasks for each user after completion
        System.out.println("All Users TaskLists after Completion");
        System.out.println("============================================");
        for (User user : users) {
            System.out.println("Tasks for " + user.getName() + ":");
            user.getTaskList().displayTasks();
            System.out.println();
        }
    }
}