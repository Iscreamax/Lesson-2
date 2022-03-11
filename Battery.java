public class Battery {
    private String manufacture;
    private int capacity;

    public Battery(){

    }

    public Battery(String manufacture, int capacity) {
        this.manufacture = manufacture;
        this.capacity = capacity;
    }
    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public static void batteryInfo(Battery battery){
        System.out.println("");
        System.out.println("Battery:");
        System.out.println("Manufacture - "+ battery.getManufacture() );
        System.out.println("Capacity - "+ battery.getCapacity());
    }
}