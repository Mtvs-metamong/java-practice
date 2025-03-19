package chapter05.mission;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalManager implements RentBool {
    Map<String,List<Book>> bookMap = new HashMap<String,List<Book>>();


    @Override
    public void rentBook(String memberId, Book book) {

        if(bookMap.get(memberId) == null){ //null :주소값이 없는것
            List<Book> books = new ArrayList<>(); // 리스트 하나밖에 안써서
            books.add(book);
            bookMap.put(memberId, books);
        }
        else{
            List<Book> a= bookMap.get(memberId); //list에 book타입만 들어간다...
            a.add(book);
        }
         // 마지막것만 저장되는 거 방지


    }

@Override
public String getRentalList(String memberId) {
        List<Book> result = bookMap.get(memberId); // list니까 list로 받는다. 주소값
        String result1 = "";
        for (Book book : result) {
            result1 += book.getTitle();

        }
       return result1;
}
    public static void main(String[] args) {

        RentalManager rm = new RentalManager();
        String[] title = {"자바", "파이썬", "C"};
        String[] title1 = {"자바", "파이", "b"};

        for(int i=0;i<3;i++) {
            rm.rentBook("홍길동", new Book(title[i]));
            rm.rentBook("추영우", new Book(title1[i]));
        }
        String result3= "";
        result3 = rm.getRentalList("추영우");
        System.out.println(result3);

    }

}

// 키 값에 맞게 리스트를 만들어줘야하는데
