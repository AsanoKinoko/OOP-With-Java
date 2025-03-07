# Task Management System

A Java application to manage tasks and task types for employees.

## Project Structure

The project follows Object-Oriented Programming principles with the following structure:

- **entity**: Contains the data models
  - `Task.java`: Represents a task with attributes like ID, requirement name, date, etc.
  - `TaskType.java`: Represents the type of task with fixed data

- **bo (Business Object)**: Contains the business logic
  - `TaskManager.java`: Handles task management operations like adding, deleting, and retrieving tasks

- **controller**: Connects the UI with the business logic
  - `TaskController.java`: Handles user interactions and delegates to the business layer

- **ui**: Contains the user interface
  - `Main.java`: The main class to run the application and handle user interactions

- **utils**: Contains utility classes
  - `Validator.java`: Provides utility methods for input validation

## Features

1. **Add Task**: Add a new task with the following information:
   - Task Type ID (1-4)
   - Requirement Name
   - Date (dd-MM-yyyy)
   - Plan From (8.0-17.5)
   - Plan To (8.0-17.5)
   - Assignee
   - Reviewer

2. **Delete Task**: Delete a task by its ID

3. **Display Tasks**: Show all tasks sorted by ID

## Task Types

The system has four predefined task types:
1. Code
2. Test
3. Design
4. Review

## Validation Rules

- Task Type ID must exist (1-4)
- Date must be in the format dd-MM-yyyy
- Plan From and Plan To must be between 8.0 and 17.5 (8:00 AM to 5:30 PM) in increments of 0.5
- Plan From must be less than Plan To

## How to Run

1. Compile the Java files
2. Run the Main class
3. Follow the on-screen instructions to use the application

## Tại sao ở Task và TaskType taskTypeId là int, planFrom planTo là double mà ở TaskManager và TaskController lại để nó là String xong ở Main chúng ta lại phải convert type của chúng?

1. Tách biệt giữa giao diện người dùng và logic nghiệp vụ
Khi thiết kế theo mô hình MVC (Model-View-Controller), một thực tiễn tốt là giữ cho các lớp controller và service (business logic) độc lập với cách dữ liệu được nhập vào. Dữ liệu từ người dùng thường được nhập dưới dạng chuỗi (String), và việc chuyển đổi từ String sang các kiểu dữ liệu thích hợp nên được xử lý ở một nơi tập trung.
2. Xử lý lỗi tập trung
Bằng cách nhận các tham số dưới dạng String, TaskManager có thể xử lý tất cả các lỗi chuyển đổi kiểu dữ liệu tại một nơi. Điều này giúp tập trung việc xác thực và xử lý lỗi, thay vì phân tán nó qua nhiều lớp.
3. Linh hoạt trong việc nhận dữ liệu từ nhiều nguồn
Bằng cách nhận dữ liệu dưới dạng String, các phương thức có thể dễ dàng nhận dữ liệu từ nhiều nguồn khác nhau như giao diện người dùng, API, tệp cấu hình, v.v. mà không cần thay đổi chữ ký phương thức.
4. Tuân thủ yêu cầu của đề bài
Trong yêu cầu của bài tập, có đề cập:
Option 1: Add the task.
o Implement function: public int addTask(String requirementName, String assignee, String, String, String taskTypeID expert date, String, the planTo planFrom String) throws Exception