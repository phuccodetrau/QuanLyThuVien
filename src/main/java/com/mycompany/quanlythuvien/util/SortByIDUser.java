/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.User;
import java.util.Comparator;

/**
 *
 * @author HOANGPHUC
 */
public class SortByIDUser implements Comparator<User>{

    @Override
    public int compare(User o1, User o2) {
        return o1.getUserID().compareTo(o2.getUserID());
    }
    
}
