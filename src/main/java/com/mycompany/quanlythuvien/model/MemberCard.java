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
public class MemberCard extends Card{

    public MemberCard() {
    }

    public MemberCard(String CardID, String UserID, LocalDate BorrowDate, LocalDate ExpiryDate, LocalDate ReturnDate, int Amount) {
        super(CardID, UserID, BorrowDate, ExpiryDate, ReturnDate, Amount);
    }
    
}
