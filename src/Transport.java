public class Transport {
    private int  power;
    private int maxSpeed;
    private int weight;
    private String name;

    public Transport(int power, int maxSpeed, int weight, String name) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.name = name;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}' + "power in KW" + powerKW();
    }

    public double powerKW(){

       this.power *= 0.74;
       return power;

     }





    }

