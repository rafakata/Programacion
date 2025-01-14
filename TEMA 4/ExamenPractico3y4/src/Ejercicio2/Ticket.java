package Ejercicio2;

public class Ticket {
    private String ticketNumber;
    private double baseprice;

    public Ticket(String ticketNumber, double baseprice) {
        this.ticketNumber = ticketNumber;
        this.baseprice = baseprice;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public double getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(double baseprice) {
        this.baseprice = baseprice;
    }

    public double calculatePrice() {
        return baseprice;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketNumber='" + ticketNumber + '\'' +
                ", baseprice=" + baseprice +
                '}';
    }

}
