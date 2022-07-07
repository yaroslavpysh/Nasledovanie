public class Grazhdanskyi extends Vozdyshnyi{

    private int qualityOfPassengers;
    private boolean availabilityBusinessClass;

    public Grazhdanskyi(int power, int maxSpeed, int weight, String name, int sizeOfWings, int minLong, int qualityOfPassengers, boolean availabilityBusinessClass) {
        super(power, maxSpeed, weight, name, sizeOfWings, minLong);
        this.qualityOfPassengers = qualityOfPassengers;
        this.availabilityBusinessClass = availabilityBusinessClass;
    }

    public int getQualityOfPassengers() {
        return qualityOfPassengers;
    }

    public void setQualityOfPassengers(int qualityOfPassengers) {
        this.qualityOfPassengers = qualityOfPassengers;
    }

    public boolean isAvailabilityBusinessClass() {
        return availabilityBusinessClass;
    }

    public void setAvailabilityBusinessClass(boolean availabilityBusinessClass) {
        this.availabilityBusinessClass = availabilityBusinessClass;
    }


    public String toString2() {
        return "Grazhdanskyi{" +
                "qualityOfPassengers=" + qualityOfPassengers +
                ", availabilityBusinessClass=" + availabilityBusinessClass +
                '}' + toString1();
    }
    public void maxqualityOfPassengers(int passengers){
        if (passengers>this.qualityOfPassengers){
            System.out.println("Самолет перегружен");
        }
        else System.out.println("Самолет загружен");
    }
}
