package lesson1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.getFio();
        human.getAdress();
        human.getBirthday();
        human.getCity();
        human.getCounry();
        human.getPhone(new Scanner(sc.next));

        City city = new City();
        city.getCityName();
        city.getCountryName();
        city.getIndex();
        city.getPopulation();
        city.getPhone();
        city.getRegionName();

        Country country = new Country();
        country.getCountryName();
        country.getContinentName();
        country.getPopulation();
        country.setPhoneCode();
        country.getCapital();
        country.getCities();
    }
}
