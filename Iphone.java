public class Iphone {
    private int model;
    private String version;
    private int price;
    private Battery battery;
    private Memory memory;
    private Display display;
    private Cpu cpu;


    public Iphone(int model, String version,Memory memory,Battery battery,Display display,Cpu cpu, int price) {
        this.model = model;
        this.version = version;
        this.price = price;
        this.memory= memory;
        this.battery=battery;
        this.display=display;
        this.cpu=cpu;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getModel() {
        return model;
    }
    public void setVersion(String version){
        this.version=version;
    }
    public String getVersion(){
        return version;
    }

    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public static void iphoneInfo(Iphone iphone){
      System.out.println("Iphone "+ iphone.model + "/" + iphone.version+"/"+iphone.memory.getCapacity()  + "Gb/"
              + iphone.battery.getCapacity()+ "mah/"+ iphone.display.getInch()+"inh/"+iphone.cpu.getFrequency()+"Ggz/price -"+iphone.price + "$");

    }

}