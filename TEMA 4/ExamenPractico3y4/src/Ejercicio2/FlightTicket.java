package Ejercicio2;

public class FlightTicket extends Ticket{
    public FlightTicket(String ticketNumber, double baseprice) {
        super(ticketNumber, baseprice);
    }
    @Override
    public double calculatePrice(){
        return getBaseprice();
    }
    public double calculatePrice(boolean isPeakTime) {
        double price=calculatePrice();
        if (isPeakTime){
            price*=1.20;
        }
        return price;
    }

    @Override
    public String toString() {
        return "FlightTicket{}";
    }
}
