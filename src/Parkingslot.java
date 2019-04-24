public class Parkingslot {
    private int n;
    private int parked = 0;

    Parkingslot(int n)
    {
        this.n=n;
    }
    public boolean isFull() {

        if (n==parked)
        {
            System.out.println("Parked no of cars are " + n);

            return true;

        }
        System.out.println("Parking not full");
        return false;
    }

    public void addVehicle() {
        System.out.println("Vehicle is being parked");
        parked++;

    }

    public void unpark()
    {
        System.out.println("Vehicle is being unparked");
        parked--;
    }

    /*public void addJeep()
    {
        System.out.println("Jeep is being parked");
        parked++;
    }

    public void unparkJeep()
    {
        System.out.println("Unparking a jeep");
        parked--;

    }*/
}
