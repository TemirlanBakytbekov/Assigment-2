import java.util.ArrayList;
import java.util.Scanner;

public class MainPage {
    public ArrayList <Client> clients = new ArrayList<Client>();
    public ArrayList<Locomative> locomotives = new ArrayList<Locomative>();
    public ArrayList<FreightWagon> freightWagons = new ArrayList<FreightWagon>();
    public ArrayList<PassengerWagon> passengerWagons = new ArrayList<PassengerWagon>();
    public ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public void AddTicket () {
        Scanner input = new Scanner(System.in);
        System.out.println("Input time: ");
        String time = input.nextLine();
        System.out.println("Input date: ");
        String date = input.nextLine();
        System.out.println("Input way: ");
        String way = input.nextLine();
        int id;
        id = 1 + (int) (Math.random() * 100);
        Ticket t = new Ticket(id,time,date,way);
        tickets.add(t);
    }
    public void RemoveTicket () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter id of ticket: ");
        int id = input.nextInt();
        for (Ticket t : tickets) {
            if (t.getId() == id) {
                tickets.remove(t);
                System.out.println("You remove the ticket from system!");
                break;
            }
        }
    }
    public void ShowTicket () {
        for (Ticket t : tickets) {
            System.out.println("--------------------------");
            System.out.println("Id is " + t.getId());
            System.out.println("Time is " + t.getTime());
            System.out.println("Date is " + t.getDate());
            System.out.println("Way is" + t.getWay());
            System.out.println("--------------------------");
        }
    }

    public void AddLoco() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input locomotive's type");
        String type = input.nextLine();
        System.out.println("Adding new entry");
        System.out.println("Input locomotive's speed");
        String speed = input.nextLine();
        System.out.println("Input locomotive's thrust");
        String thrust = input.nextLine();
        System.out.println("Input locomotive's model");
        String model = input.nextLine();
        Locomative l = new Locomative(speed,thrust,model,type);
        locomotives.add(l);
    }

    public void RemoveLoco() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the locomotive model");
        String model = scanner.nextLine();
        for (Locomative l : locomotives) {
            if (l.getModel().equals(model)) {
                locomotives.remove(l);
                System.out.println("The" + model + " model train has been removed from the system");
                break;
            }
        }

    }

    public void AddWagon() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input wagon's type:passenger wagon or freight wagon");
        String type = input.nextLine();
        if (type.equals("freight wagon") || type.equals("Freight wagon")) {
            System.out.println("Input wagon's weight");
            String weight = input.nextLine();
            System.out.println("Input wagon's model");
            String model = input.nextLine();
            System.out.println("Input wagon's carrying capacity");
            String carryingCapacity = input.nextLine();
            FreightWagon ft = new FreightWagon(type,weight,model,carryingCapacity);
            freightWagons.add(ft);
        }
        else if (type.equals("passenger wagon") || type.equals("Passenger wagon")){
            System.out.println("Input wagon's weight");
            String weight = input.nextLine();
            System.out.println("Input wagon's model");
            String model = input.nextLine();
            System.out.println("Input wagon's number of compartment");
            String compartment = input.nextLine();
            System.out.println("Input wagon's number of seat");
            String seat = input.nextLine();
            PassengerWagon pt = new PassengerWagon(type,weight,model,compartment,seat);
            passengerWagons.add(pt);
        }
        else {
            System.out.println("Error");
        }
    }

    public void RemoveWagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the type of wagon");
        String type = scanner.nextLine();
        System.out.println("enter the model of wagon");
        String model = scanner.nextLine();
        if (type.equals("passenger wagon") || type.equals("Passenger wagon")) {
            for (PassengerWagon pt : passengerWagons) {
                if (pt.getModel().equals(model)) {
                    locomotives.remove(pt);
                    System.out.println("The" + model + " model train has been removed from the system");
                    break;
                }
            }
        }
        else if (type.equals("freight wagon") || type.equals("Freight wagon")){
            for (FreightWagon ft : freightWagons) {
                if (ft.getModel().equals(model)) {
                    locomotives.remove(ft);
                    System.out.println("The" + model + " model train has been removed from the system");
                    break;
                }
            }
        }
    }
    public void Exit() {
        System.out.println("Exiting the application");
        System.exit(0);
    }
    public void SearchWag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's type of wagon?");
        String type = scanner.nextLine();
        if (type.equals("Passenger wagon") || type.equals("passenger wagon")) {
            System.out.println("What's model of wagon?");
            String model = scanner.nextLine();
            for (PassengerWagon pt : passengerWagons) {
                if (pt.getModel().equals(model)) {
                    System.out.println("Type of wagon is " + pt.getType());
                    System.out.println("Model of wagon is " + pt.getModel());
                    System.out.println("Weight of wagon is " + pt.getWeight());
                    System.out.println("Number of compartments is" + pt.getCompartment());
                    System.out.println("Number of seat is " + pt.getSeat());
                    System.out.println("           ");
                }
            }
        }
        else if (type.equals("freight wagon") || type.equals("Freight wagon")) {
            String model = scanner.nextLine();
            for (FreightWagon ft : freightWagons) {
                if (ft.getModel().equals(model)) {
                    System.out.println("Type of wagon is " + ft.getType());
                    System.out.println("Model of wagon is " + ft.getModel());
                    System.out.println("Weight of wagon is " + ft.getWeight());
                    System.out.println("Carrying capacity of wagon is" + ft.getCarryingCapacity());
                    System.out.println("           ");
                }
            }
        }
    }
    public void SearchLoco () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's model of locomotive?");
        String model = scanner.nextLine();
        for (Locomative l : locomotives) {
            if (l.getModel().equals(model)) {
                System.out.println("Type: " + l.getType());
                System.out.println("Model: " + l.getModel());
                System.out.println("Maximum speed: " + l.getSpeed());
                System.out.println("Thrust: " + l.getThrust());
                System.out.println("             ");
            }
        }
    }
    public void StartAppl(){
        System.out.println("Hello!This is Train System!");
        Scanner input = new Scanner(System.in);
        int menu = 0;
        while (menu != 11){
            System.out.println("1. Display information about wagon ");
            System.out.println("2. Display information about locomotive ");
            System.out.println("3. Add new locomotive ");
            System.out.println("4. Delete locomotive ");
            System.out.println("5. Add wagons ");
            System.out.println("6. Delete wagons ");
            System.out.println("7. Add ticket ");
            System.out.println("8. Remove ticket ");
            System.out.println("9. Show all available ticket ");
            System.out.println("10. Log out ");
            System.out.println("11. Exit from system ");
            menu= input.nextInt();
            switch (menu){
                case 1: SearchWag();
                    break;
                case 2: SearchLoco();
                    break;
                case 3: AddLoco();
                    break;
                case 4: RemoveLoco();
                    break;
                case 5: AddWagon();
                    break;
                case 6: RemoveWagon();
                    break;
                case 7: AddTicket();
                    break;
                case 8: RemoveTicket();
                    break;
                case 9: ShowTicket();
                    break;
                case 10: Start();
                    break;
                case 11:
                    Exit();
                    break;
            }
        }

    }
    public void Start () {
        System.out.println("Hello!This is Train System!");
        Scanner input = new Scanner(System.in);
        int menu = 0;
        while (menu != 2) {
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    SignUp();
                    break;
                case 2:
                    Login();
                    break;
            }
        }

    }
    public void SignUp() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter login: ");
        String login = input.nextLine();

        System.out.println("Enter password");
        String password = input.nextLine();

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        String age = input.nextLine();

        System.out.println("Enter your balance: ");
        String balance = input.nextLine();

        ArrayList<Ticket> myTickets = new ArrayList<Ticket>();

        Client c = new Client(age,name,login,password,balance,myTickets);
        clients.add(c);
    }
    public void Login () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your login: ");
        String login = input.nextLine();

        System.out.println("Enter your password: ");
        String password = input.nextLine();

        for (Client c: clients) {
            if (c.getLogin().equals(login) && c.getPassword().equals(password)) {
                StartC(c);
            }

        }
        if (login.equals("Temik") && password.equals("123456")) {
            StartAppl();
        }
    }
    public void StartC(Client client){
        System.out.println("Welcome!");
        Scanner input = new Scanner(System.in);
        int menu = 0;
        while (menu !=6){
            System.out.println("1. Buy ticket");
            System.out.println("2. Return ticket");
            System.out.println("3. Show my ticket");
            System.out.println("4. Show all available ticket");
            System.out.println("5. Log out: ");
            System.out.println("6. Exit from system");
            menu = input.nextInt();
            switch (menu){
                case 1: BuyTicket(client);
                    break;
                case 2: ReturnTicket(client);
                    break;
                case 3: ShowMyTicket(client);
                    break;
                case 4: ShowTicket();
                    break;
                case 5: Start();
                    break;
                case 6:
                    Exit();
                    break;
            }
        }

    }
    public void BuyTicket (Client client) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's id?");
        int id = input.nextInt();
        for (Ticket t : tickets) {
            if (id == t.getId()) {
                System.out.println("Congratulations you bought a ticket!!!");
                System.out.println("--------------------------");
                System.out.println("Time: " + t.getTime());
                System.out.println("Date: " + t.getDate());
                System.out.println("Way: " + t.getWay());
                System.out.println("--------------------------");
                client.getMyTickets().add(t);
            }
        }
    }


    public void ReturnTicket (Client client) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's id?");
        int id = input.nextInt();
        for (Ticket t : tickets) {
            if (id == t.getId()) {
                System.out.println("You return a ticket");
                client.getMyTickets().remove(t);
            }
        }
    }
    public void ShowMyTicket(Client client) {
        Scanner input = new Scanner(System.in);
        for(Ticket t : client.getMyTickets()) {
            System.out.println("--------------------------");
            System.out.println("Id: " + t.getId());
            System.out.println("Time: " + t.getTime());
            System.out.println("Date: " + t.getDate());
            System.out.println("Way: " + t.getWay());
            System.out.println("--------------------------");
        }
    }
    public ArrayList<Client> getClients() {
        return clients;
    }

    public ArrayList<Locomative> getLocomotives() {
        return locomotives;
    }

    public ArrayList<FreightWagon> getFreightWagons() {
        return freightWagons;
    }

    public ArrayList<PassengerWagon> getPassengerWagons() {
        return passengerWagons;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }
}
