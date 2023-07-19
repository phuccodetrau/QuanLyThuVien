/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.model;

import java.time.LocalDate;

/**
 *
 * @author HOANGPHUC
 */
public class User {
    private String UserID;
    private String Name;
    private int Gender;
    private LocalDate BirthDay;
    private String PhoneNumber;
    private String Email;
    private String Address;

    public User() {
    }

    public User(String ID, String Name, int Gender, LocalDate BirthDay, String PhoneNumber) {
        this.UserID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.BirthDay = BirthDay;
        this.PhoneNumber = PhoneNumber;
    }

    public String getUserID() {
        return UserID;
    }

    public void setID(String ID) {
        this.UserID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getGender() {
        return Gender;
    }

    public void setGender(int Gender) {
        this.Gender = Gender;
    }

    public LocalDate getBirthDay() {
        return BirthDay;
    }

    public void setBirthDay(LocalDate BirthDay) {
        this.BirthDay = BirthDay;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
