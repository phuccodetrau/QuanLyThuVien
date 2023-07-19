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
public class Card {
    private String CardID;
    private String UserID;
    private LocalDate BorrowDate;
    private LocalDate ExpiryDate;
    private LocalDate ReturnDate;
    private int Amount;
    private int ReturnStatus;//R-N
    private int ExpiryStatus;//E-U
    private int TotalCost;

    public Card() {
    }

    public Card(String CardID, String UserID, LocalDate BorrowDate, LocalDate ExpiryDate, LocalDate ReturnDate, int Amount) {
        this.CardID = CardID;
        this.UserID = UserID;
        this.BorrowDate = BorrowDate;
        this.ExpiryDate = ExpiryDate;
        this.ReturnDate = ReturnDate;
        this.Amount = Amount;
    }

    public String getCardID() {
        return CardID;
    }

    public void setCardID(String CardID) {
        this.CardID = CardID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public LocalDate getBorrowDate() {
        return BorrowDate;
    }

    public void setBorrowDate(LocalDate BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public LocalDate getReturnDate() {
        return ReturnDate;
    }

    public void setReturnDate(LocalDate ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getReturnStatus() {
        return ReturnStatus;
    }

    public void setReturnStatus(int ReturnStatus) {
        this.ReturnStatus = ReturnStatus;
    }

    public int getExpiryStatus() {
        return ExpiryStatus;
    }

    public void setExpiryStatus(int ExpiryStatus) {
        this.ExpiryStatus = ExpiryStatus;
    }

    public int getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(int TotalCost) {
        this.TotalCost = TotalCost;
    }
    
    
}
