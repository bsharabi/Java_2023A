package L10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String citiesName="Ariel, Tel Aviv, Haifa";

        System.out.println(Arrays.toString(citiesName.split(",")));

        Country c = new Country();
        Country c2 = new Country("", 1, 1, 1);

        CityK cityK = new CityK("Ariel", 18596, 529);


        CityK cityK2 = new CityK("TLV", 250897, 20000);

        cityK2.isEqualPatients(cityK);
        cityK.isEqualPatients(cityK2);
    }

    public static Status worldStatus(Country[] arr) {
        int count1 = 0;
        int count2 = 0;
        String names = "";

        Status status = new Status();
        for (int i = 0; i < arr.length; i++) {
            Country country = arr[i];
            if (country.getInfected() == 0) {
//                status.setCount1(status.getCount1()+1);
                status.setCount1(++count1);
            }
            if(country.getRecovered()> country.getDead()) {
//                status.setCount2(status.getCount2()+1);
                status.setCount2(++count2);
            }
            if(country.getInfected()/2 > country.getRecovered()) {
                names+= country.getName()+", ";
                status.setNames(names);
//                status.setNames(status.getNames()+country.getName()+", ");
            }

        }


        return status;
    }

    public static void changeColor(CountryStatus c1, CountryStatus c2){

    }
}
