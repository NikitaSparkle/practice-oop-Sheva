package org.itstep.task02;

/**
 * Задание 2
 * <p>
 * Создайте класс «Город» (City).
 * <p>
 * Необходимо хранить в полях класса:
 * - название города (name),
 * - название региона (region),
 * - название страны (country),
 * - количество жителей в городе (inhabitants),
 * - почтовый индекс города (index),
 * - телефонный код города (code).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных,
 * реализуйте конструктор с параметром и по умолчанию, геттеры и сеттеры для полей.
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */

public class Main {
    public static void main(String[] args) {
        City city1=new City("Seattle","Washington","United States",608_660,98101,206);

        System.out.print("Name: "+city1.getName()+"\n");
        System.out.print("Region: "+city1.getRegion()+"\n");
        System.out.print("Country: "+city1.getCountry()+"\n");
        System.out.print("Inhabitants: "+city1.getInhabitants()+"\n");
        System.out.print("Index: "+city1.getIndex()+"\n");
        System.out.print("Code: "+city1.getCode()+"\n");
    }
}

class City {
    private String name;
    private String region;
    private String country;
    private int inhabitants;
    private int index;
    private int code;

    City() {
        String name = "";
        this.name = name;
        String region = "";
        this.region = region;
        String country = "";
        this.country = country;
        inhabitants = 0;
        index = 0;
        code = 0;
    }

    City(String name, String region, String country, int inhabitants, int index, int code) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public int getIndex() {
        return index;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCode(int code) {
        this.code = code;
    }
}