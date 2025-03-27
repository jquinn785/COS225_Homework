public class Book {
    public String title;
    public String genere;

    public Book(String title, String genere) {
        this.title = title;
        this.genere = genere;
    }

    public char getFirstLetter(){
        char firstLetter = this.title.charAt(0);
        return firstLetter;
    }

    @Override
    public String toString(){
        return title;
    }
}
