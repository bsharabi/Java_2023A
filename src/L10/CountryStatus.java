package L10;

import java.util.ArrayList;
import java.util.Arrays;

class CountryStatus {

    private String date;
    private CityK[] cities;
    private int nCity = 0;

    public boolean addCity(String name, int numOfResidents, int numOfPatients) {
        if (cities.length == nCity)
            return false;

//        cities[nCity]=new CityK(name, numOfResidents, numOfPatients);

        CityK cityK = new CityK(name, numOfResidents, numOfPatients);
        cities[nCity] = cityK;
        nCity++;

        return true;
    }

    public String[] getAllCityWithSameColor(String color) {
        ArrayList<String> citiesColor = new ArrayList<>();
        for (int i = 0; i < nCity; i++) {
            if (cities[i].getCityColor().equals(color)) {
                citiesColor.add(cities[i].getName());
            }
        }
        return (String[]) citiesColor.toArray();
    }

    public String[] getAllCityWithSameColor2(String color) {
        String citiesName = "";
        for (int i = 0; i < nCity; i++) {
            if (cities[i].getCityColor().equals(color)) {
                citiesName += cities[i].getName() + " ";
            }
        }
        return citiesName.split(" ");
    }

    public CountryStatus(String date) {
        this.date = date;
        this.cities = new CityK[100];
        this.nCity = 0;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public CityK[] getCities() {
        return cities;
    }

    public void setCities(CityK[] cities) {
        this.cities = cities;
    }

    public int getnCity() {
        return nCity;
    }

    public void setnCity(int nCity) {
        this.nCity = nCity;
    }
}