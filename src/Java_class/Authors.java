/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_class;

import centre_libraly.DB_connect;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
/**
 *
 * @author HP
 */
public class Authors {
    private int id;
    private String name;
    private String lastName;
    private String fieldOFexpertise;
    private String about;
    
public Authors(){};    
public Authors(int _id, String Fname, String Lname){
    this.id = _id;
    this.name = Fname;
    this.lastName = Lname;
}
public Authors(int _id, String _name, String _lName, String _fieldOFexpertise, String _about){
    this.id = _id;
    this.name = _name;
    this.lastName = _lName;
    this.fieldOFexpertise = _fieldOFexpertise;
    this.about = _about;
  }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFieldOFexpertise(String fieldOFexpertise) {
        this.fieldOFexpertise = fieldOFexpertise;
    }

    public void setAbout(String about) {
        this.about = about;
    }
   

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFieldOFexpertise() {
        return fieldOFexpertise;
    }

    public String getAbout() {
        return about;
    }
    
    public void addAuthors(int _id,String Fname, String Lname, String expertise, String about){
        String insertQuery = "insert into Authors (id, firstname, lastname, expertise, about) values(?, ?, ?, ?, ?)";
        
        
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(insertQuery);
            ps.setInt(1, _id);
            ps.setString(2, Fname);
            ps.setString(3, Lname);
            ps.setString(4, expertise);
            ps.setString(5, about);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Authors added", "Added succesfull", 1);
            }else{
            JOptionPane.showMessageDialog(null, "Added fail", "error", 2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void editAuthors(int _id, String _Fname, String _Lname, String _expertise, String _about){
        String editQuery = "update Authors set firstname = ?, lastname = ?, expertise = ?, about = ? where id = ?";
        
        try{
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(editQuery);
            
             ps.setString(1, _Fname);
             ps.setString(2, _Lname);
             ps.setString(3, _expertise);
             ps.setString(4, _about);
             ps.setInt(5, _id);
            if(ps.executeUpdate() != 0){
              JOptionPane.showMessageDialog(null, "Authors have been edited", "edit Authors", 1);
            }else{
                JOptionPane.showMessageDialog(null, "edit is fail", "edit fail", 0);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
       
    }
    
    public void deleteAuthors(int _id){
        String deleteQuery = "delete from Authors where id = ?";
        
        try{
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(deleteQuery);
            ps.setInt(1,_id);
       
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "data have been delete", "successful delete", 1);
            }else{
                JOptionPane.showMessageDialog(null, "delete is fail", "ubsuccessful", 0);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static ArrayList<Authors> AuthorList(){
        ArrayList<Authors> authorsList = new ArrayList<>();
        
        String selectQuery = "select * from Authors";
       
            function_java func = new function_java();
        try {
 
           ResultSet rs = func.getData(selectQuery);
           
            while(rs.next()){
                
               Authors author = new Authors(rs.getInt("id"), rs.getString("firstname"), rs.getString("lastname"), rs.getString("expertise"), rs.getString("about"));
                authorsList.add(author);
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return authorsList;
    }
    // function to get Authors by id
    public static Authors getAuthorByID(int id){
        String getQuery = "select * from Author where id = " + id;
        ResultSet rs = function_java.getData(getQuery);
        Authors author = null;
        try {
            if(rs.next()){
                author = new Authors(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastname"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Authors.class.getName()).log(Level.SEVERE, null, ex);
        }
        return author;
    }
}
