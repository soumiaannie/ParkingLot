public abstract class Vehicle implements Parkable{
    /*public void park(Parkingslot pslot)
    {
        //System.out.println("Parking a car");
        pslot.addVehicle();
    }*/

    public void unpark(Parkingslot plot) {
        plot.unpark();

    }


}
