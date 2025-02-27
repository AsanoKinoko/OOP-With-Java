Để tính độ phức tạp của một thuật toán, chúng ta cần phân tích cách thuật toán hoạt động dựa trên số lượng thao tác (so sánh, gán, hoặc các phép toán khác) liên quan đến kích thước đầu vào. Có hai khía cạnh chính khi đánh giá độ phức tạp:
- Độ phức tạp thời gian (Time Complexity): Số lần thao tác thuật toán thực hiện theo kích thước đầu vào 
𝑛.
- Độ phức tạp không gian (Space Complexity): Lượng bộ nhớ bổ sung mà thuật toán cần sử dụng.

Thuật toán Selection Sort hoạt động bằng cách chia mảng thành hai phần:
- Phần đã sắp xếp: Ban đầu trống, sau đó tăng dần kích thước.
- Phần chưa sắp xếp: Ban đầu chứa toàn bộ mảng, sau đó giảm dần kích thước.
Ở mỗi bước:
- Duyệt qua phần chưa sắp xếp để tìm phần tử nhỏ nhất (hoặc lớn nhất nếu sắp xếp giảm dần).
- Hoán đổi phần tử nhỏ nhất (hoặc lớn nhất) đó với phần tử đầu tiên trong phần chưa sắp xếp.
- Cập nhật phần đã sắp xếp bằng cách mở rộng nó thêm một phần tử.

Thời gian:
- Vòng lặp ngoài (for):
+ Chạy từ 𝑖 = 1 đến 𝑖 = 𝑛 − 1, tức lặp 𝑛 − 1 lần.
+ Đây là vòng lặp chính, điều khiển việc chèn từng phần tử vào đúng vị trí.
- Vòng lặp trong (while):
+ Trong trường hợp xấu nhất, vòng lặp while duyệt qua toàn bộ các phần tử đã được sắp xếp trước đó (từ 𝑗 = 𝑖 − 1 đến 𝑗 = 0).
+ Số lần lặp của while phụ thuộc vào vị trí của phần tử cần chèn:
Tốt nhất: Không cần lặp (khi mảng đã được sắp xếp đúng thứ tự).
Tệ nhất: Lặp 𝑖 lần (khi phần tử cần chèn nhỏ hơn tất cả phần tử trước đó).
- Số phép gán và so sánh:
Mỗi lần lặp của while, có một phép gán array[j + 1] = array[j] và một phép kiểm tra array[j] > key (hoặc array[j] < key nếu sắp xếp giảm dần).
=> Tốt nhất: 
+ Mảng đã được sắp xếp theo đúng thứ tự mong muốn. Vòng lặp while không chạy lần nào vì điều kiện array[j] > key (hoặc array[j] < key) luôn sai.
+ Số phép gán và so sánh: Mỗi lần lặp của vòng for chỉ thực hiện một phép gán array[j + 1] = key.
+ Độ phức tạp: 𝑂(𝑛) (vì vòng for chạy 𝑛 − 1 lần và không có vòng lặp lồng nhau).
Tệ nhất: 
+ Mảng được sắp xếp ngược thứ tự mong muốn. 
+ Vòng while lặp tối đa 𝑖 lần tại vòng lặp thứ 𝑖.
Tổng số lần lặp của while là: 1 + 2 + 3 + … + (𝑛 − 1) = (𝑛 − 1)𝑛/2. Đây là một cấp số cộng, và tổng của nó là 𝑂(𝑛^2).
+ Độ phức tạp: 𝑂(𝑛^2).
Trung bình: 
+ Mảng có thứ tự ngẫu nhiên.
+ Trung bình, vòng while sẽ lặp khoảng 𝑖 / 2 lần tại vòng lặp thứ 𝑖.
Tổng số lần lặp trung bình: 1/2.(1 + 2 + 3 + … + (𝑛 − 1)) = 1/2.(𝑛 − 1)𝑛/2
+ Độ phức tạp vẫn là 𝑂(𝑛^2), nhưng ít hơn tệ nhất một chút.
- Không gian:
+ Thuật toán không sử dụng thêm bộ nhớ đáng kể ngoài biến tạm key và các biến lặp (i, j).
+ Độ phức tạp không gian: 𝑂(1).
