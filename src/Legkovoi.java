public class Legkovoi extends Nazemnyi{


    private String typeOfCarcase;
    private int qualityOfPassengers;

    public Legkovoi(int power, int maxSpeed, int weight, String name, int qualityOfWheels, int consumption, String typeOfCarcase, int qualityOfPassengers) {
        super(power, maxSpeed, weight, name, qualityOfWheels, consumption);
        this.typeOfCarcase = typeOfCarcase;
        this.qualityOfPassengers = qualityOfPassengers;
    }

    public String getTypeOfCarcase() {
        return typeOfCarcase;
    }

    public void setTypeOfCarcase(String typeOfCarcase) {
        this.typeOfCarcase = typeOfCarcase;
    }

    public int getQualityOfPassengers() {
        return qualityOfPassengers;
    }

    public void setQualityOfPassengers(int qualityOfPassengers) {
        this.qualityOfPassengers = qualityOfPassengers;
    }





    public String toString2() {
        return "Legkovoi{" +
                "typeOfCarcase='" + typeOfCarcase + '\'' +
                ", qualityOfPassengers=" + qualityOfPassengers +
                '}' + toString1();
    }

    double distance;
    double consumptionTime;


     public void howManyKilometres(double time){
        distance = time*this.getMaxSpeed();
        consumptionTime = time*this.getConsumption();

        System.out.println("За время " + time+ " ч, автомобиль " + this.getName() +
               " двигаясь с максимальной скоростью "+ this.getMaxSpeed()+" км/ч\n" +
                "проедет " +distance+" км и израсходует "+ consumptionTime +" литров топлива.");
    }


}
