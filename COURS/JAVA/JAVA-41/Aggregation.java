public class Aggregation {
    public static void main(String[] args) {
        Book book1 = new Book("The Fellow of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = { book1, book2, book3 };

        Library library = new Library("NYC Public Library", 1897, books);
        library.displayInfo();
    }
}

class Book {
    String title;
    int pages;

    Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    String displayInfo() {
        return this.title + " (" + this.pages + " pages)";
    }

}

class Library {
    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books available: ");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

}
