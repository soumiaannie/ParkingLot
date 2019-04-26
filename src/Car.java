public class Car extends Vehicle{
    private VehicleInfo myVehicle;

    Car(VehicleInfo myVehicle)
    {
        this.myVehicle=myVehicle;
    }

    @Override
    public void park(Parkingslot parkingslot) {

        if (parkingslot.addVehicle())
        {
            System.out.println("Car parked successfully");
            parkingslot.addVehicleInfo(myVehicle);
            parkingslot.displayVehicleInfo();
            //myVehicle.addToRegister();
            //myVehicle.displayRegister();
        }

    }



}
