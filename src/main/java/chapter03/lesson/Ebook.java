package chapter03.lesson;

public class Ebook extends Book {
    private double discountRate;

    public Ebook(String name, String author, double price, double discount) { // 부모의 생성자 의미
        super(name, author, price); // 자식과 부모가 같은 이름 변수나 메서드가 있으면 super()사용, 부모 클래스의 생성자를 호출
        this.discountRate = discount;
    }

    @Override
    public double getFinalPrice() {
        return super.getPrice()-(discountRate * getPrice());
    }
}
// 할인기능
// ebook은 할인된 가격이 있구나
