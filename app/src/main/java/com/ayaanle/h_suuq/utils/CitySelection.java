package com.ayaanle.h_suuq.utils;

import com.ayaanle.h_suuq.implementation.CitySelectImpl;

public class CitySelection {
    enum Cities implements CitySelectImpl<Cities> {
        Berbera , Hargeisa , Borame , Burco , Erigavo , Zeila
        ;
        //now lets implement the methods that will facilitate for us to select cities

        @Override
        public Cities chooseCity(String city) {
            switch(city) {
                case "Berbera":
                    return Cities.Berbera;
                case "Burco":
                    return Cities.Burco;
                case "Hargeisa":
                    return Cities.Hargeisa;
                default:
                    // the city you have entered cannot be found
                    return null;

            }
        }

        @Override
        public String updateCity(String CityName) {
            //Iterate this String arrays so that you can assign each name to its respective name in enumeration
            String [] nameOfCities = {"Hargeisa" , "Berbera" , "Burco" , "Borame" , "Erigavo"};
            for(String name : nameOfCities)
            {
                switch(name)
                {
                    case "Hargeisa":
                        CityName = name;
                        return CityName;
                    case "Berbera":
                        CityName = name;
                        return CityName;
                    case "Burco":
                        CityName = name;
                        return CityName;
                    default:
                        return "cannot find the name of the city";
                }
            }

            return CityName;
        }
    }
    private static class Searcher{

    }
}
