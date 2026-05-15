package cts.rosianu.sonia.g1162.adapter;

public class OnlineCinemaOrder implements OnlineOrder {

    private String movieTitle;
    private String date;
    private String time;
    private String seat;

    public OnlineCinemaOrder(String movieTitle,
                             String date,
                             String time,
                             String seat) {

        this.movieTitle = movieTitle;
        this.date = date;
        this.time = time;
        this.seat = seat;
    }

    @Override
    public String showOrderDetails() {

        return "Movie title: " + movieTitle + "\n" +
                "Date: " + date + "\n" +
                "Time: " + time + "\n" +
                "Seat: " + seat;
    }
}
