package org.itstep.task03;

import org.itstep.task02.City;

import java.util.Arrays;

public class Country {
    private String name;
    private String continent;
    private String code;
    private City capital;
    private int numberOfCities;
    private City[] cities=new City[0];

    public Country(String name, String continent, String code, City city) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = city;
    }

    public Country()
    {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public void addCity(City city) {

        this.cities = Arrays.copyOf(this.cities,this.cities.length+1);
        this.cities[this.cities.length-1]=city;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    public String getCode() {
        return code;
    }

    public City getCapital() {
        return capital;
    }

    public City[] getCities() {
        return cities;
    }

    public int getInhabitants(){
        int sum=0;
        for(int i=0;i<cities.length;i++){
            sum+=cities[i].getInhabitants();
        }
        return sum;
    }

}
