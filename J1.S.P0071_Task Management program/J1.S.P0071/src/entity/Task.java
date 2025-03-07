package entity;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Task class represents a task with all its attributes
 */
public class Task {
    private int id;
    private int taskTypeId;
    private String requirementName;
    private Date date;
    private double planFrom;
    private double planTo;
    private String assignee;
    private String reviewer;

    /**
     * Constructor for Task
     * @param id the ID of the task
     * @param taskTypeId the ID of the task type
     * @param requirementName the name of the requirement
     * @param date the date of the task
     * @param planFrom the start time of the task
     * @param planTo the end time of the task
     * @param assignee the assignee of the task
     * @param reviewer the reviewer of the task
     */
    public Task(int id, int taskTypeId, String requirementName, Date date, 
            double planFrom, double planTo, String assignee, String reviewer) {
        this.id = id;
        this.taskTypeId = taskTypeId;
        this.requirementName = requirementName;
        this.date = date;
        this.planFrom = planFrom;
        this.planTo = planTo;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    /**
     * Get the ID of the task
     * @return the ID
     */
    public int getId() {
        return id;
    }

    /**
     * Set the ID of the task
     * @param id the ID to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Get the task type ID
     * @return the task type ID
     */
    public int getTaskTypeId() {
        return taskTypeId;
    }

    /**
     * Set the task type ID
     * @param taskTypeId the task type ID to set
     */
    public void setTaskTypeId(int taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    /**
     * Get the requirement name
     * @return the requirement name
     */
    public String getRequirementName() {
        return requirementName;
    }

    /**
     * Set the requirement name
     * @param requirementName the requirement name to set
     */
    public void setRequirementName(String requirementName) {
        this.requirementName = requirementName;
    }

    /**
     * Get the date of the task
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Set the date of the task
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Get the plan from time
     * @return the plan from time
     */
    public double getPlanFrom() {
        return planFrom;
    }

    /**
     * Set the plan from time
     * @param planFrom the plan from time to set
     */
    public void setPlanFrom(double planFrom) {
        this.planFrom = planFrom;
    }

    /**
     * Get the plan to time
     * @return the plan to time
     */
    public double getPlanTo() {
        return planTo;
    }

    /**
     * Set the plan to time
     * @param planTo the plan to time to set
     */
    public void setPlanTo(double planTo) {
        this.planTo = planTo;
    }

    /**
     * Get the assignee
     * @return the assignee
     */
    public String getAssignee() {
        return assignee;
    }

    /**
     * Set the assignee
     * @param assignee the assignee to set
     */
    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    /**
     * Get the reviewer
     * @return the reviewer
     */
    public String getReviewer() {
        return reviewer;
    }

    /**
     * Set the reviewer
     * @param reviewer the reviewer to set
     */
    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    /**
     * Format the date to string
     * @return the formatted date
     */
    public String getDateString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return String.format("%-3d %-3d %-15s %-15s %-7.1f %-7.1f %-15s %-15s", 
                id, taskTypeId, requirementName, dateFormat.format(date), 
                planFrom, planTo, assignee, reviewer);
    }
} 