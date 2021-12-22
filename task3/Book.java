package task3;

public class Book {
    private String author;
    private String title;
    private int year;

    public Book(){
        author = "";
        title = "";
        year = 0;
    }

    public Book(String _author, String _title, int _year) {
        author = _author;
        title = _title;
        year = _year;
    }

    public void SetYear(int _year) {
        year = _year;
    }
    public void SetTitle(String _title) {
        title = _title;
    }
    public void SetAuthor(String _author) {
        author = _author;
    }

    public String GetAuthor() {
        return author;
    }
    public String GetTitle() {
        return title;
    }
    public int GetYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Book: " +title+" author: "+author+" written in "+year;
    }
}
