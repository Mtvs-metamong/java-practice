package weekend;

import weekend.model.Product;
import weekend.service.OrderManager;

public class Application {
    public static void main(String[] args) {

//        main() 메서드를 구현하여 샘플 데이터를 이용한 상품 추가, 주문 추가, 주문 목록 조회 기능을 시연합니다.
        OrderManager orderManager = new OrderManager();
        Product product = new Product(
                "1", "바나나", 55.0
        );

        orderManager.addProductToOrder("aaa", product);
        orderManager.getOrderList("aaa");
    }
}
