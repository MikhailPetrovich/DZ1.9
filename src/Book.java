public class Book {

    private final String nameBook;
    private final Author author;
    private Integer yearOfPublication;

    public Book(String nameBook, Author author, int yearOfPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;

    }

    public String getNameBook() {
        return nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author=" + author +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }
}