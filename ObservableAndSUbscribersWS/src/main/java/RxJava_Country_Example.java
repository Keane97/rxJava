
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Keane
 */
public class RxJava_Country_Example {
     public static void main (String[] args) {
    //populate eurozone
    System.out.println("...........................");
    System.out.println("Creating eurozone with 17 countries");
    
    List <Country> countries = new ArrayList<>();
    
    //country name, capital, area in thousands Km^2, population in millions
    countries.add(new Country("Austria", "Vienna", 83, 8.3, true));
    countries.add(new Country("Belgium", "Brussels", 30, 10, true));
    countries.add(new Country("Cyprus", "Nicosia", 9, 0.8, true));
    countries.add(new Country("Estonia", "Tallinn", 45, 1.3, true));
    countries.add(new Country("Finland", "Helsinki", 338, 5.3, true));
    countries.add(new Country("France", "Paris", 550, 64, true));
    countries.add(new Country("Germany", "Berlin", 356, 82, true));
    countries.add(new Country("Greece", "Athens", 131, 11, true));
    countries.add(new Country("Ireland", "Dublin", 70, 4.5, true));
    countries.add(new Country("Italy", "Rome", 301, 60, true));
    countries.add(new Country("Luxembourg", "Luxembourg", 2, 0.5, true));
    countries.add(new Country("Netherlands", "Amsterdam", 41, 16, true));
    countries.add(new Country("Portugal", "Lisbon", 92, 10.6, true));
    countries.add(new Country("Slovakia", "Bratislava", 48, 5.4, true));
    countries.add(new Country("Slovenia", "Ljubljiana", 20, 2, true));
    countries.add(new Country("Spain", "Madrid", 504, 45, true));
    
    System.out.println("Creating non-eurozone countries");
    
    countries.add(new Country("South Korea", "Seoul", 97, 51, false));
    countries.add(new Country("Namibia", "Windhoek", 823, 2.49, false));
    countries.add(new Country("Mexico", "Mexico", 127, 1943, false));
    countries.add(new Country("Australia", "Canberra", 7682, 25.2, false));
    countries.add(new Country("Argentina", "Beunos Aires", 2736, 45, false));
    countries.add(new Country("Pakistan", "Islamabad", 770, 216, false));
   

    
    
    //************************************************************************
    //************************************************************************
    //Using the streams functions build perform the following tasks:
    //************************************************************************
    //************************************************************************

    //************************************************************************
    //Create a cold observable that emits the list of country objects above 
    //************************************************************************
       /*  Observable<Country> ListOfCountries = Observable.fromIterable(countries);
         ListOfCountries.subscribe(list -> System.out.println(list));*/
    
    //************************************************************************
    //Create an observable chain where the end Observer receives coutries objects 
    //that are in the EU and whose capitals begin with L
    //************************************************************************
    /*Observable<Country> EUCountryStartWithLObjects = Observable.fromIterable(countries);
    EUCountryStartWithLObjects.filter(country -> country.getCapital().startsWith("L"))
            .subscribe(country -> System.out.println(country));
    
    //************************************************************************
    //Create an observable chain where the end Observer receives the names of 
    //coutries are in the EU and whose capitals begin with L
    //************************************************************************
    
    Observable<Country> EUCountryStartWithL = Observable.fromIterable(countries);
    EUCountryStartWithL.filter(country -> country.getCapital().startsWith("L"))
            .subscribe(country -> System.out.println(country.getName() + " " + country.getCapital()));*/
    
    

    //************************************************************************
    //Create an observable chain where the end Observer receives a MapEntry Object 
    //with key of country name and value of poulation 
    //Populate a HashMap with each entry in the end subscriber

   /* HashMap<String, Double> Cities = new HashMap<>();
    Observable<Country> CountryNameAndPop = Observable.fromIterable(countries);
    CountryNameAndPop.subscribe(city -> Cities.put(city.getName(), city.getPopulation()));
         System.out.println(Cities);*/
    
    //************************************************************************
    //Create an observable chain where the end Observer receives a MapEntry Object 
    //with a key of country name and value of poulation density (people per 1km^2) 
    //Populate a HashMap with each entry in the end subscriber
    //POPULATION DENSITY = NUMBER OF PEOPLE / LAND AREA
    
    HashMap<String, Double> Cities2 = new HashMap<>();
    Observable<Country> CountryPopDensity = Observable.fromIterable(countries);
    CountryPopDensity.subscribe(city -> Cities2.put(city.getName(), city.getPopulation()/city.getArea()));
         System.out.println(Cities2);
    
    //************************************************************************
    //Create an observable chain where the end Observer receives a MapEntry Object 
    //with key of country name and value of poulation 
    //Populate a HashMap with each entry in the end subscriber
    
    }
}
