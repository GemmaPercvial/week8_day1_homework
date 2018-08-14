import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Author author1 = new Author("JK", "Rowling");
        DBAuthor.save(author1);
        Author author2 = new Author("Stephen", "King");
        DBAuthor.save(author2);
        Author author3 = new Author("Roald", "Dahl");
        DBAuthor.save(author3);
        Author author4 = new Author("Dr", "Seuss");
        DBAuthor.save(author4);

        Book book1 = new Book("Harry Potter");
        DBBook.save(book1);
        Book book2 = new Book("The Green Mile");
        DBBook.save(book2);
        Book book3 = new Book("Matilda");
        DBBook.save(book3);
        Book book4 = new Book ("The Cat in the Hat");
        DBBook.save(book4);

        List<Author> authors = DBAuthor.getAll();

        Author foundAuthor = DBAuthor.findById(3);
    }
}
