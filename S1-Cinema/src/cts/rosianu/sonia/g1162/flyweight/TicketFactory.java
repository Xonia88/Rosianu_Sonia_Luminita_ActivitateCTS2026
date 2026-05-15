package cts.rosianu.sonia.g1162.flyweight;

import java.util.HashMap;

public class TicketFactory {
    private HashMap<String, Ticket> tickets;

    public TicketFactory() {

        tickets = new HashMap<>();
}

    public Ticket getTicket(String movieTitle,
                            String director,
                            String actors,
                            String description,
                            String ads) {

        if (!tickets.containsKey(movieTitle)) {

            Ticket ticket =
                    new CinemaTicket(
                            movieTitle,
                            director,
                            actors,
                            description,
                            ads
                    );

            tickets.put(movieTitle, ticket);
        }

        return tickets.get(movieTitle);

    }
}
