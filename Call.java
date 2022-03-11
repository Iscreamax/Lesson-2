public class Call {
    public static void call(Client client1,Client client2){
        System.out.println(client1.getFirst_name()+client1.getSurname() + "got through to " + client2.getFirst_name()+client2.getSurname());
        System.out.println("");
    }
}
