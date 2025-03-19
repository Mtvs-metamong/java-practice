package chapter03.lesson;

public class BookinvantoryCalculator {
    private Book[] books; //배열은 복수타입으로 작성
    public BookinvantoryCalculator(Book[] books) {
        this.books = books;
    } //Book 객체들을 배열로 전달받아 books 변수에 저장
    public String calculateInvantory() {
        double totalPrice = 0 ;
        double highestPrice = 0 ;
        double lowestPrice = 0 ;
        String highestPriceBook = "";
        String lowestPriceBook = "";

        int length = books.length;
        for(int i = 0; i < length; i++) {
            double price = books[i].getFinalPrice();
            totalPrice+=price;

            if(price > highestPrice) {
                highestPrice = price;
                highestPriceBook = books[i].getTitle();
            }
            if(price < lowestPrice) {
                lowestPrice = price;
                lowestPriceBook = books[i].getTitle();
            }
        }
        double averagePrice = totalPrice / length;
        return " 총 재고 가치 : " + totalPrice + ", 평균 가격 : " + averagePrice + ", 최고가 도서 : " +
                highestPriceBook + " , 최저가 도서  : " + lowestPriceBook ;

    }

}
// 다형성 활용하라  = 메서드 구현하라