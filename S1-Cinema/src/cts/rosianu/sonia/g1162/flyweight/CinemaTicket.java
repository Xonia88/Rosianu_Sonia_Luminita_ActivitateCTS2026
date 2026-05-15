package cts.rosianu.sonia.g1162.flyweight;



public class CinemaTicket implements Ticket {

    private String movieTitle;
    private String director;
    private String actors;
    private String description;
    private String ads;

    public CinemaTicket(String movieTitle,
                        String director,
                        String actors,
                        String description,
                        String ads) {

        this.movieTitle = movieTitle;
        this.director = director;
        this.actors = actors;
        this.description = description;
        this.ads = ads;

        try {

            System.out.println("Generare bilet");
            Thread.sleep(10000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void printTicket(TicketData ticketData) {

        System.out.println(
                "Film: " + movieTitle +
                        ", Regie: " + director +
                        ", Actori: " + actors +
                        ", Descriere: " + description +
                        ", Reclame: " + ads +
                        ", Data: " + ticketData.getDate() +
                        ", Ora: " + ticketData.getTime() +
                        ", Loc: " + ticketData.getSeat()
        );
    }
}