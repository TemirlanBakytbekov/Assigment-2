import java.util.ArrayList;

public class Client extends User {
    private String age;
    private String balance;
    private String name;
    private ArrayList<Ticket> myTickets = new ArrayList<Ticket>();


    public Client(String age , String name, String login, String password,String balance, ArrayList<Ticket> myTickets) {
        super(login, password);
        this.age = age;
        this.balance = balance;
        this.name = name;
        this.myTickets = myTickets;
    }


    public ArrayList<Ticket> getMyTickets() {
        return myTickets;
    }

    public String getAge() {
        return age;
    }

    public String getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }
}