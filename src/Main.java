public class Main {

    public static void main(String[] args) {


        Author author1 = new Author("Имя автора", "Фамилия автора");
        Author author2 = new Author("Имя автора ", "Фамилия автора");

        Book book1 = new Book("Название книги", author1,1999);
        Book book2 = new Book("Название книни", author2,2010);


        System.out.println(author1);
        System.out.println(book1);
        System.out.println(author2);
        System.out.println(book2);




    }
}

