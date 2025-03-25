package controller;

import bo.TaskManager;
import entity.Task;
import entity.TaskType;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * TaskController class handles user interactions and connects UI with business logic
 */
public class TaskController {
    private TaskManager taskManager;
    
    /**
     * Constructor for TaskController
     * Initializes the task manager
     */
    public TaskController() {
        taskManager = new TaskManager();
    }
    
    /**
     * Add a new task
     * @param requirementName the name of the requirement
     * @param assignee the assignee of the task
     * @param reviewer the reviewer of the task
     * @param taskTypeId the ID of the task type
     * @param date the date of the task
     * @param planFrom the start time of the task
     * @param planTo the end time of the task
     * @return the ID of the newly added task
     * @throws Exception if there's an error in the input data
     */
    public int addTask(String requirementName, String assignee, String reviewer, 
            String taskTypeId, String date, String planFrom, String planTo) throws Exception {
        return taskManager.addTask(requirementName, assignee, reviewer, taskTypeId, date, planFrom, planTo);
    }
    
    /**
     * Delete a task by ID
     * @param id the ID of the task to delete
     * @throws Exception if the task with the given ID doesn't exist
     */
    public void deleteTask(String id) throws Exception {
        taskManager.deleteTask(id);
    }
    
    /**
     * Get all tasks
     * @return the list of all tasks
     */
    public List<Task> getDataTasks() {
        return taskManager.getDataTasks();
    }
    
    /**
     * Get all task types
     * @return the list of all task types
     */
    public List<TaskType> getTaskTypes() {
        return taskManager.getTaskTypes();
    }
    
    /**
     * Find a task type by ID
     * @param id the ID of the task type to find
     * @return the task type with the given ID, or null if not found
     */
    public TaskType findTaskTypeById(int id) {
        return taskManager.findTaskTypeById(id);
    }
    
    /**
     * Display all task types
     */
    public void displayTaskTypes() {
        List<TaskType> types = getTaskTypes();
        System.out.println("Task Type:");
        for (TaskType type : types) {
            System.out.println(type);
        }
    }
    
    private String formatTaskDisplay(Task task) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        TaskType taskType = findTaskTypeById(task.getTaskTypeId());
        String typeName = taskType != null ? taskType.getName() : String.valueOf(task.getTaskTypeId());
    
        return String.format("%-3d %-15s %-15s %-15s %-7.1f %-15s %-15s", 
            task.getId(), 
            task.getRequirementName(), 
            typeName, 
            dateFormat.format(task.getDate()), 
            (task.getPlanTo() - task.getPlanFrom()), 
            task.getAssignee(), 
            task.getReviewer());
    }
    /**
     * Display all tasks
     */
    public boolean displayTasks() {
        List<Task> tasks = getDataTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
            return false;
        }
        
        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.printf("%-3s %-15s %-15s %-15s %-7s %-15s %-15s\n", 
                "ID", "Name", "Task Type","Date", "Time", "Assignee", "Reviewer");
        
        for (Task task : tasks) {
            System.out.println(formatTaskDisplay(task));
        }
        return true;
    }
} 