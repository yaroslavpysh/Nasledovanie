public class Main {
    public static void main(String[] args) {
        Legkovoi car = new Legkovoi(120, 200,3500,"Audi", 4, 10, "miviven", 6);
        Gruzovoi track = new Gruzovoi(250,180,4000,"BMW", 6,15,5);
        Grazhdanskyi flight = new Grazhdanskyi(2000, 1000, 150000, "Boing", 20, 2000, 100, true);
        Voenyi fighter = new Voenyi(2500, 1600, 10000, "F15", 15,1000,true,6);


        System.out.println(car.toString2());
        System.out.println(track.toString2());
        System.out.println(flight.toString2());
        System.out.println(fighter.toString2());
        car.howManyKilometres();
        track.maxload(5);
        flight.maxqualityOfPassengers(50);
        fighter.pusk(0);



    }
}
