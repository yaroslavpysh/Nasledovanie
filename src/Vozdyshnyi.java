public class Vozdyshnyi extends Transport {

    private int sizeOfWings;
    private int minLong;

    public Vozdyshnyi(int power, int maxSpeed, int weight, String name, int sizeOfWings, int minLong) {
        super(power, maxSpeed, weight, name);
        this.sizeOfWings = sizeOfWings;
        this.minLong = minLong;
    }

    public int getSizeOfWings() {
        return sizeOfWings;
    }

    public void setSizeOfWings(int sizeOfWings) {
        this.sizeOfWings = sizeOfWings;
    }

    public int getMinLong() {
        return minLong;
    }

    public void setMinLong(int minLong) {
        this.minLong = minLong;
    }


    public String toString1() {
        return "Vozdyshnyi{" +
                "sizeOfWings=" + sizeOfWings +
                ", minLong=" + minLong +
                '}' + toString();
    }
}
