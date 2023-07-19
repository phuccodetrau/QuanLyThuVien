/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Card;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class DeleteCard {
    public Card Delete(List<Card> list, String key){
        for(Card c : list){
            if(c.getCardID().equals(key)){
                return c;
            }
        }
        return null;
    }
}
