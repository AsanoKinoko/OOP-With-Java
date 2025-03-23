# Chương trình Quản lý Sinh viên

## Mô tả chung
Chương trình Quản lý Sinh viên cho phép người dùng nhập thông tin của sinh viên (Tên, Lớp, Điểm), sau đó sử dụng Collection để sắp xếp tên sinh viên theo thứ tự từ A đến Z và hiển thị thông tin sinh viên lên màn hình.

## Cấu trúc chương trình
Chương trình được tổ chức theo mô hình MVC (Model-View-Controller) với các package chính:

1. **model**: Chứa các lớp mô hình dữ liệu
2. **controller**: Điều khiển luồng hoạt động của chương trình
3. **bo** (Business Object): Chứa các lớp xử lý nghiệp vụ
4. **ui**: Giao diện người dùng
5. **utils**: Các tiện ích hỗ trợ

## Các tính chất OOP được áp dụng

### 1. Tính đóng gói (Encapsulation)
- **Định nghĩa**: Đóng gói dữ liệu và phương thức thành một đơn vị và hạn chế truy cập trực tiếp từ bên ngoài.
- **Áp dụng trong code**:
  - Lớp `Student` có các thuộc tính private (`name`, `mark`, `classes`) và cung cấp các phương thức getter/setter công khai.
  - Các phương thức trong lớp `StudentManager` chỉ cho phép thao tác với danh sách sinh viên thông qua các phương thức xác định.

### 2. Tính kế thừa (Inheritance)
- **Định nghĩa**: Cho phép một lớp (lớp con) kế thừa các thuộc tính và phương thức từ một lớp khác (lớp cha).
- **Áp dụng trong code**:
  - Lớp `StudentComparator` kế thừa giao diện `Comparator<Student>` để cung cấp phương thức so sánh tùy chỉnh.

### 3. Tính đa hình (Polymorphism)
- **Định nghĩa**: Cho phép một đối tượng có nhiều hình thái khác nhau, tùy thuộc vào ngữ cảnh.
- **Áp dụng trong code**:
  - Phương thức `compare()` trong lớp `StudentComparator` là một ví dụ về đa hình thời gian chạy (runtime polymorphism), nó ghi đè phương thức trong giao diện `Comparator`.
  - Phương thức `Collections.sort()` nhận tham số là `Comparator` nhưng thực tế sử dụng implementation cụ thể là `StudentComparator`.

### 4. Tính trừu tượng (Abstraction)
- **Định nghĩa**: Ẩn chi tiết cài đặt và chỉ hiển thị chức năng cần thiết.
- **Áp dụng trong code**:
  - `StudentController` trừu tượng hóa logic xử lý, che giấu chi tiết cài đặt của việc nhập liệu và sắp xếp.
  - Người dùng chỉ cần biết cách sử dụng chương trình mà không cần biết chi tiết cài đặt bên trong.

## Các nguyên tắc thiết kế OOP được áp dụng

### 1. Nguyên tắc đơn trách nhiệm (Single Responsibility Principle)
- Mỗi lớp chỉ có một trách nhiệm duy nhất:
  - `Student`: Chỉ chứa dữ liệu sinh viên
  - `StudentInputer`: Chỉ chịu trách nhiệm nhập dữ liệu
  - `StudentManager`: Chỉ chịu trách nhiệm sắp xếp và hiển thị
  - `StudentController`: Điều phối quá trình xử lý

### 2. Phân tách mối quan tâm (Separation of Concerns)
- Chương trình được chia thành các module riêng biệt:
  - Module giao diện người dùng (ui)
  - Module xử lý nghiệp vụ (bo)
  - Module điều khiển (controller)
  - Module dữ liệu (model)
  - Module tiện ích (utils)

### 3. Sử dụng giao diện (Interface)
- Giao diện `Comparator` được triển khai để hỗ trợ việc sắp xếp sinh viên theo nhiều tiêu chí khác nhau.

## Mô tả chi tiết các lớp

### 1. Lớp Student (model)
- **Thuộc tính**: name, classes, mark
- **Phương thức**: Constructors, getters/setters

### 2. Lớp StudentComparator (model)
- **Phương thức**: compare() - So sánh sinh viên dựa trên tên

### 3. Lớp StudentInputer (bo)
- **Phương thức**: inputStudents() - Nhập thông tin sinh viên từ người dùng

### 4. Lớp StudentManager (bo)
- **Phương thức**:
  - sortStudent() - Sắp xếp danh sách sinh viên theo tên
  - display() - Hiển thị danh sách sinh viên

### 5. Lớp StudentController (controller)
- **Phương thức**: execute() - Điều khiển luồng thực thi chương trình

### 6. Lớp StringUtils và NumberUtils (utils)
- **Phương thức**:
  - checkInputString() - Kiểm tra và nhận chuỗi đầu vào
  - checkInputYesNo() - Kiểm tra và nhận câu trả lời Yes/No
  - inputPositiveFloat() - Kiểm tra và nhận số thực dương

### 7. Lớp J1SP0068 (ui)
- **Phương thức**: main() - Điểm khởi chạy chương trình

## Luồng hoạt động chương trình
1. Người dùng chạy chương trình
2. Chương trình hiển thị màn hình nhập thông tin sinh viên
3. Người dùng nhập thông tin sinh viên (Tên, Lớp, Điểm)
4. Chương trình hỏi người dùng có muốn tiếp tục nhập thêm thông tin không
5. Sau khi nhập xong, chương trình sắp xếp sinh viên theo tên (A-Z)
6. Chương trình hiển thị danh sách sinh viên đã sắp xếp
7. Chương trình kết thúc
