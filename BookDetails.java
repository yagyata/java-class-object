public class BookDetails {
    private String title;
    private String author;
    private int price;

    public BookDetails(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Book Details:");
        System.out.println("Book's Title: " + title);
        System.out.println("Author's Name: " + author);
        System.out.println("Book's Price: " + price);
    }

    public static void main(String[] args) {
        BookDetails details = new BookDetails("Harry Potter", "JK Rowlings", 500);
        details.displayDetails();
    }

}
