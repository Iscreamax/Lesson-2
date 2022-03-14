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

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
    public  String iphoneInfo(){
        return("Iphone "+ model + "/" + version+"/"+memory.getCapacity()  + "Gb/"
                + battery.getCapacity()+ "mah/"+display.getInch()+"inh/"+cpu.getFrequency()+
                "Ggz/price -"+price + "$");
    }

    public String makeCall (Client firstClient, Client secondClient){
        return (firstClient.getFirstName()+firstClient.getSurname() +
                "got through to " + secondClient.getFirstName()+secondClient.getSurname());
    }
    public String sendMessage(Message message,Client firstClient,Client secondClient){
        return ("Dear "+ secondClient.getFirstName()+secondClient.getSurname()+secondClient.getPatronymic()+", "+
                "It's "+ firstClient.getFirstName()+firstClient.getSurname()+firstClient.getPatronymic()+", "+message.getLetter_field());

    }
}