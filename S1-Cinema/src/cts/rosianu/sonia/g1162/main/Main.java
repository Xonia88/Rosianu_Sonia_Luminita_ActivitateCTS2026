package cts.rosianu.sonia.g1162.main;

import cts.rosianu.sonia.g1162.adapter.OnlineCinemaOrder;
import cts.rosianu.sonia.g1162.adapter.OnlineOrder;
import cts.rosianu.sonia.g1162.adapter.OnlineOrderAdapter;
import cts.rosianu.sonia.g1162.flyweight.Ticket;
import cts.rosianu.sonia.g1162.flyweight.TicketData;
import cts.rosianu.sonia.g1162.flyweight.TicketFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TicketFactory factory =
                new TicketFactory();

        System.out.println("Numar bilete:");

        int nrBilete = scanner.nextInt();

        for(int i = 0; i < nrBilete; i++) {

            System.out.println("Introdu data, ora si loc:");

            String date = scanner.next();
            String time = scanner.next();
            String seat = scanner.next();

            TicketData ticketData =
                    new TicketData(
                            date,
                            time,
                            seat
                    );

            Ticket ticket =
                    factory.getTicket(
                            "Fast and Furious 9",
                            "Florin Piersic",
                            "Vin Diesel",
                            "Film actiune",
                            "Coca Cola"
                    );

            ticket.printTicket(ticketData);
        }

        System.out.println();
        System.out.println("===== ADAPTER =====");

        OnlineOrder onlineOrder =
                new OnlineCinemaOrder(
                        "Avatar 2",
                        "20.06.2026",
                        "18:30",
                        "7B"
                );

        System.out.println();
        System.out.println("Format online:");

        System.out.println(
                onlineOrder.showOrderDetails()
        );

        OnlineOrderAdapter adapter =
                new OnlineOrderAdapter(onlineOrder);

        System.out.println();
        System.out.println("Format imprimanta:");

        System.out.println(
                adapter.print()
        );
    }
}