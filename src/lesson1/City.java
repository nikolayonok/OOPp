package lesson1;

public class City {

    public City(String cityName, String regionName, String countryName, String population, String index, String phoneCode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.population = population;
        this.index = index;
        this.phoneCode = phoneCode;
    }
    public void hello(){

    }
    public void hello(String i){

    }
    public City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }

    private String cityName;
    private String regionName;
    private String countryName;
    private String population;
    private String index;
    private String phoneCode;

}
