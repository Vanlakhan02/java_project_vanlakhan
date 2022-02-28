/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_class;

import centre_libraly.DB_connect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class BooksManage {
    private String id;
    private String B_name;
    private Integer B_Authors;
    private Integer B_Genre;
    private String publisher;
    private Integer Quantity;
    private double price;
    private String date_recieve;
    private String description;
    private byte[] cover_image;

   public BooksManage(){};
    public BooksManage(
            String _id, 
            String _name, 
            int _author, 
            int _Genre, 
            String _publisher, 
            int _Quantity, 
            double _price, 
            String _date_reciever,
            String _description
            ){
        this.id = _id;
        this.B_name = _name;
        this.B_Authors = _author;
        this.B_Genre = _Genre;
        this.Quantity = _Quantity;
        this.publisher = _publisher;
        this.price = _price;
        this.date_recieve = _date_reciever;
        this.description = _description;

    }
   public BooksManage(
            String _id, 
            String _name, 
            int _author, 
            int _Genre, 
            String _publisher, 
            int _Quantity, 
            double _price, 
            String _date_reciever,
            String _description,
            byte[] _cover
            ){
        this.id = _id;
        this.B_name = _name;
        this.B_Authors = _author;
        this.B_Genre = _Genre;
        this.Quantity = _Quantity;
        this.publisher = _publisher;
        this.price = _price;
        this.date_recieve = _date_reciever;
        this.description = _description;
        this.cover_image = _cover;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public void setB_name(String B_name) {
        this.B_name = B_name;
    }

    public void setB_Authors(Integer B_Authors) {
        this.B_Authors = B_Authors;
    }

    public void setB_Genre(Integer B_Genre) {
        this.B_Genre = B_Genre;
    }

    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate_recieve(String date_recieve) {
        this.date_recieve = date_recieve;
    }

    public void setDecription(String decription) {
        this.description = decription;
    }

    public void setCover_image(byte[] cover_image) {
        this.cover_image = cover_image;
    }
    
    public String getId() {
        return id;
    }

    public String getB_name() {
        return B_name;
    }

    public Integer getB_Authors() {
        return B_Authors;
    }

    public Integer getB_Genre() {
        return B_Genre;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public String getDate_recieve() {
        return date_recieve;
    }

    public String getDescription() {
        return description;
    }

    public byte[] getCover_image() {
        return cover_image;
    }
    
    // insert data to database by connect with mysql database
    public void addBook(String b_id, String _name, int _author, int genre, String publisher, int quantity, double _price, String _date, String description, byte[] _cover)
    {
        String insertQuery = "insert into Books(id, book_name, Authors,genre, publisher,quantity, price, date_recieve, description, book_cover) values (?, ? ,?, ?,?, ?,?,?,?,?)";
        PreparedStatement ps;
        try {
             ps = DB_connect.getConnection().prepareStatement(insertQuery);
             ps.setString(1, b_id);
             ps.setString(2, _name);
             ps.setInt(3, _author);
             ps.setInt(4, genre);
             
             ps.setString(5, publisher);
             ps.setInt(6, quantity);
             ps.setDouble(7, _price );
             ps.setString(8,  _date);
             ps.setString(9, description);
             ps.setBytes(10, _cover);
             
            
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "books have been added", "sucessful", 1);
            }else{
                    JOptionPane.showMessageDialog(null, "Added isi failure", "failure", 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void DeleteData(String id){
        String deleteQuery = "delete from Books where id = ?";

         PreparedStatement ps;
         try{
             ps = DB_connect.getConnection().prepareStatement(deleteQuery);
             ps.setString(1, id);
             if(ps.executeUpdate() != 0){
                 JOptionPane.showMessageDialog(null, "Data have been deleted", "successful", 1);
             }else{
                 JOptionPane.showMessageDialog(null, "deletion is fail", "fail", 0);
             }
         }catch(SQLException e){
             System.out.println(e.getMessage());
         }
    }
    public static boolean isBook_ID_EXIST(String b_id){
        String Query = "select * from Books where id = '" + b_id+"'";
        function_java func = new function_java();
        ResultSet rs =  func.getData(Query);
        try {
            if(rs.next())
            {
                return true;
            }else{
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null, ex);
        }
         return false;
        }
    
    public static BooksManage searchByID(String _id)
    {
         String query;
            query = "select * from Books where id = '"+ _id + "'";
        ResultSet rs = function_java.getData(query);  
        BooksManage book;
        try{
            if(rs.next())
            {
               System.out.println(rs.getString("id"));
                book  = new BooksManage(rs.getString("id"), rs.getString("book_name"),rs.getInt("Authors"),rs.getInt("genre"),rs.getString("publisher"),rs.getInt("quantity"),rs.getDouble("price"),rs.getString("date_recieve"),rs.getString("description"),rs.getBytes("book_cover"));
            }else{
               return null;
            }
         
        }catch(SQLException e)
        {
          Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null , e);
          return null;
        }
        return book;
    }
    
    public static ArrayList<BooksManage> BookList(){
        ArrayList<BooksManage> booklist = new ArrayList<>();
        String selectQuery = "select * from Books";
        
        try{
            ResultSet rs = function_java.getData(selectQuery);
            while(rs.next()){
                BooksManage book = new BooksManage(rs.getString("id"), rs.getString("book_name"), rs.getInt("Authors"), rs.getInt("genre"), rs.getString("publisher"), rs.getInt("quantity"), rs.getDouble("price"), rs.getString("date_recieve"), rs.getString("description"));
                booklist.add(book);
    
            }
        }catch(SQLException e){
            Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null , e);
        }
        return booklist;
    }
    //function to display the lated book in the desboard
    public static void displayBookCover(JLabel[] label ){
        ResultSet rs;
        Statement st;
        function_java func = new function_java();
        try{
            st = DB_connect.getConnection().createStatement();
            rs = st.executeQuery("select book_cover from Books limit 5");
            byte[] image;
            int i = 0;
            while(rs.next())
            {
                image = rs.getBytes("book_cover");
                func.displayImageByte(label[i].getWidth(),label[i].getHeight(), image,label[i] );
                i++;
            }
        }catch(SQLException e){
            Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null , e);
        }
    }
    public static void UpdateBook(String id,String name, int Authors, int genre, String publisher, int quantity, double price, String date_reciever, String description,byte[] book_cover){
        String updateQuery = "update Books set book_name =?,Authors = ?,genre = ?, publisher =?, quantity = ?, price = ?, date_recieve = ?,description =?, book_cover = ? where id = ?";
        
        try{
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(updateQuery);
            ps.setString(1, name);
            ps.setInt(2, Authors);
            ps.setInt(3, genre);
            ps.setString(4, publisher);
            ps.setInt(5, quantity);
            ps.setDouble(6, price);
            ps.setString(7, date_reciever);
            ps.setString(8, description);
            ps.setBytes(9, book_cover);
            ps.setString(10, id);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "Edition successful", "successful", 1);
            }else{
                JOptionPane.showMessageDialog(null, "Edition is fail", "fail", 0);
            }
        }catch(SQLException e){
        Logger.getLogger(BooksManage.class.getName()).log(Level.SEVERE, null , e);
        }
    }
    
    // show data into edit table
}
