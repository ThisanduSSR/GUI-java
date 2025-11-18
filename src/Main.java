import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();

        while(true) {
            System.out.println("\nPress 1 to add a book");
            System.out.println("press 0 to exit");
            int choice =  s.nextInt();
            s.nextLine();

            if(choice==1){
                System.out.print("Enter title:");
                String title  = s.nextLine();

                System.out.print("Enter year:");
                String author = s.nextLine();

                System.out.print("Enter price");
                int year = s.nextInt();

                Book b = new Book(title, year, author);
                b.setPrice(rpice);

            }

        }
    }
}
