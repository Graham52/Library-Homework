import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MemberTest {

    Book book;
    Library library;
    Member member;

    @Before
    public void before () {
        book = new Book();
        member = new Member("John");
        library = new Library(10);
    }

    @Test
    public void addBookToMemberTest(){
        member.addBookToMember(book);
        assertEquals(1, member.checkBook());
    }


}
