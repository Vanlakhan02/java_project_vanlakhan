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
import java.util.HashMap;
/**
 *
 * @author HP
 */
public class Genres {
    
    private int id;
    private String name;


    
    public Genres(){};
    
    public Genres(int _id, String _name){
        this.id = _id;
        this.name = _name;
    }
    
        public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void addGenres(String name){
        String insertQUERY = "insert into book_genres(name) values (?)";
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(insertQUERY);
            
            ps.setString(1, name);
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "genre Added", "added Genre", 1);
            }else{
                JOptionPane.showMessageDialog(null, "fail to Add", "fail", 0);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editGenres(int id, String name){
        
        String editQUERY = "UPDATE book_genres SET name = ? WHERE id = ?";
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(editQUERY);
            
            ps.setString(1, name);
            ps.setInt(2, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "genre have been edited", "added Genre", 1);
            }else{
                JOptionPane.showMessageDialog(null, "fail to edit", "fail", 0);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void DeleteGenres(int id){
        
        String removeQUERY = "DELETE FROM book_genres WHERE id = ?";
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(removeQUERY);
            
            ps.setInt(1, id);
            
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "genre have been edited", "added Genre", 1);
            }else{
                JOptionPane.showMessageDialog(null, "fail to edit", "fail", 0);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Genres.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // function to populate an arraylist with genres 
    public static ArrayList<Genres> genreList(){
        ArrayList<Genres> genresList = new ArrayList<>();
       
        String selectQuery = "select * from book_genres";

        function_java funce = new function_java();
        
        try {

            ResultSet rs = funce.getData(selectQuery);
            
           
            while(rs.next()){
                
               Genres genre = new Genres(rs.getInt("id"), rs.getString("name"));
                genresList.add(genre);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Genres.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return genresList;
    }
    
    // create function to return a hashmap 
    // String is a the key
    // integer is the value
    public HashMap<String, Integer> getGenreMap()
    {
        HashMap<String, Integer> map = new HashMap<>();
        
        function_java func = new function_java();
        
        Genres genr;
        try{
            ResultSet rs = func.getData("select * from book_genres");
            
            while(rs.next()){
                genr = new Genres(rs.getInt("id"), rs.getString("name"));
                map.put(genr.getName(), genr.getId());
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return map;
    }
}
