/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.BorrowedBook;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class DeleteBorrowedBook {
    public BorrowedBook Delete(List<BorrowedBook> list, String key){
        for(BorrowedBook b : list){
            if(b.getBookID().equals(key)){
                return b;
            }
        }
        return null;
    }
}
