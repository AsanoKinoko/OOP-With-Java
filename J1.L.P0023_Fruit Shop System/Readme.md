Mối quan hệ giữa các Entity:
class Fruit {
    private String fruitId;
    private String fruitName;
    private double price;
    private int quantity;
    private String origin;
}

class OrderDetail {
    private Fruit fruit;
    private int quantity;
    private double amount;
}

class Order {
    private String customerName;
    private ArrayList<OrderDetail> orderDetails;
    private double total;
}
+ Fruit: Là đơn vị cơ bản nhất, đại diện cho một loại trái cây trong cửa hàng
+ OrderDetail: Thể hiện mối quan hệ "has-a" với Fruit (1 OrderDetail chứa 1 Fruit) và lưu thông tin về số lượng mua
+ Order: Thể hiện mối quan hệ "has-many" với OrderDetail (1 Order chứa nhiều OrderDetail)
- Lý do chọn Order để quản lý OrderDetails:
+ Một đơn hàng luôn phải chứa các chi tiết đơn hàng
+ OrderDetail không thể tồn tại độc lập mà không thuộc về một Order nào
+ Việc tính tổng tiền cần dựa trên tất cả các OrderDetail trong Order

Các lớp Manager:
class FruitManager {
    private ArrayList<Fruit> fruits;
}

class OrderManager {
    private HashMap<String, Order> orders;
}
+ FruitManager: Quản lý danh sách trái cây (inventory)
+ OrderManager: Quản lý đơn hàng theo khách hàng

Controller:
class FruitController {
    private FruitManager fruitManager;
    private OrderManager orderManager;
}
