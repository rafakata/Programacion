package Ejercicio2;

public class MovieTicket extends Ticket {
    public MovieTicket(String ticketNumber, double baseprice) {
        super(ticketNumber, baseprice);
    }
    @Override
    public double calculatePrice(){
        return getBaseprice();
    }
    public double calculatePrice(boolean isPeakTime) {
        double price=calculatePrice();
        if (isPeakTime){
            price+=2;
        }
        return price;
    }

    @Override
    public String toString() {
        return "MovieTicket{}";
    }
}
