public class Car implements Parkable{
    private String regnNo;

    @Override
    public void park(Parkingslot plot) {
        System.out.println("Parking a car");
        plot.addVehicle();
    }

    @Override
    public void unpark(Parkingslot plot) {
        System.out.println("Unparking a car");
        plot.unpark();
    }



    /*public void park(Parkingslot plot) {

        plot.addCar();



    }

    public void unparkk(Parkingslot plot)
    {
        plot.unpark();
    }*/


}
