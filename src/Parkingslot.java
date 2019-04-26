import java.util.ArrayList;

public class Parkingslot {
    private int totalSlots;
    private int parkedSlots = 0;
    private ArrayList<VehicleInfo> vehicleInfos = new ArrayList<VehicleInfo>();

    Parkingslot(int n)
    {
        this.totalSlots=n;
    }
    public boolean isFull() {

        if (totalSlots==parkedSlots)
        {
            return true;

        }
        return false;
    }

    public boolean addVehicle() {
        if (totalSlots <= 0)
        {
            System.out.println("Parking is full");
            System.out.println("================================================");
            System.exit(0);
        }
        if (!isFull())
        {

            parkedSlots++;
            return true;

        }
        else
            System.out.println("Parking is full");
            System.out.println("================================================");
            return false;


    }

    public boolean unpark()

    {
        if (parkedSlots>0) {
            System.out.println("Vehicle is being unparked");
            parkedSlots--;
            vehicleInfos.remove((vehicleInfos.size()-1));
            return true;
        }
            else
            System.out.println("Vehicle is not parked, hence cannot be unparked");
            System.out.println("================================================");
            return false;
    }

    public void addVehicleInfo(VehicleInfo vehicleInfo)
    {
    vehicleInfos.add(vehicleInfo);
    }

    public void displayVehicleInfo()
    {
        System.out.println("The details of parked vehicles are shown below--");
        System.out.println(vehicleInfos);
        System.out.println("============================================================");
    }


    /*@Override
    public String toString() {
        return super.toString();
    }*/
}
