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
}
