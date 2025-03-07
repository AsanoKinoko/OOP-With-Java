/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

/**
 *
 * @author DELL
 */
public class TaskValidator {
    
    /**
     * Validate task type ID
     * @param taskTypeIdString the task type ID to validate
     * @return the validated task type ID
     * @throws Exception if the task type ID is invalid
     */
    public int validateTaskTypeId(String taskTypeIdString) throws Exception {
        int taskTypeId = Integer.parseInt(taskTypeIdString);
        if (taskTypeId < 1 || taskTypeId > 4) {
            throw new Exception("Task type ID must be between 1 and 4!");
        }
        return taskTypeId;
    }
    
    /**
     * Validate plan time
     * @param planTimeString the plan time to validate
     * @return the validated plan time
     * @throws Exception if the plan time is invalid
     */
    public double validatePlanTime(String planTimeString) throws Exception {
        double planTime = Double.parseDouble(planTimeString);
        if (planTime < 8.0 || planTime > 17.5 || (planTime * 10) % 5 != 0) {
            throw new Exception("Plan time must be between 8.0 and 17.5 and in increments of 0.5!");
        }
        return planTime;
    }
    
    /**
     * Validate plan time range
     * @param planFrom the start time
     * @param planTo the end time
     * @throws Exception if the time range is invalid
     */
    public void validatePlanTimeRange(double planFrom, double planTo) throws Exception {
        if (planFrom >= planTo) {
            throw new Exception("Plan From must be less than Plan To!");
        }
    }
}