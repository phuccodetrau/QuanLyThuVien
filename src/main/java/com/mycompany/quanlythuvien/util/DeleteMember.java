/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.util;

import com.mycompany.quanlythuvien.model.Member;
import java.util.List;

/**
 *
 * @author HOANGPHUC
 */
public class DeleteMember {
    public Member Delete(List<Member> list, String key){
        for(Member u : list){
            if(u.getUserID().equals(key)){
                return u;
            }
        }
        return null;
    }
}
