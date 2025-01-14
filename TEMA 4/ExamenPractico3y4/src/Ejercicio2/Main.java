package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        TrainTicket trainTicket = new TrainTicket("T123", 100);
        FlightTicket flightTicket = new FlightTicket("F456", 200);
        MovieTicket movieTicket = new MovieTicket("M789", 15);
        boolean isPeakTime = true;
        double total = 0;
        double trainPrice = trainTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",
                trainTicket.getTicketNumber(), trainPrice);
        total += trainPrice;
        // Calcular precio del boleto de vuelo
        double flightPrice = flightTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",
                flightTicket.getTicketNumber(), flightPrice);
        total += flightPrice;
        // Calcular precio del boleto de cine
        double moviePrice = movieTicket.calculatePrice(isPeakTime);
        System.out.printf("Ticket %s - Precio: %.2f€\n",
                movieTicket.getTicketNumber(), moviePrice);
        total += moviePrice;
        // Total de boletos
        System.out.printf("%nTotal de boletos: %.2f€\n", total);
    }
}
