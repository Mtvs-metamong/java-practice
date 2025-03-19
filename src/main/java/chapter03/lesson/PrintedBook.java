package chapter03.lesson;

public class PrintedBook extends Book {
    private double shippingCost;

    @Override
    public double getFinalPrice() {
        return super.getPrice() + shippingCost; // getPrice() 메서드를 호출하여 부모 클래스에서 정의된 가격을 가져옴
    }

    public PrintedBook(String name, String author, double price, double shippingCost) {
        super(name, author, price);
        this.shippingCost = shippingCost;
    }
}
