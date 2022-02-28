/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_class;

import centre_libraly.DB_connect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Borrow_book {
    private int id;
    private String book_id;
    private int Member_id;
    private String status;
    private String borrow_date;
    private String return_date;

    public Borrow_book(){};
    public Borrow_book(int _id,String book_id, int Member_id, String status, String borrow_date, String return_date) {
        this.id = _id;
        this.book_id = book_id;
        this.Member_id = Member_id;
        this.status = status;
        this.borrow_date = borrow_date;
        this.return_date = return_date;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public void setBook_id(String book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int Member_id) {
        this.Member_id = Member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }
    public int getId() {
        return id;
    }
    public String getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return Member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public String getReturn_date() {
        return return_date;
    }
    public static Borrow_book getData(int _id){
        String selectQuery = "Insert into return_list() values ()";
        return null;
    }
    public static void addBorrow(String book_id, int Member_id, String status, String borrow_date, String return_date)
    {
        String insertQuery = "insert into Borrow_book(book_id, Member_id, statuss, borrow_date, return_date) values(?,?,?,?,?)";
        
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(insertQuery);
            ps.setString(1, book_id);
            ps.setInt(2, Member_id);
            ps.setString(3, status);
            ps.setString(4, borrow_date);
            ps.setString(5, return_date);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "data have been save");
            }else{
                JOptionPane.showMessageDialog(null, "failure");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean checkBookAvailable(String id){
         boolean Availability = false;
         BooksManage selectedQuantity = BooksManage.searchByID(id);
         int quantity = selectedQuantity.getQuantity();
         
         int borrow_num = countData(id);
        
         if(quantity > borrow_num){
             Availability = true;
         }else{
             Availability = false;
         }
        return Availability;
    }
    
    public int countData(String id){
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try{
            ps = DB_connect.getConnection().prepareStatement("select count(*) as total from Borrow_book where book_id = ? and statuss = 'issue' ");
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                total = rs.getInt("total");
            }
        }catch(SQLException e){
            Logger.getLogger(Borrow_book.class.getName()).log(Level.SEVERE, null, e);
        }
        return total;
    }
    public static ArrayList<Borrow_book> Borrow_List(){
        ArrayList<Borrow_book> borrowlist = new ArrayList<>();
        String selectQuery = "select * from Borrow_book";
        try{
            ResultSet rs = function_java.getData(selectQuery);
            while(rs.next()){
                Borrow_book borrow= new Borrow_book(rs.getInt("id"),rs.getString("book_id"),rs.getInt("Member_id"), rs.getString("statuss"), rs.getString("borrow_date"), rs.getString("return_date"));
                borrowlist.add(borrow);
            }
        }catch(SQLException e){
            Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null , e);
        }
        return borrowlist;
    }
    
    // return book to libraly database
    
    public static void Return_book(int id, String _status){
        String UpdateQuery = "update Borrow_book set statuss = ? where id = ?";
        
        try{
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(UpdateQuery);
            ps.setString(1, _status);
            ps.setInt(2, id);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "book have been return");
            }else{
                JOptionPane.showMessageDialog(null, "there is sometthing wrong");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
        public static void DeleteBorrow(String id){
        String updateQuery = "delete from Borrow_book where book_id = ?";
         PreparedStatement ps;
         try{
             ps = DB_connect.getConnection().prepareStatement(updateQuery);
             ps.setString(1, id);
         }catch(SQLException e){
             System.out.println(e.getMessage());
         }
    }
  }
