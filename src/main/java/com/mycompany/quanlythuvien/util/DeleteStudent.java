/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Student;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class DeleteStudent {
    public Student Delete(List<Student> list, String key){
        for(Student u : list){
            if(u.getUserID().equals(key)){
                return u;
            }
        }
        return null;
    }
}
