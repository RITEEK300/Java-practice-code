
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Books{
    String nameOfBook;
    int price;
    String author;
    int publishYear;
    Books(String nameOfBook, int price, String author, int publishYear){
        this.nameOfBook = nameOfBook;
        this.price = price;
        this.author = author;
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return nameOfBook + " " + price + " " + author + " " + publishYear;
    }
}
public class LibraryManagement {
    public static void main(String[] args) {
        List<Books> books = Arrays.asList(
                new Books("Hindi", 200, "Riteek", 2003),
                new Books("English", 300, "Amit", 2010),
                new Books("Maths", 250, "Suresh", 2015),
                new Books("Science", 400, "Ravi", 2018),
                new Books("History", 150, "Ankit", 2005),
                new Books("Geography", 350, "Neha", 2020)
        );
//        books.stream().filter(book->book.nameOfBook.startsWith("H")).forEach(System.out::println);
//        books.stream().map(book->book.nameOfBook.toUpperCase()).forEach(System.out::println);
//        books.stream().sorted(Comparator.comparingInt(b -> b.publishYear))
//                .forEach(System.out::println);
//        books.stream().sorted(Comparator.comparingInt(book->book.price)).forEach(System.out::println);
//        books.stream().map(book->book.nameOfBook+" book is coming soon").forEach(System.out::println);
        books.stream().filter(book->book.nameOfBook.length()>=7).forEach(System.out::println);

    }
}
