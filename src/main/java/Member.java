import java.util.ArrayList;

public class Member {

    private String name;
    private ArrayList<Book> borrowed;

    public Member(String name){
        this.name = name;
        this.borrowed = new ArrayList<>();
    }

    public void addBookToMember(Book book){
        borrowed.add(book);
    }

    public int checkBook() {
        return borrowed.size();
    }
}
