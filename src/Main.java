public class Main {
    public static void main(String[] args) {


        Car car1 = new Car();
        Parkingslot plot = new Parkingslot(1);
        car1.park(plot);

        Car car2 = new Car();
        car2.park(plot);

        car1.unparkk(plot);


        plot.isFull(); //return true;
    }





}
