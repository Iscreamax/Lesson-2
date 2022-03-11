public class Cpu {
    private String manufacture;
    private double frequency;

    public Cpu(){

    }

    public Cpu(String manufacture, double frequency) {
        this.manufacture = manufacture;
        this.frequency = frequency;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
    public static void cpuInfo(Cpu cpu){
        System.out.println("");
        System.out.println("Cpu:");
        System.out.println("Manufacture - "+ cpu.getManufacture() );
        System.out.println("Frequency - "+ cpu.getFrequency());
        System.out.println("");
    }
}
