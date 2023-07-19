/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Card;
import java.util.Comparator;

/**
 *
 * @author HOANGPHUC
 */
public class SortByCardID  implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        return o1.getCardID().compareTo(o2.getCardID());
    }
    
}
