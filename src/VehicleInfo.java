import java.util.ArrayList;

public class VehicleInfo {
    private String regnNo;
    private ArrayList<String> vehicleRegister = new ArrayList<String>();


    public VehicleInfo(String regnNo) {
        this.regnNo = regnNo;
    }

    public void addToRegister()
    {
        vehicleRegister.add(regnNo);
    }

    public void displayRegister()
    {
        System.out.println("The details of parked vehicles are shown below--");
        //for(int i = 0; i < vehicleRegister.size(); i++) {
            //System.out.println(vehicleRegister.get(i));
        System.out.println(vehicleRegister);
        System.out.println("====================");
    }
}
