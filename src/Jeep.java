public class Jeep implements Parkable {
    @Override
    public void park(Parkingslot plot) {
        System.out.println("Parking Jeep");
        plot.addVehicle();
    }

    @Override
    public void unpark(Parkingslot plot) {
        System.out.println("Unparking a jeep");
        plot.unpark();

    }
}
