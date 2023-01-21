/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Book;
import java.util.Comparator;

/**
 *
 * @author HOANGPHUC
 */
public class SortByIDBook implements Comparator<Book>{

    @Override
    public int compare(Book o1, Book o2) {
        return o1.BookID.compareTo(o2.BookID);
    }
    
}
