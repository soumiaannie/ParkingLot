public class Main {
    public static void main(String[] args) {


        //Car car1 = new Car();
        Parkable car1 = new Car();
        Parkingslot plot = new Parkingslot(1);
        car1.park(plot);

        Parkable car2 = new Car();
        car2.park(plot);

        //car1.unparkk(plot);
        car1.unpark(plot);
        Parkable jeep = new Jeep();
        jeep.park(plot);


        plot.isFull(); //return true;
        jeep.unpark(plot);
        plot.isFull();

    }





}
