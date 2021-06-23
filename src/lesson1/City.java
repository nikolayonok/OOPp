package lesson1;

public class City {

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

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPhone() {
        return phoneCode;
    }

    public void setPhone(int phone) {
        this.phoneCode = phone;
    }

    private String cityName;
    private String regionName;
    private String countryName;
    private int population;
    private int index;
    private int phoneCode;

}
