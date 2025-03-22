# 쇼핑몰 상품 관리 시스템 구현

## 요구 사항

### 1. 회원 정보 관리

- `Customer` 클래스를 정의하여 회원 ID와 이름을 저장하는 멤버 변수(`id`, `name`)를 선언합니다.
- 생성자, getter, setter 메서드를 구현합니다.
- `toString()` 메서드를 오버라이드하여 `회원ID`와 `이름`을 출력할 수 있도록 합니다.

### 2. 상품 정보 관리

- `Product` 클래스를 정의하여 상품 ID, 상품명, 가격을 저장하는 멤버 변수(`productId`, `productName`, `price`)를 선언합니다.
- 생성자, getter, setter 메서드를 구현하고, `toString()` 메서드를 오버라이드하여 상품 정보를 출력할 수 있도록 합니다.

### 3. 주문 관리

- `OrderManager` 클래스를 정의하여 `Map<String, List<Product>>` 형태로 각 회원별 주문 내역을 관리합니다.
- `addProductToOrder(String customerId, Product product)` 메서드를 정의하여 특정 고객의 주문 목록에 상품을 추가하는 기능을 구현합니다.
- `getOrderList(String customerId)` 메서드를 정의하여 특정 회원의 주문 목록을 문자열로 반환하는 기능을 구현합니다.

### 4. 주문 조회 및 관리

- `main()` 메서드를 구현하여 샘플 데이터를 이용한 상품 추가, 주문 추가, 주문 목록 조회 기능을 시연합니다.

## 출력 예시

- 회원ID: CUST001 -> 주문 상품: [상품1 - 10000원]; [상품2 - 20000원] 회원ID: CUST002 -> 주문 상품: [상품3 - 30000원] 