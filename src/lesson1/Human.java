package lesson1;

public class Human {

    public Human() {
    }

    public Human(String fio, String birthday, String phone, String city, String counry, String adress) {
        this.fio = fio;
        this.birthday = birthday;
        this.phone = phone;
        this.city = city;
        this.counry = counry;
        this.adress = adress;
    }



    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounry() {
        return counry;
    }

    public void setCounry(String counry) {
        this.counry = counry;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private String fio;
    private String birthday;
    private String phone;
    private String city;
    private String counry;
    private String adress;


}
