/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quanlythuvien.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HOANGPHUC
 */
public class DBConnect {

    Connection con;

    public DBConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://DESKTOP-AP629KT\\SQLEXPRESS:1433;databaseName=Library_Management;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "sa";
            String password = "hoangphuc0703";
            con = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ResultSet getData(String stringSQL){
        ResultSet rs = null;
        try {
            Statement state = con.createStatement();
            rs = state.executeQuery(stringSQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getCard(String stringSQL){
        ResultSet rs = null;
        try {
            Statement state = con.createStatement();
            rs = state.executeQuery(stringSQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getBorrowedBookMember(String stringSQL){
        ResultSet rs = null;
        try {
            Statement state = con.createStatement();
            rs = state.executeQuery(stringSQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet getBorrowedBookStudent(String stringSQL){
        ResultSet rs = null;
        try {
            Statement state = con.createStatement();
            rs = state.executeQuery(stringSQL);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public int ExcuteSQLInsertSV(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO Student(StudentID, StudentName, Gender, Birthday, PhoneNumber, Email, Addr) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
     public int ExcuteSQLInsertTV(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO Member(MemberID, MemberName, Gender, Birthday, PhoneNumber, Email, Addr) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     
     public int ExcuteSQLInsertTL(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO Category(ID, CategoryName) VALUES(?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     
     public int ExcuteSQLInsertBook(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO Book(BookID, BookName, Author, Publisher, CategoryID, Price, Amount, Available) VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            statement.setString(8, stringSQL[7]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     public int ExcuteSQLInsertStudentCard(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO StudentCard(CardID, StudentID, BorrowDate, ExpiryDate, ReturnDate, Amount, ReturnStatus, ExpiryStatus, Price) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            statement.setString(8, stringSQL[7]);
            statement.setString(9, stringSQL[8]);
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     
     public int ExcuteSQLInsertMemberCard(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO MemberCard(CardID, MemberID, BorrowDate, ExpiryDate, ReturnDate, Amount, ReturnStatus, ExpiryStatus, Price) VALUES(?,?,?,?,?,?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            statement.setString(8, stringSQL[7]);
            statement.setString(9, stringSQL[8]);
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     public int ExcuteSQLInsertBorrowedBookStudent(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO BorrowedBookStudent(CardID, BookID, BookStatus, BookName) VALUES(?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
     public int ExcuteSQLInsertBorrowedBookMember(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "INSERT INTO BorrowedBookMember(CardID, BookID, BookStatus, BookName) VALUES(?,?,?,?)";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateSV(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE Student SET StudentName=?, Gender=?, BirthDay=?, PhoneNumber=?, Email=?, Addr=? WHERE StudentID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    
    public int ExcuteSQLUpdateTV(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE Member SET MemberName=?, Gender=?, BirthDay=?, PhoneNumber=?, Email=?, Addr=? WHERE MemberID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateTL(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE Category SET CategoryName=? WHERE ID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateBook(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE Book SET BookName = ?, Author = ?, Publisher = ?, CategoryID = ?, Price = ?, Amount = ?, Available = ? WHERE BookID = ?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            statement.setString(3, stringSQL[2]);
            statement.setString(4, stringSQL[3]);
            statement.setString(5, stringSQL[4]);
            statement.setString(6, stringSQL[5]);
            statement.setString(7, stringSQL[6]);
            statement.setString(8, stringSQL[7]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateBookBookAvailble(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE Book SET Available = ? WHERE BookID = ?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateStudentCardAmount(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE StudentCard SET Amount = ? WHERE CardID = ?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLUpdateMemberCardAmount(String[] stringSQL){
        int rowsInserted = 0;
        String sql = "UPDATE MemberCard SET Amount = ? WHERE CardID = ?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL[0]);
            statement.setString(2, stringSQL[1]);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteSV(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM Student WHERE StudentID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }

    public int ExcuteSQLDeleteTV(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM Member WHERE MemberID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteTL(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM Category WHERE ID = ?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteBook(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM Book WHERE BookID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteBorrowedBookStudent(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM BorrowedBookStudent WHERE BookID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteBorrowedBookMember(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM BorrowedBookMember WHERE BookID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteStudentCard(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM StudentCard WHERE CardID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
    
    public int ExcuteSQLDeleteMemberCard(String stringSQL){
        int rowsInserted = 0;
        String sql = "DELETE FROM MemberCard WHERE CardID=?";
        PreparedStatement statement;
        try {
            statement = con.prepareStatement(sql);
            statement.setString(1, stringSQL);
            
            rowsInserted = statement.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowsInserted;
    }
}
