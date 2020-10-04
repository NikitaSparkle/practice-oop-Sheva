package org.itstep.task01;

import java.util.Scanner;

/**
 * Задание 1
 * <p>
 * Создайте класс «Человек» (Human).
 * <p>
 * Необходимо хранить в полях класса:
 * - ФИО (fullName),
 * - дату рождения (dateOfBirth),
 * - контактный телефон (phone),
 * - город (city),
 * - страну (country),
 * - домашний адрес (address).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
 * доступ к отдельным полям через методы аксессоры.
 * <p>
 * Создайте два конструктора: один по умолчанию, другой - со 6 параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Main {
    public static void main(String[] args) {
        Human human1=new Human("Nick",14_04_2002,955625647,"Dnipro","Ukraine","Heroiv ave");
        System.out.println("Name: "+human1.getFullName()+"\n");
        System.out.println("Birthday: "+human1.getDateofBirth()+"\n");
        System.out.println("Phone: +380"+human1.getPhone()+"\n");
        System.out.println("City: "+human1.getCity()+"\n");
        System.out.println("Country: "+human1.getCountry()+"\n");
        System.out.println("Address: "+human1.getAddress()+"\n");

    }
}

class Human {
    private String fullName;
    private int dateofBirth;
    private int phone;
    private String city;
    private String country;
    private String address;

    Human() {
        String fullName = "";
        this.fullName = fullName;
        dateofBirth = 00_00_0000;
        phone = 0000000000;
        String city = "";
        this.city = city;
        String country = "";
        this.country = country;
        String address = "";
        this.address = address;
    }

    Human(String fullName,int dateofBirth,int phone,String city,String country,String address)
    {
        this.fullName=fullName;
        this.dateofBirth=dateofBirth;
        this.phone=phone;
        this.city=city;
        this.country=country;
        this.address=address;
    }

    public String getFullName() { return fullName; }

    public int getDateofBirth() { return dateofBirth; }

    public int getPhone() { return phone; }

    public String getCity() { return city; }

    public String getCountry() { return country; }

    public String getAddress() { return address; }

    public void setFullName(String fullName) { this.fullName = fullName; }

    public void setDateofBirth(int dateofBirth) { this.dateofBirth = dateofBirth; }

    public void setPhone(int phone) { this.phone = phone; }

    public void setCity(String city) { this.city = city; }

    public void setCountry(String country) { this.country = country; }

    public void setAddress(String address) { this.address = address; }
}