package weekend.service;

import weekend.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderManager {

    /*
     * OrderManager 클래스를 정의하여 Map<String, List<Product>> 형태로 각 회원별 주문 내역을 관리합니다.
     * addProductToOrder(String customerId, Product product) 메서드를 정의하여 특정 고객의 주문 목록에 상품을 추가하는 기능을 구현합니다.
     * getOrderList(String customerId) 메서드를 정의하여 특정 회원의 주문 목록을 문자열로 반환하는 기능을 구현합니다.
     */

    private Map<String, List<Product>> orders = new HashMap<>();

    public void addProductToOrder(String customerId, Product product) {

        if (orders.get(customerId) == null) {

            List<Product> productList = new ArrayList<Product>();
            productList.add(product);
            orders.put(customerId, productList);

        } else {

            orders.get(customerId).add(product);
        }
    }

    //회원ID: CUST001 -> 주문 상품: [상품1 - 10000원]; [상품2 - 20000원] 회원ID: CUST002 -> 주문 상품: [상품3 - 30000원]
    public void getOrderList(String customerId) {
        String listId = orders.get(customerId).toString();
        String result = "";
        result += "회원ID: " + customerId + " -> 주문 상품: " + listId + "; ";
        System.out.println(result);
    }
}
