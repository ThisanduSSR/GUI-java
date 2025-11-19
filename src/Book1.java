public class Book1 {
    String title;
    String author;

    public void printDetails() {
        System.out.println(title+" "+author);

        Book1 b1 = new Book1();
        b1.title = "Harry potter";
        b1.author = "Rowling";
        b1.printDetails();
    }
}
