package section5_construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayInfo();

        Book b2 = new Book("Hello JAVA", "SEO");
        b2.displayInfo();

        Book b3 = new Book("JPA", "kim", 500);
        b3.displayInfo();

    }
}
