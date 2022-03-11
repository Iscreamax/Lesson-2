public class Iphone {
    private int model;
    private String version;
    private int memory;
    private int price;


    public Iphone() {
    }



    public Iphone(int model, String version, int memory, int price) {
        this.model = model;
        this.version = version;
        this.memory = memory;
        this.price = price;
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
    public void setMemory(int memory){
        this.memory = memory;
    }
    public int getMemory(){
        return memory;
    }
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    public static void iphoneInfo(Iphone iphone){
      System.out.println("Iphone "+ iphone.model + " " + iphone.version+" "+iphone.memory  + " Gb price - "+iphone.price + "$");

    }
    public static void memoryInfo(Memory memory){
        System.out.println("");
        System.out.println("Memory:");
        System.out.println("Manufacture - "+ memory.getManufacture() );
        System.out.println("Capacity - "+ memory.getCapacity()+" Gb");
    }
    public static void batteryInfo(Battery battery){
        System.out.println("");
        System.out.println("Battery:");
        System.out.println("Manufacture - "+ battery.getManufacture() );
        System.out.println("Capacity - "+ battery.getCapacity());
    }
    public static void displayInfo(Display display){
        System.out.println("");
        System.out.println("Display:");
        System.out.println("Manufacture - "+ display.getManufacture() );
        System.out.println("Types - "+ display.getTypes());
        System.out.println("Inch - "+ display.getInch());
    }
    public static void cpuInfo(Cpu cpu){
        System.out.println("");
        System.out.println("Cpu:");
        System.out.println("Manufacture - "+ cpu.getManufacture() );
        System.out.println("Frequency - "+ cpu.getFrequency());
        System.out.println("");
    }
    public static void message(Message message,Client client1,Client client2){
        System.out.println("Dear "+ client2.getFirst_name()+client2.getSurname()+client2.getSecond_name() +", "+
                "It's "+ client1.getFirst_name()+client1.getSurname()+client1.getSecond_name()+", "+message.getLetter_field());
        System.out.println("");
    }
    public static void call(Client client1,Client client2){
        System.out.println(client1.getFirst_name()+client1.getSurname() + "got through to " + client2.getFirst_name()+client2.getSurname());
        System.out.println("");
    }

    public static void main(String[] args) {

        Iphone iphone = new Iphone(13,"Pro",256,1350);
        Memory memory = new Memory("Profit",256);
        Battery battery = new Battery("Apple",3300);
        Display display = new Display("Samsung","Oled",6.1);
        Cpu cpu = new Cpu("Bionic",2.7);
        Client client_1 = new Client("Jack ","Vorobey ","Aleksandrovich");
        Client client_2 = new Client("Valet ","Kozirny ","Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        iphoneInfo(iphone);
        memoryInfo(memory);
        batteryInfo(battery);
        displayInfo(display);
        cpuInfo(cpu);
        System.out.println("Sending a message:");
        message(message,client_1,client_2);
        System.out.println("Making a call:");
        call(client_1,client_2);
        System.out.println("We change names and make a call:");
        client_1.setFirst_name("Max ");
        client_2.setFirst_name("Oleg ");
        call(client_1,client_2);
    }



}