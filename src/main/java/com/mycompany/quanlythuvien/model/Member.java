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
public class Member extends User{

    public Member() {
    }

    public Member(String ID, String Name, int Gender, LocalDate BirthDay, String PhoneNumber) {
        super(ID, Name, Gender, BirthDay, PhoneNumber);
    }
    
}
