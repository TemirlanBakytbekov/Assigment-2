public class PassengerWagon extends Wagon {
    private String compartment;
    private String seat;

    public PassengerWagon(String type, String weight, String model, String compartment, String seat) {
        super(weight, model, type);
        this.compartment = compartment;
        this.seat = seat;
    }

    public String getCompartment() {
        return compartment;
    }

    public void setCompartment(String compartment) {
        this.compartment = compartment;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
