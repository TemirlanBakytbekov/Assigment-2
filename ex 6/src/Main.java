public class Main {
    public static void main(String[] args) {
        MainPage person = new MainPage();
        PassengerWagon k = new PassengerWagon("Passenger wagon","6 tons","Yolo-1001","5","18");
        PassengerWagon l = new PassengerWagon("Passenger wagon","6 tons","KR701","5","18");
        PassengerWagon m = new PassengerWagon("Passenger wagon","6 tons","LI-01","5","15");
        PassengerWagon n = new PassengerWagon("Passenger wagon","6 tons","Nigga","5","20");
        PassengerWagon o = new PassengerWagon("Passenger wagon","6 tons","JI-09","5","16");
        person.getPassengerWagons().add(k);
        person.getPassengerWagons().add(l);
        person.getPassengerWagons().add(m);
        person.getPassengerWagons().add(n);
        person.getPassengerWagons().add(o);
        FreightWagon p = new FreightWagon("Freight wagon","5 tons","","");
        FreightWagon q = new FreightWagon("Freight wagon","5 tons","","");
        FreightWagon r = new FreightWagon("Freight wagon","5 tons","","");
        FreightWagon s = new FreightWagon("Freight wagon","5 tons","","");
        FreightWagon t = new FreightWagon("Freight wagon","5 tons","","");
        person.getFreightWagons().add(p);
        person.getFreightWagons().add(q);
        person.getFreightWagons().add(r);
        person.getFreightWagons().add(s);
        person.getFreightWagons().add(t);
        Locomative u = new Locomative("200km/h","20 wagons","KU-101","steam train");
        Locomative v = new Locomative("180km/h","30 wagons","HU-199","electric locomotive");
        Locomative w = new Locomative("240km/h","24 wagons","OOP-100","electric locomotive");
        Locomative x = new Locomative("210km/h","40 wagons","SE-2207","diesel locomotive");
        Locomative y = new Locomative("220km/h","36 wagons","SE-top","diesel locomotive");
        person.getLocomotives().add(u);
        person.getLocomotives().add(v);
        person.getLocomotives().add(w);
        person.getLocomotives().add(x);
        person.getLocomotives().add(y);
        Ticket z = new Ticket(1,"19:20","2023.01.18","Astana - Almaty");
        Ticket aa = new Ticket(2,"17:00","2023.01.19","Almaty - Astana");
        Ticket ab = new Ticket(3,"19:20","2023.01.20","Astana - Pavlodar");
        Ticket ac = new Ticket(4,"19:20","2023.01.21","Pavlodar - Astana");
        Ticket ad = new Ticket(5,"19:20","2023.01.22","Pavlodar - Almaty");
        Ticket ae = new Ticket(6,"19:20","2023.01.23","Almaty - Pavlodar");
        Ticket af = new Ticket(7,"19:20","2023.01.24","Astana - Pavlodar");
        Ticket ag = new Ticket(8,"19:20","2023.01.25","Astana - Oskemen");
        Ticket ah = new Ticket(9,"19:20","2023.01.26","Oskemen - Astana");
        Ticket ai = new Ticket(10,"19:20","2023.01.27","Astana - Almaty");
        person.getTickets().add(z);
        person.getTickets().add(aa);
        person.getTickets().add(ab);
        person.getTickets().add(ac);
        person.getTickets().add(ad);
        person.getTickets().add(ae);
        person.getTickets().add(af);
        person.getTickets().add(ag);
        person.getTickets().add(ah);
        person.getTickets().add(ai);
        person.Start();
    }

}