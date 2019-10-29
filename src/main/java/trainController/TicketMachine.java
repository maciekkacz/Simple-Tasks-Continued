package trainController;

public class TicketMachine {
    public static void butTicket(Passenger passenger, int timeMinutes) {
        Ticket ticket = new Ticket(timeMinutes);
        passenger.setTicket(ticket);
    }
}
