package entity;

/**
 * TaskType class represents the type of task with fixed data
 */
public class TaskType {
    private int id;
    private String name;

    /**
     * Constructor for TaskType
     * @param id the ID of the task type
     * @param name the name of the task type
     */
    public TaskType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Get the ID of the task type
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the task type
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the name of the task type
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the task type
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " - " + name;
    }
} 