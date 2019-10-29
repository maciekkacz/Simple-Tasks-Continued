package trainController;

import java.time.LocalDateTime;

public class TicketController {
    public static void main(String[] args) {
        int amountPassanger = 5;

        Passenger[] passengers = new Passenger[amountPassanger];
        passengers[0] = new Passenger("Maciek", "Kaczmarczyk");
        passengers[1] = new Passenger("Marek", "Barek");
        passengers[2] = new Passenger("Darek", "Garstka");
        passengers[3] = new Passenger("Waldek", "Paczka");
        passengers[4] = new Passenger("Piotr", "Killer");

        TicketMachine.butTicket(passengers[0], 20);
        TicketMachine.butTicket(passengers[1], 60);
        TicketMachine.butTicket(passengers[2], 360);
        TicketMachine.butTicket(passengers[3], 10);

        Ticket invalideTicket = new Ticket(5, LocalDateTime.now().minusMinutes(30));
        passengers[4].setTicket(invalideTicket);

        Passenger[] passengersWithoutTicket = validateTickets(passengers);
        System.out.println("who doesn't have a ticket");
        for (Passenger passenger : passengersWithoutTicket) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());


        }
    }

    private static Passenger[] validateTickets(Passenger[] passengers) {
        int passengersWithoutTicket = 0;
        for (Passenger passenger : passengers) {
            Ticket ticket = passenger.getTicket();
            if (ticket == null || !ticket.isValid())
                passengersWithoutTicket++;
        }

        Passenger[] withoutTicket = new Passenger[passengersWithoutTicket];
        for (int i = 0, j = 0; i < passengers.length; i++) {
            Ticket ticket = passengers[i].getTicket();
            if (ticket == null || !ticket.isValid()) {
                withoutTicket[j] = passengers[i];
                j++;
            }
        }

        return withoutTicket;

    }

}