public class Jeep extends Vehicle  {
    private VehicleInfo myVehicle;

    Jeep(VehicleInfo myVehicle)
    {
        this.myVehicle=myVehicle;
    }

    @Override
    public void park(Parkingslot plot) {

        if (plot.addVehicle())
        {
            System.out.println("Jeep parked successfully");
            myVehicle.addToRegister();
            myVehicle.displayRegister();
        }

    }



}
