# Binary Search Algorithm Implementation

## Design Questions and Answers

### Q: Tại sao chúng ta lại đưa Array vào contructor mà lại không đưa array vào hàm binarySearch trong khi function binarySearch là một function private và không thể truy cập từ bên ngoài?

#### A: Có một số lý do quan trọng để giữ array như một biến instance thay vì truyền nó như một tham số:

1. **Mục đích sử dụng của class**: 
   - Class `BinarySearch` được thiết kế để làm việc với một mảng cụ thể trong suốt vòng đời của nó
   - Khi tạo một đối tượng `BinarySearch`, bạn đang chỉ định mảng mà bạn muốn thực hiện các thao tác tìm kiếm nhị phân

2. **Tối ưu hóa**:
   - Mảng được sắp xếp một lần duy nhất trong constructor
   - Nếu đưa mảng vào hàm `binarySearch`, mỗi lần gọi hàm sẽ phải sắp xếp lại mảng (tốn thời gian)
   - Tránh truyền cùng một array nhiều lần một cách không cần thiết

3. **Hiệu quả và an toàn**:
   - Sắp xếp mảng một lần duy nhất trong constructor
   - Lưu trữ mảng đã sắp xếp như một trạng thái của object
   - Cho phép các phương thức trong class chia sẻ mảng này một cách an toàn

Đây là một ví dụ tốt về việc sử dụng trạng thái của object (instance variables) để chia sẻ dữ liệu giữa các phương thức một cách hiệu quả và an toàn.
