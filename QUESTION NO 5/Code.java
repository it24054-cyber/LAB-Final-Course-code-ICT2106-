class Book {
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[5];

        books[0] = new Book(101, "Java Basics", 450);
        books[1] = new Book(102, "OOP in Java", 650);
        books[2] = new Book(103, "Data Structures", 700);
        books[3] = new Book(104, "Database Systems", 550);
        books[4] = new Book(105, "Computer Networks", 480);

        double sum = 0;

        System.out.println("Books with price greater than 500:");

        for (Book b : books) {
            if (b.price > 500) {
                System.out.println(b.bookId + " " + b.title + " " + b.price);
            }
            sum += b.price;
        }

        double average = sum / books.length;
        System.out.println("Average Price: " + average);
    }
}
