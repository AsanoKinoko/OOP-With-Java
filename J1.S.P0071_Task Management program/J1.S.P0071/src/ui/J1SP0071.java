/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ui;

import controller.TaskController;
import utils.DateUtils;
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
                        addTask();
                        break;
                    case 2:
                        deleteTask();
                        break;
                    case 3:
                        showTasks();
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
    
    /**
     * Add a new task
     * @throws Exception if there's an error in the input data
     */
    private static void addTask() throws Exception {
        System.out.println("\n-------- Add Task --------");
        
        // Display task types
        controller.displayTaskTypes();
        
        // Get task information from user
        int taskTypeId = NumberUtils.inputPositiveInterger("Enter Task Type ID: ");
        String requirementName = StringUtils.checkInputString("Enter Requirement Name: ");
        String date = DateUtils.getDateString("Enter Date (dd-MM-yyyy): ");
        double planFrom = NumberUtils.inputPositiveDouble("Enter Plan From (8.0-17.5): ");
        double planTo = NumberUtils.inputPositiveDouble("Enter Plan To (8.0-17.5): ");
        String assignee = StringUtils.checkInputString("Enter Assignee: ");
        String reviewer = StringUtils.checkInputString("Enter Reviewer: ");
        
        // Add task
        int taskId = controller.addTask(requirementName, assignee, reviewer, String.valueOf(taskTypeId), date, String.valueOf(planFrom), String.valueOf(planTo));
        System.out.println("Task added successfully with ID: " + taskId);
    }
    
    /**
     * Delete a task
     * @throws Exception if the task with the given ID doesn't exist
     */
    private static void deleteTask() throws Exception {
        System.out.println("\n-------- Delete Task --------");
        
        while(true){
            // Display current tasks and check if there are any tasks
            if (!controller.displayTasks()) {
                return;
            }
            try{
                // Get task ID to delete
                int id = NumberUtils.inputPositiveInterger("Enter Task ID to delete: ");
        
                // Delete task
                controller.deleteTask(String.valueOf(id));
                System.out.println("Task deleted successfully!");
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
    }
    
    /**
     * Show all tasks
     */
    private static void showTasks() {
        System.out.println("\n-------- Task List --------");
        controller.displayTasks();
    }
}
