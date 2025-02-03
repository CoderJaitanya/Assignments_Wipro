class Item {                                                              // Parent
    String title;
    String author;
    int publicationYear;

    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void displayDetails() {
        System.out.println("Title:- " + title);
        System.out.println("Author:- " + author);
        System.out.println("Publication Year:- " + publicationYear);
    }
}


class Book extends Item {                                                        // Child 1
    String genre;

    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class Magazine extends Item {                                                 // Child 2
    int issueNumber;

    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

public class Day3_Q1 {
    public static void main(String[] args) {
        Book b = new Book("Discovery of India", "Jawaharlal Nehru", 1946, "History");
        Magazine m = new Magazine("Future Funds", "Daniel Lee", 2025, 6);

        System.out.println("---------------------Book Details------------------------");
        b.displayDetails();
        System.out.println();

        System.out.println("--------------------Magazine Details---------------------");
        m.displayDetails();
    }
}
