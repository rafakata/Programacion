package Ejercicio2;

public class TrainTicket extends Ticket{
    public TrainTicket(String ticketNumber, double baseprice) {
        super(ticketNumber, baseprice);
    }


    @Override
    public double calculatePrice(){
        return getBaseprice();
    }
    public double calculatePrice(boolean isPeakTime) {
        double price=calculatePrice();
        if (isPeakTime){
        price*=1.10;
        }
        return price;
    }

    @Override
    public String toString() {
        return "TrainTicket{}";
    }
}
