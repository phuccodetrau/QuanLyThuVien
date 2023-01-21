/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Book;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class DeleteSach {
    public Book Delete(List<Book> list, String key){
        for(Book u : list){
            if(u.BookID.equals(key)){
                return u;
            }
        }
        return null;
    }
}
