package lesson1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction fraction = new Fraction();
        fraction.getNumerator();
        fraction.getDenominator();
        fraction.setNumerator(sc.nextInt());
        fraction.setDenominator(sc.nextInt());

        System.out.println(fraction.getNumerator());
        System.out.println(fraction.getDenominator());
//        Human human = new Human();
//        human.getFio();
//        human.getAdress();
//        human.getBirthday();
//        human.getCity();
//        human.getCounry();
//        human.setFio("asd");
//        human.setAdress("sad");
//        human.setBirthday("dsgdf");
//        human.setCity("asfds");
//        human.setCounry("asfds");
//        System.out.println(human.getAdress());
//
//        City city = new City();
//
//        city.getCityName();
//        city.getCountryName();
//        city.getIndex();
//        city.getPopulation();
//        city.getRegionName();
//        city.getPhoneCode();
//        city.setCityName("asd");
//        city.setCountryName("privet");
//        city.setIndex("sad");
//        city.setPopulation("");
//        city.setPhoneCode("");
//        city.setRegionName("");
//        System.out.println(city.getCountryName());
//
//        Country country = new Country();
//        country.getCountryName();
//        country.getContinentName();
//        country.getPopulation();
//        country.getPhoneCode();
//        country.getCapital();
//        country.getCities();
//        country.setPhoneCode("");
//        country.setPopulation("");
//        country.setCountryName("");
//        country.setCapital("");
//        country.setCities("kek");
//        country.setContinentName("");
//        System.out.println(country.getCities());


    }
}
