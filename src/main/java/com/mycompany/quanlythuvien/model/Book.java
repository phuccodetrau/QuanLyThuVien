/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class Book {
    public String BookID;
    public String Name;
    public String Author;
    public String Publisher;
    public String CategoryID;
    public int Price;
    public int Amount;
    public int Available;

    public Book(String BookID, String Name, String Author, String Publisher, String CategoryID, int Price, int Amount, int Available) {
        this.BookID = BookID;
        this.Name = Name;
        this.Author = Author;
        this.Publisher = Publisher;
        this.CategoryID = CategoryID;
        this.Price = Price;
        this.Amount = Amount;
        this.Available = Available;
    }

    public Book() {
    }
    
    
}
