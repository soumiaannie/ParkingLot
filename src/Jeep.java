public class Jeep extends Vehicle  {
    private VehicleInfo myVehicle;

    Jeep(VehicleInfo myVehicle)
    {
        this.myVehicle=myVehicle;
    }
    @Override
    public void park(Parkingslot parkingslot) {

        if (parkingslot.addVehicle())
        {
            System.out.println("Jeep parked successfully");
            parkingslot.addVehicleInfo(myVehicle);
            parkingslot.displayVehicleInfo();
            //myVehicle.addToRegister();
            //myVehicle.displayRegister();
        }

    }



}
