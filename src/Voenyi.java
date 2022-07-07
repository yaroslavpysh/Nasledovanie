public class Voenyi extends Vozdyshnyi{

    private boolean availabilityOfCat;
    private int qualityOfRocket;

    public Voenyi(int power, int maxSpeed, int weight, String name, int sizeOfWings, int minLong, boolean availabilityOfCat, int qualityOfRocket) {
        super(power, maxSpeed, weight, name, sizeOfWings, minLong);
        this.availabilityOfCat = availabilityOfCat;
        this.qualityOfRocket = qualityOfRocket;
    }

    public boolean isAvailabilityOfCat() {
        return availabilityOfCat;
    }

    public void setAvailabilityOfCat(boolean availabilityOfCat) {
        this.availabilityOfCat = availabilityOfCat;
    }

    public int getQualityOfRocket() {
        return qualityOfRocket;
    }

    public void setQualityOfRocket(int qualityOfRocket) {
        this.qualityOfRocket = qualityOfRocket;
    }


    public String toString2() {
        return "Voenyi{" +
                "availabilityOfCat=" + availabilityOfCat +
                ", qualityOfRocket=" + qualityOfRocket +
                '}'+ toString1();
    }
    public void pusk(int qualityOfRocket){
        int qualityOfRocket1 = this.qualityOfRocket;
        if (qualityOfRocket != 0 && qualityOfRocket > 0){
            System.out.println("Ракета пошла");
        } else if (qualityOfRocket == 0){
            System.out.println("Ракет больше нет");
        }


    }
}
