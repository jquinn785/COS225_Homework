import java.util.ArrayList;

public class Bookshelf {
    private char firstLetter;
    ArrayList<Book> books = new ArrayList<Book>(8);

    public Bookshelf(){
        this.firstLetter = ' ';
    }

    public char getFirstLetter(){
        return firstLetter;
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void setFirstLetter(char firstLetter){
        this.firstLetter = firstLetter;
    }

    public void addBook(Book book){
        if (this.firstLetter == book.getFirstLetter()){
            books.add(book);
        }
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    @Override
    public String toString(){
        String outStr = "";
        if (books.isEmpty() != true){
            for (int i = 0; i < books.size(); i++){
                outStr += books.get(i);
                outStr += "   ";
            }
            return outStr;
        }
        else{
            return "Empty";
        }
    }
}