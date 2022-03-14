public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("Profit",256);
        Battery battery = new Battery("Apple",3300);
        Display display = new Display("Samsung","Oled",6.1);
        Cpu cpu = new Cpu("Bionic",2.7);
        Client firstClient = new Client("Jack ","Vorobey ","Aleksandrovich");
        Client secondClient= new Client("Valet ","Kozirny ","Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        Iphone iphone = new Iphone(13,"Pro",memory,battery,display,cpu,1350);
        System.out.println(iphone.iphoneInfo());
        System.out.println(memory.memoryInfo());
        System.out.println(battery.batteryInfo());
        System.out.println(display.displayInfo());
        System.out.println(cpu.cpuInfo());
        System.out.println("");
        System.out.println("Sending a message:");
        System.out.println(iphone.sendMessage(message,firstClient,secondClient));
        System.out.println("Making a call:");
        System.out.println(iphone.makeCall(firstClient,secondClient));
        System.out.println("We change names and make a call:");
        firstClient.setFirstName("Max ");
        secondClient.setFirstName("Oleg ");
        System.out.println(iphone.makeCall(firstClient,secondClient));

    }
}
