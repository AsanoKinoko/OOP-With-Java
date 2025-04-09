package controller;

import bo.TaskInputer;
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
    private TaskInputer taskInputer;
    
    /**
     * Constructor for TaskController
     * Initializes the task manager
     */
    public TaskController() {
        taskManager = new TaskManager();
        taskInputer = new TaskInputer();
    }
    
    /**
     * Add a new task
     * @return the ID of the newly added task
     * @throws Exception if there's an error in the input data
     */
    public int addTask() throws Exception {
        displayTaskTypes();
        Task taskInput = taskInputer.inputTask();
        return taskManager.addTask(
                taskInput.getRequirementName(), 
                taskInput.getAssignee(), 
                taskInput.getReviewer(), 
                String.valueOf(taskInput.getTaskTypeId()),
                new SimpleDateFormat("dd-MM-yyyy").format(taskInput.getDate()), 
                String.valueOf(taskInput.getPlanFrom()), 
                String.valueOf(taskInput.getPlanTo()));
    }
    
    /**
     * Delete a task by ID
     * @param id the ID of the task to delete
     * @throws Exception if the task with the given ID doesn't exist
     */
    public Task deleteTask(String id) throws Exception {
        return taskManager.deleteTask(id);
    }
    
    /**
     * Get all tasks
     * @return the list of all tasks
     */
    public List<Task> getDataTasks() {
        return taskManager.getDataTasks();
    }
    
    public boolean hasTasks() {
        return !getDataTasks().isEmpty();
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
    
    public String formatTaskDisplay(Task task) {
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
    public void displayTasks() {
        List<Task> tasks = getDataTasks();
        if (tasks.isEmpty()) {
            System.out.println("No tasks found!");
            return;
        }
        
        System.out.println("----------------------------------------- Task ---------------------------------------");
        System.out.printf("%-3s %-15s %-15s %-15s %-7s %-15s %-15s\n", 
                "ID", "Name", "Task Type","Date", "Time", "Assignee", "Reviewer");
        
        for (Task task : tasks) {
            System.out.println(formatTaskDisplay(task));
        }
    }
} 