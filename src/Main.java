public class Main {
    public static void main(String[] args) {


        Vehicle car1 = new Car(new VehicleInfo("KA51MG6923"));
        Parkingslot parkingslot = new Parkingslot(2);
        car1.park(parkingslot);

        Vehicle car2 = new Car(new VehicleInfo("KA64GH1234"));
        car2.park(parkingslot);

        car1.unpark(parkingslot);
        Vehicle jeep = new Jeep(new VehicleInfo(("JEEP23XY4")));
        jeep.park(parkingslot);


        parkingslot.isFull(); //return true;
        jeep.unpark(parkingslot);
        parkingslot.isFull();

    }

    @Override
    public String toString() {
        return super.toString();
    }
}

