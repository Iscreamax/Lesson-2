public class Message {

    private String letter_field;

    public Message(){

    }
    public Message(String letter_field) {
        this.letter_field = letter_field;
    }

    public String getLetter_field() {
        return letter_field;
    }

    public void setLetter_field(String letter_field) {
        this.letter_field = letter_field;
    }
    public static void message(Message message,Client client1,Client client2){
        System.out.println("Dear "+ client2.getFirst_name()+client2.getSurname()+client2.getSecond_name() +", "+
                "It's "+ client1.getFirst_name()+client1.getSurname()+client1.getSecond_name()+", "+message.getLetter_field());
        System.out.println("");
    }

}
