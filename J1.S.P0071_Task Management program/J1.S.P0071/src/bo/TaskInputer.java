/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import entity.Task;
import utils.DateUtils;
import utils.NumberUtils;
import utils.StringUtils;

/**
 *
 * @author DELL
 */
public class TaskInputer {
    private TaskValidator taskValidator;
    
    public TaskInputer() {
        taskValidator = new TaskValidator();
    }
    
    public Task inputTask() throws Exception {
        Task task = new Task();
        // Get task information from user
        while (true) {
            try {
                int taskTypeId = NumberUtils.inputPositiveInterger("Enter Task Type ID: ");
                taskValidator.validateTaskTypeId(String.valueOf(taskTypeId));
                task.setTaskTypeId(taskTypeId);
                break;
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        task.setRequirementName(StringUtils.checkInputString("Enter Requirement Name: "));
        // Convert string date to Date object
        while (true) {
            try {
                String dateStr = DateUtils.getDateString("Enter Date (dd-MM-yyyy): ");
                task.setDate(DateUtils.parseDate(dateStr));
                break;
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        // Get and validate plan time
        while (true) {
            try {
                double planFrom = NumberUtils.inputDouble("Enter Plan From (8.0-17.5): ");
                taskValidator.validatePlanTime(String.valueOf(planFrom));                
                double planTo = NumberUtils.inputDouble("Enter Plan To (8.0-17.5): ");
                taskValidator.validatePlanTime(String.valueOf(planTo));
                taskValidator.validatePlanTimeRange(planFrom, planTo);
                task.setPlanFrom(planFrom);
                task.setPlanTo(planTo);
                break;
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
        task.setAssignee(StringUtils.checkInputString("Enter Assignee: "));
        task.setReviewer(StringUtils.checkInputString("Enter Reviewer: "));
        
        return task;
    }
}
