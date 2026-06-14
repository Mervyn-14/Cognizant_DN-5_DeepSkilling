import java.util.Scanner;

public class LibraryManagementSystem {
    static void linearSearch(Book books[],String target) {

        for(int i = 0;i < books.length;i++) {
            if(books[i].title.equalsIgnoreCase(target)) {
                System.out.println( "\nBook Found");
                System.out.println("Book ID : " + books[i].bookId);
                System.out.println( "Title : " +books[i].title);
                System.out.println("Author : " +books[i].author);

                return;
            }
        }

        System.out.println("Book Not Found");
    }

    static void binarySearch(Book books[],String target) {

        int low = 0;
        int high = books.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            int result = books[mid].title  .compareToIgnoreCase(  target);

            if(result == 0) {

                System.out.println(  "\nBook Found");
                System.out.println( "Book ID : " + books[mid].bookId);
                System.out.println("Title : " + books[mid].title);
                System.out.println( "Author : " +books[mid].author);
                return;
            }

            else if(result < 0) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        System.out.println("Book Not Found");
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Book books[] = {new Book( 101,"C","Dennis Ritchie"),
                new Book(102,"C++","Bjarne Stroustrup"),
                new Book( 103,"Java","James Gosling"),
                new Book(104,"Python","Guido van Rossum")
        };

        System.out.print("Enter Book Title: ");
        String target =sc.nextLine();

        System.out.println("\nUsing Linear Search");
        linearSearch(books, target);

        System.out.println( "\nUsing Binary Search");
        binarySearch(books, target);

        sc.close();
    }
}