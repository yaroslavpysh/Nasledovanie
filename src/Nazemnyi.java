import org.w3c.dom.ls.LSOutput;

public class Nazemnyi extends Transport{
    private int qualityOfWheels;
    private int consumption;
    public Nazemnyi(int power, int maxSpeed, int weight, String name, int qualityOfWheels, int consumption) {
        super(power, maxSpeed, weight, name);
        this.qualityOfWheels = qualityOfWheels;
        this.consumption = consumption;
    }

    public int getQualityOfWheels() {
        return qualityOfWheels;
    }

    public void setQualityOfWheels(int qualityOfWheels) {
        this.qualityOfWheels = qualityOfWheels;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String toString1() {
        return "Nazemnyi {" +
                "qualityOfWheels=" + qualityOfWheels +
                ", consuption=" + consumption +
                '}' + toString();

    }


}
