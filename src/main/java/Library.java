import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book1;
    private int capacity;

    public Library(int capacity){
        this.book1 = new ArrayList<>();
        this.capacity = capacity;
    }

    public int booksCount() {
        return book1.size();
    }

    public void addBook(Book book) {
        if (booksCount() < capacity) book1.add(book);
    }
}
