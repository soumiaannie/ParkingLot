public class Car extends Vehicle{
    private VehicleInfo myVehicle;

    Car(VehicleInfo myVehicle)
    {
        this.myVehicle=myVehicle;
    }

    @Override
    public void park(Parkingslot plot) {

        if (plot.addVehicle())
        {
            System.out.println("Car parked successfully");
            myVehicle.addToRegister();
            myVehicle.displayRegister();
        }

    }



}
