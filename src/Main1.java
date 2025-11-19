public class Main1 {
    //Book class(inner class)
    public static class Book{
        private String title;
        private String author;
        private int year;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }
        public void printDetails() {
            System.out.println("Title:"+title);
            System.out.println("Year:"+year);
            System.out.println("Author:"+author);
        }
        public void updateYear(int newYear){
            this.year = newYear;
        }
        public String getTitle() {
            return title;
        }
        public int getBookAge(int currentYear){
            return currentYear - year;
        }
    }
    public static void main(String[] args) {
        Book b1 = new Book("Harry Potter","Rowling",1997);
        Book b2 = new Book("Lord of the ring","Tolkin", 1954);

        System.out.println("Book1 details");
        b1.printDetails();

        System.out.println("Book2 details");
        b2.printDetails();


    }
}
