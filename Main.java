public class Main {
    public static void main(String[] args) {

        Memory memory = new Memory("Profit",256);
        Battery battery = new Battery("Apple",3300);
        Display display = new Display("Samsung","Oled",6.1);
        Cpu cpu = new Cpu("Bionic",2.7);
        Client client_1 = new Client("Jack ","Vorobey ","Aleksandrovich");
        Client client_2 = new Client("Valet ","Kozirny ","Albertovich");
        Message message = new Message("I'm going to be late for work, I'm sorry!");
        Iphone iphone = new Iphone(13,"Pro",memory,battery,display,cpu,1350);
        Iphone.iphoneInfo(iphone);
        Memory.memoryInfo(memory);
        Battery.batteryInfo(battery);
        Display.displayInfo(display);
        Cpu.cpuInfo(cpu);
        System.out.println("Sending a message:");
        Message.message(message,client_1,client_2);
        System.out.println("Making a call:");
        Call.call(client_1,client_2);
        System.out.println("We change names and make a call:");
        client_1.setFirst_name("Max ");
        client_2.setFirst_name("Oleg ");
        Call.call(client_1,client_2);

    }
}
