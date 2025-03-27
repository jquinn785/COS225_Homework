public class LibraryTester {
    public static void main(String[] args) {
        Bookshelf bookshelfO = new Bookshelf();
        Bookshelf bookshelfT = new Bookshelf();

        bookshelfO.setFirstLetter('O');
        bookshelfT.setFirstLetter('T');

        System.out.println(bookshelfO);
        System.out.println(bookshelfT);

        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

        bookshelfO.addBook(book1);
        bookshelfO.addBook(book2);
        bookshelfO.addBook(book3);
        bookshelfO.addBook(book4);

        bookshelfT.addBook(book1);
        bookshelfT.addBook(book2);
        bookshelfT.addBook(book3);
        bookshelfT.addBook(book4);

        System.out.println(bookshelfO);
        System.out.println(bookshelfT);
    }
}
