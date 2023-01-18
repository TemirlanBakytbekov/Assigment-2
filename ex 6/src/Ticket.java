import java.util.ArrayList;

public class Ticket {
    private int id;
    private String time;
    private String date;
    private String way;

    public Ticket(int id, String time, String date, String way) {
        this.id = id;
        this.time = time;
        this.date = date;
        this.way = way;
    }

    public int getId() {
        return id;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }

    public String getWay() {
        return way;
    }
}