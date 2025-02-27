package duke;

import task.Task;

import java.util.ArrayList;

/**
 * Class contains the methods responsible for printing all the outputs of Duke.
 */
public class PrintOperations {

    /**
     * A String of a horizontal Line
     */
    static final String HORIZONTAL_LINE = "____________________________________________________________";

    /**
     * Prints a String of a horizontal line.
     */
    public static void horizontalLine() {
        System.out.println(HORIZONTAL_LINE);
    }

    /**
     * Prints a lovely greeting.
     */
    public static void greet() {
        horizontalLine();
        System.out.println("Hello! I'm Duke");
        System.out.println("What can I do for you?");
        horizontalLine();
    }

    /**
     * Prints a farewell message and exits the application.
     */
    public static void bye() {
        horizontalLine();
        System.out.println("Bye. Hope to see you again soon!");
        horizontalLine();
    }

    /**
     * Prints a String containing the description of the newly added Task.
     */
    public static void addTask(Task task) {
        System.out.println("Got it. I've added this task: \n" + task);
    }

    /**
     * Prints a list of the Tasks with numbered points.
     * The displayed indexes can be used when manipulating the list using mark, unmark, or the delete commands.
     */
    public static void list(ArrayList<Task> listOfInputs) {
        int counter = 0;

        if (listOfInputs.size() == 0) {
            System.out.println("Your list is empty.");
            return;
        }

        for (Task inputs : listOfInputs) {
            System.out.println(counter + 1 + "." + inputs.toString());
            counter++;
        }
    }

    /**
     * Prints a list of the Tasks with bulleted points.
     */
    public static void bulletedList(ArrayList<Task> listOfFilteredInputs) {
        for (Task inputs : listOfFilteredInputs) {
            System.out.println("- " + inputs.toString());
        }
    }

    /**
     * Prints a String that states that some Tasks matching an entered keyword was found.
     */
    public static void foundTasks() {
        System.out.println("Here are matching tasks in your list:");
    }

    /**
     * Prints a String that states that no Tasks matching an entered keyword was found.
     */
    public static void noTasksFound() {
        System.out.println("No tasks matching the supplied keyword was found!");
    }

    /**
     * Prints the total number of Tasks in the ArrayList.
     */
    public static void numberOfTasks(ArrayList<Task> tasks) {
        if (tasks.size() == 1) {
            System.out.println("Now you have 1 task in the list.");
        } else {
            System.out.println("Now you have " + tasks.size() + " tasks in the list.");
        }
    }

    /**
     * Prints the deleted Task.
     */
    public static void taskRemoved(int taskIndex, ArrayList<Task> tasks) {
        System.out.println("Noted. I've removed this task: ");
        System.out.println(taskIndex + 1 + "." + tasks.get(taskIndex).toString());
    }

    /**
     * Prints when task is marked as done.
     */
    public static void taskMarked(Task task) {
        System.out.println("Nice! I've marked this task as done:");
        System.out.println(task);
    }

    /**
     * Prints when task is unmarked.
     */
    public static void taskUnmarked(Task task) {
        System.out.println("OK, I've marked this task as not done yet:");
        System.out.println(task);
    }

    /**
     * Prints when the user enters an illegal command.
     */
    public static void illegalCommand() {
        System.out.println("OOPS!!! I'm sorry, but I don't know what that means :-(");
    }

    /**
     * Prints when the user tries to mark or unmark a Task that already has that marking.
     */
    public static void alreadyMarked() {
        System.out.println("OOPS!!! This task already has this marking :-(");
    }

    /**
     * Prints when the user enters `|` in their input.
     */
    public static void illegalCharacter() {
        System.out.println("OOPS!!! Please do not have '|' in your input :-(");
    }

    /**
     * Prints when the user enters an illegal syntax.
     */
    public static void illegalSyntax() {
        System.out.println("OOPS!!! I'm sorry, You entered an incorrect syntax :-(");
    }

    /**
     * Prints when the user enters an invalid Task index.
     */
    public static void doesNotExist() {
        System.out.println("OOPS!!! This task does not exist :-(");
    }

    /**
     * Prints when there is an IO error.
     */
    public static void io() {
        System.out.println("OOPS!!! Read/write file error :-(");
    }
}
