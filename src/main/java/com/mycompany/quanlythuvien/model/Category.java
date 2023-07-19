/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class Category {
    public String CategoryID;
    public String Name;

    public Category(String ID, String Name) {
        this.CategoryID = ID;
        this.Name = Name;
    }

    public Category() {
    }

    public String getCategoryID() {
        return CategoryID;
    }

    public void setID(String ID) {
        this.CategoryID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
}
