public class FreightWagon extends Wagon {

    private String carryingCapacity;

    public FreightWagon(String type, String weight, String model, String carryingCapacity) {
        super(weight, model, type);
        this.carryingCapacity = carryingCapacity;
    }

    public String getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(String carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}