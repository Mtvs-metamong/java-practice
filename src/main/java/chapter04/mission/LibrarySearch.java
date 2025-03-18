package chapter04.mission;

public class LibrarySearch {
    public static void main(String[] args) {

        Book[] book = new Book[]{
                new Book("java programming", " java ",9.0),
                new Book("clean code " , " c ",7.0),
                new Book("effective java" , " c ",4.0)
        };
        String result1=LibrarySearch.searchBooks(book, "java");
        System.out.println(result1);

    }

    public static String searchBooks(Book[] books, String keyword){
        String result = "";

        for (Book book : books) {
            if(book.matches(keyword)){
                result += book.getTitle() + "; ";

            }
        }
        return result;
    }

}
