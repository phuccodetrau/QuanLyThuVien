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
public class Student extends User{

    public Student() {
    }

    public Student(String ID, String Name, int Gender, LocalDate BirthDay, String PhoneNumber) {
        super(ID, Name, Gender, BirthDay, PhoneNumber);
    }
    
}
