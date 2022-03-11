public class Client {
    private String first_name;
    private String surname;
    private String patronymic;

    public Client(){

    }
    public Client(String first_name, String surname, String patronymic) {
        this.first_name = first_name;
        this.surname = surname;
        this.patronymic = patronymic;
    }

    public Client(String first_name, String surname) {
        this.first_name = first_name;
        this.surname = surname;
    }
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecond_name() {
        return patronymic;
    }

    public void setSecond_name(String second_name) {
        this.patronymic = second_name;
    }


}
