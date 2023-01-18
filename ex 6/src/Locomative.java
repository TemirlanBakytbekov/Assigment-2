public class Locomative extends Train {

    private String speed;
    private String thrust;

    public Locomative(String speed,String thrust,String model,String type){
        super(type,model);
        this.speed = speed;
        this.thrust = thrust;
    }
    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getThrust() {
        return thrust;
    }

    public void setThrust(String thrust) {
        this.thrust = thrust;
    }


}