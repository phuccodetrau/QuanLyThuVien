/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Category;
import java.util.Comparator;

/**
 *
 * @author HOANGPHUC
 */
public class SortByIDCategory implements Comparator<Category>{

    @Override
    public int compare(Category o1, Category o2) {
        return o1.CategoryID.compareTo(o2.CategoryID);
    }
    
}
