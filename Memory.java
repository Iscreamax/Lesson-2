public class Memory {
    private String manufacture;
    private int capacity;

    public Memory(){

    }

    public Memory(String manufacture, int capacity) {
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


}
