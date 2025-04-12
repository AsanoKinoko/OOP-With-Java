/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.TaskController;
import entity.Task;
import java.util.List;
import utils.MenuUtils;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class J1SP0071 {
    private static final TaskController controller = new TaskController();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] options = {
            "Add Task",
            "Delete Task",
            "Display Task",
            "Exit"
        };
        
        while (true) {
            int choice = MenuUtils.getChoice("========= Task program =========", options);
            try{
                switch (choice) {
                    case 1:
                        System.out.println("\n-------- Add Task --------");        
                        // Add task
                        int taskId = controller.addTask();
                        System.out.println("Task added successfully with ID: " + taskId);
                        break;
                    case 2:
                        System.out.println("\n-------- Delete Task --------");
                        while(true){
                            // Display current tasks and check if there are any tasks
                            List<Task> tasks = controller.getDataTasks();
                            if (tasks.isEmpty()) {
                                System.out.println("No tasks found!");
                                break;
                            }
        
                            System.out.println("----------------------------------------- Task ---------------------------------------");
                            System.out.printf("%-3s %-15s %-15s %-15s %-7s %-15s %-15s\n", 
                                "ID", "Name", "Task Type","Date", "Time", "Assignee", "Reviewer");
        
                            for (Task task : tasks) {
                                System.out.println(controller.formatTaskDisplay(task));
                            }
                            try{
                                // Get task ID to delete
                                int id = NumberUtils.inputPositiveInterger("Enter Task ID to delete: ");
        
                                // Delete task
                                Task deletedTask = controller.deleteTask(String.valueOf(id));
                                //controller.deleteTask(String.valueOf(id));
                                //System.out.println("Task deleted successfully!");
                                System.out.println("Deleted task: " + controller.formatTaskDisplay(deletedTask));
                                // Ask if user wants to continue deleting
                                if (!StringUtils.checkInputYesNo("Do you want to continue deleting task? (Y/N): ")) {
                                    break;
                                }
                            }catch(Exception e){
                                System.out.println("Error: " + e.getMessage());
                                if (!StringUtils.checkInputYesNo("Do you want to try again? (Y/N): ")) {
                                    break;
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println("\n-------- Task List --------");
                        List<Task> tasks = controller.getDataTasks();
                        if (tasks.isEmpty()) {
                            System.out.println("No tasks found!");
                            break;
                        }
        
                        System.out.println("----------------------------------------- Task ---------------------------------------");
                        System.out.printf("%-3s %-15s %-15s %-15s %-7s %-15s %-15s\n", 
                            "ID", "Name", "Task Type","Date", "Time", "Assignee", "Reviewer");
        
                        for (Task task : tasks) {
                            System.out.println(controller.formatTaskDisplay(task));
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            System.out.println();
        }
    }
}
