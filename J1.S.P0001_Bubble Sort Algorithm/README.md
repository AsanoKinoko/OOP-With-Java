Để tính độ phức tạp của một thuật toán, chúng ta cần phân tích cách thuật toán hoạt động dựa trên số lượng thao tác (so sánh, gán, hoặc các phép toán khác) liên quan đến kích thước đầu vào. Có hai khía cạnh chính khi đánh giá độ phức tạp:
- Độ phức tạp thời gian (Time Complexity): Số lần thao tác thuật toán thực hiện theo kích thước đầu vào 
𝑛.
- Độ phức tạp không gian (Space Complexity): Lượng bộ nhớ bổ sung mà thuật toán cần sử dụng.

Bubble Sort
- Ý tưởng thuật toán:
+ Duyệt qua mảng nhiều lần, trong mỗi lần, so sánh cặp phần tử kề nhau và hoán đổi nếu chúng không theo thứ tự mong muốn.
+ Lặp lại cho đến khi mảng được sắp xếp.
- Phân tích:
Số vòng lặp:
+ Vòng lặp ngoài: 𝑛 − 1 lần (với 𝑛  là số phần tử trong mảng).
+ Vòng lặp trong: Ở lần lặp thứ 𝑖, cần duyệt qua 𝑛 − 𝑖 − 1 cặp phần tử.
Số phép so sánh và hoán đổi:
+ Tệ nhất (Worst case): Mảng được sắp xếp ngược.
Số phép so sánh: (𝑛 − 1) + (𝑛 − 2) + … + 1 = 𝑛(𝑛 − 1)/2, tức 𝑂(𝑛^2)
Số phép hoán đổi: 𝑂(𝑛^2)
+ Tốt nhất (Best case): Mảng đã sắp xếp.
Số phép so sánh: 𝑂(𝑛^2).
Không cần hoán đổi nhưng vẫn phải kiểm tra: 𝑂(1).
=> Thời gian trung bình: 𝑂(𝑛^2).
Không gian: 𝑂(1) (sử dụng bộ nhớ bổ sung không đáng kể).

Phân chia package:
- Project được tổ chức thành các package riêng biệt với mục đích cụ thể:
+ bo: Business Object - chứa logic xử lý (BubbleSort)
+ ui: User Interface - chứa code giao diện người dùng
+ utils: Utilities - chứa các công cụ tiện ích

Tính đóng gói (Encapsulation):
Trong class BubbleSort:
- Thuộc tính array được khai báo private: private int[] array
- Các phương thức được phân chia access modifier rõ ràng:
+ private int[] sort(boolean sortOnOriginArray, boolean isAscending): phương thức private chỉ sử dụng trong nội bộ class
// Phương thức private thực hiện thuật toán sắp xếp nổi bọt
// sortOnOriginArray: quyết định sắp xếp trên mảng gốc hay bản sao
// isAscending: quyết định sắp xếp tăng dần hay giảm dần
// Đây là chi tiết triển khai nội bộ (implementation detail) của thuật toán. Người dùng class không cần biết và không nên trực tiếp tương tác với cách thuật toán được thực hiện.
// Bảo vệ tính toàn vẹn của dữ liệu bằng cách kiểm soát cách thức sắp xếp
// Cho phép thay đổi cách thực hiện thuật toán mà không ảnh hưởng đến code bên ngoài đang sử dụng class
+ public BubbleSort(int[] array): constructor public để khởi tạo đối tượng
// Constructor: Khởi tạo đối tượng BubbleSort với mảng đầu vào
+ public int[] getSortedArray(boolean isAscending): phương thức public để truy cập từ bên ngoài
// Phương thức public để client có thể lấy mảng đã sắp xếp
// isAscending: true để sắp xếp tăng dần, false để sắp xếp giảm dần
// Đây là interface công khai mà class cung cấp cho người dùng. Cung cấp một phương thức đơn giản và rõ ràng để người dùng có thể lấy kết quả sắp xếp. Ẩn đi độ phức tạp của thuật toán, người dùng chỉ cần quan tâm đến kết quả.


