import java.util.ArrayList;

public class Parkingslot {
    private int totalSlots;
    private int parkedSlots = 0;

    Parkingslot(int n)
    {
        this.totalSlots=n;
    }
    public boolean isFull() {

        if (totalSlots==parkedSlots)
        {
            //System.out.println("Parked no of cars are " + totalSlots);

            return true;

        }
        //System.out.println("Parking not full");
        return false;
    }

    public boolean addVehicle() {
        if (totalSlots <= 0)
        {
            System.out.println("Parking is full");
            System.out.println("====================");
            System.exit(0);
        }
        if (!isFull())
        {
            //System.out.println("Vehicle is being parked");
            parkedSlots++;
            return true;

        }
        else
            System.out.println("Parking is full");
            System.out.println("====================");
            return false;


    }

    public void unpark()

    {
        if (parkedSlots>0) {
            System.out.println("Vehicle is being unparked");
            //System.out.println("====================");
            parkedSlots--;
        }
            else
            System.out.println("Vehicle is not parked, hence cannot be unparked");
            System.out.println("====================");
    }


}
