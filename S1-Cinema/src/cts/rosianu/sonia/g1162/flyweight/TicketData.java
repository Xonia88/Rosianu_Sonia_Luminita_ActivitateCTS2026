package cts.rosianu.sonia.g1162.flyweight;

public class TicketData {

    private String date;
    private String time;
    private String seat;

    public TicketData(String date, String time, String seat) {
        this.date = date;
        this.time = time;
        this.seat = seat;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getSeat() {
        return seat;
    }
}
