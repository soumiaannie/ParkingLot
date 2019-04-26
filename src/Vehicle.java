public abstract class Vehicle implements Parkable{

    public void unpark(Parkingslot parkingslot) {
        if(parkingslot.unpark())
        {
            parkingslot.displayVehicleInfo();
        }

    }

    }
