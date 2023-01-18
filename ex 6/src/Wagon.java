public class Wagon extends Train {
    private String weight;
    public Wagon(String weight, String model, String type) {
        super(type, model);
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}