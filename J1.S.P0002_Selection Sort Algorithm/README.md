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
- Vòng lặp ngoài (for (int i = 0; i < n - 1; i++)):
Lặp 𝑛 − 1 lần, với 𝑖 chạy từ 0 đến 𝑛 − 2.
- Vòng lặp trong (for (int j = i + 1; j < n; j++)):
+ Ở lần lặp thứ 𝑖, vòng lặp trong duyệt qua 𝑛 − 𝑖 − 1 phần tử trong phần chưa sắp xếp.
+ Tổng số lần lặp qua vòng lặp trong: (𝑛 − 1) + (𝑛 − 2) + ... + 1 = (𝑛 − 1)𝑛/2. Đây là một cấp số cộng, dẫn đến tổng số thao tác là 𝑂(𝑛^2).
- Hoán đổi (swap):
+ Hoán đổi mỗi lần tìm được phần tử nhỏ nhất, xảy ra 𝑛 − 1 lần.
+ Số lượng thao tác hoán đổi không ảnh hưởng đáng kể đến độ phức tạp tổng thể.
=> Tốt nhất: 𝑂(𝑛^2) (do dù mảng đã sắp xếp, vẫn phải duyệt toàn bộ phần chưa sắp xếp để tìm phần tử nhỏ nhất).
Tệ nhất: 𝑂(𝑛^2) (khi mảng ngẫu nhiên hoặc sắp xếp ngược).
Trung bình: 𝑂(𝑛^2).
Không gian:
+ Không sử dụng bộ nhớ bổ sung ngoài các biến tạm như min_idx và biến lặp (i, j).
+ Độ phức tạp không gian: 𝑂(1).
