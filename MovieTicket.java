public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;

    public MovieTicket(String movieName){
        this.movieName = movieName;
        this.seatNumber = "Not Assigned"; //Default seat
        this.price = 0.0; //Default price
    }

    public void bookTicket(String seatNumber, double price){
        if (price > 0) {
            this.seatNumber = seatNumber;
            this.price = price;
            System.out.println("Ticket is booked successfully!");
        } else {
            System.out.println("Invalid price. Ticket booking failed.");
        }
    }

    public void displayDetails(){
        System.out.println("Movie name: " + movieName);
        System.out.println("Seat number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args){
        MovieTicket ticket = new MovieTicket("Inception");
        ticket.bookTicket("A12", 200);
        ticket.displayDetails();
    }
}
