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
            System.out.println("Parking Full");
            System.out.println("Parked no of cars are " + n);

            return true;

        }
        System.out.println("Parking not full");
        return false;
    }

    public void addCar() {
        parked++;

    }

    public void unpark()
    {
        parked--;
    }
}
