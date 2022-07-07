public class Gruzovoi extends Nazemnyi {

    private int loadCapacity;

    public Gruzovoi(int power, int maxSpeed, int weight, String name, int qualityOfWheels, int consumption, int loadCapacity) {
        super(power, maxSpeed, weight, name, qualityOfWheels, consumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    public String toString2() {
        return "Gruzovoi{" +
                "loadCapacity=" + loadCapacity +
                '}' + toString1();
    }

    public void maxload(int load){
        if (load>this.loadCapacity){
            System.out.println("Вам нужен грузовик побольше");
        }
        else System.out.println("Грузовик загружен");
    }
}
