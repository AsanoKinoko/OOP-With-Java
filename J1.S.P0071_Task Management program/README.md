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

- ui package (J1SP0071):
Calls to: controller, utils
Returns no package
- controller package (TaskController):
Calls to: bo, utils
Returns to: ui
- bo package (TaskManager, TaskValidator):
Calls to: entity, utils
Returns to: controller
- entity package (Task, TaskType):
Calls to no package
Returns to: bo, controller (when getting list)
- utils package (DateUtils, StringUtils, NumberUtils, MenuUtils):
Returns no other package
Returns to: ui, controller, bo

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

## Triển khai OOP
### 1. Tính đóng gói (Encapsulation)
- Tất cả các thuộc tính trong các lớp như Task, TaskType đều được khai báo private và chỉ có thể truy cập thông qua các phương thức getter/setter.
- Ví dụ: Trong lớp Task, các thuộc tính như id, taskTypeId, requirementName, v.v. đều được khai báo private và có các phương thức getter/setter tương ứng.

### 2. Tính đa hình (Polymorphism)
- Trong project này, tính đa hình được thể hiện qua việc ghi đè (override) phương thức toString() trong các lớp Task và TaskType để hiển thị thông tin theo định dạng riêng.

### 3. Tính trừu tượng (Abstraction)
- Project sử dụng các lớp như TaskManager, TaskController để trừu tượng hóa các thao tác phức tạp, giúp người dùng dễ dàng sử dụng mà không cần biết chi tiết bên trong.

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

## Tại sao giá trị mặc định của hàm findTaskIndexById return về lại là -1, ý nghĩa của nó là gì. Liệu có thể return về giá trị âm khác không, tại sao?

Việc return -1 trong phương thức findTaskIndexById là một convention phổ biến trong lập trình khi tìm kiếm index với những lý do sau:
Ý nghĩa của -1:
Index trong List/Array luôn bắt đầu từ 0 và là số không âm
-1 là giá trị không bao giờ là một index hợp lệ trong List/Array
Khi một phương thức trả về -1, nó ngầm báo "không tìm thấy phần tử"
Tại sao không dùng số âm khác (-2, -3,...):
Có thể dùng được, nhưng không nên vì:
-1 đã là convention được chấp nhận rộng rãi (ví dụ: String.indexOf(), ArrayList.indexOf())
Người đọc code có thể bị nhầm lẫn về ý nghĩa của các số âm khác
Không cần thiết phân biệt các trường hợp "không tìm thấy" khác nhau