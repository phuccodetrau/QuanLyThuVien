/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class BorrowedBookStudent extends BorrowedBook{

    public BorrowedBookStudent() {
    }

    public BorrowedBookStudent(String CardID, String BookID, String TenSach, int BookStatus) {
        super(CardID, BookID, TenSach, BookStatus);
    }
    
}
