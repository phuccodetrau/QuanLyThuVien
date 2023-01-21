/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.model;

/**
 *
 * @author HOANGPHUC
 */
public class BorrowedBook {
    private String CardID;
    private String BookID;
    private String TenSach;
    
    public int BookStatus;// R-N

    public BorrowedBook() {
    }

    public BorrowedBook(String CardID, String BookID, String TenSach, int BookStatus) {
        this.CardID = CardID;
        this.BookID = BookID;
        this.TenSach = TenSach;
        this.BookStatus = BookStatus;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }
    
    

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }
    
    
}
