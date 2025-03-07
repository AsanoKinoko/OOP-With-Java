package bo;

import entity.Task;
import entity.TaskType;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.DateUtils;

/**
 * TaskManager class handles business logic for task management
 */
public class TaskManager {
    private List<Task> tasks;
    private List<TaskType> taskTypes;
    private int lastId;

    /**
     * Constructor for TaskManager
     * Initializes the task list, task type list, and sets up predefined task types
     */
    public TaskManager() {
        tasks = new ArrayList<>();
        taskTypes = new ArrayList<>();
        lastId = 0;
        
        // Initialize predefined task types
        taskTypes.add(new TaskType(1, "Code"));
        taskTypes.add(new TaskType(2, "Test"));
        taskTypes.add(new TaskType(3, "Design"));
        taskTypes.add(new TaskType(4, "Review"));
    }

    /**
     * Add a new task
     * @param requirementName the name of the requirement
     * @param assignee the assignee of the task
     * @param reviewer the reviewer of the task
     * @param taskTypeId the ID of the task type
     * @param dateString the date of the task in string format (dd-MM-yyyy)
     * @param planFrom the start time of the task
     * @param planTo the end time of the task
     * @return the ID of the newly added task
     * @throws Exception if there's an error in the input data
     */
    public int addTask(String requirementName, String assignee, String reviewer, 
            String taskTypeId, String dateString, String planFrom, String planTo) throws Exception {
        TaskValidator taskValidator = new TaskValidator();
        // Validate task type ID
        int typeId = taskValidator.validateTaskTypeId(taskTypeId);
        
        // Validate and parse date
        Date date = DateUtils.parseDate(dateString);
        
        // Validate and parse plan times
        double from = taskValidator.validatePlanTime(planFrom);
        double to = taskValidator.validatePlanTime(planTo);
        
        // Validate plan time range
        taskValidator.validatePlanTimeRange(from, to);
        
        // Create and add the new task
        int id = ++lastId;
        Task newTask = new Task(id, typeId, requirementName, date, from, to, assignee, reviewer);
        tasks.add(newTask);
        
        return id;
    }

    /**
     * Delete a task by ID
     * @param idString the ID of the task to delete in string format
     * @throws Exception if the task with the given ID doesn't exist
     */
    public void deleteTask(String idString) throws Exception {
        try {
            int id = Integer.parseInt(idString);
            int index = findTaskIndexById(id);
            
            if (index == -1) {
                throw new Exception("Task with ID " + id + " not found!");
            }
            
            tasks.remove(index);
        } catch (NumberFormatException e) {
            throw new Exception("Invalid ID format. ID must be an integer.");
        }
    }

    /**
     * Get all tasks
     * @return the list of all tasks
     */
    public List<Task> getDataTasks() {
        return tasks;
    }

    /**
     * Get all task types
     * @return the list of all task types
     */
    public List<TaskType> getTaskTypes() {
        return taskTypes;
    }

    /**
     * Find a task type by ID
     * @param id the ID of the task type to find
     * @return the task type with the given ID, or null if not found
     */
    public TaskType findTaskTypeById(int id) {
        for (TaskType type : taskTypes) {
            if (type.getId() == id) {
                return type;
            }
        }
        return null;
    }

    /**
     * Find the index of a task by ID
     * @param id the ID of the task to find
     * @return the index of the task in the list, or -1 if not found
     */
    private int findTaskIndexById(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }
} 