public class Main {
    public static void main(String[] args) {


        Parkable car1 = new Car(new VehicleInfo("KA51MG6923"));
        Parkingslot plot = new Parkingslot(10);
        car1.park(plot);

        Parkable car2 = new Car(new VehicleInfo("KA64GH1234"));
        car2.park(plot);

        car1.unpark(plot);
        Parkable jeep = new Jeep(new VehicleInfo(("JEEP23XY4")));
        jeep.park(plot);


        plot.isFull(); //return true;
        jeep.unpark(plot);
        plot.isFull();

    }





}
