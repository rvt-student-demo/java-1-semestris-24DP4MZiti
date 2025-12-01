package rvt;
import java.util.Scanner;
import java.util.ArrayList;

// Main koda fails
public class Bookk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.parseInt(scanner.nextLine());

            books.add(new Book(title, pages, year));
        }
    System.out.println("\nWhat information will be printed?");
    String choice = scanner.nextLine();

    if (choice.equals("everything")) {
        for (int i = 0; i < books.size(); i++ ) {
            Book b = books.get(i);
            System.out.println(b);
        }
    }   
    else if (choice.equals("name")) {
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(b.getTitle());

        }
    }

    }
    
}