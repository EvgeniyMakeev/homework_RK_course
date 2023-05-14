package library;

public class Book implements Comparable<Book>{
    private int id;
    private String title;
    private Genre genre;

    public Book(int id, String title, Genre genre) {
        this.id = id;
        this.title = title;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ", Title: " + getTitle() + ", Genre: " + getGenre();
    }

    @Override
    public int compareTo(Book o) {
        return getTitle().compareTo(o.getTitle());
    }
}
