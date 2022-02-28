/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_class;
import centre_libraly.DB_connect;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Member {
    private int id;
    private String Fname;
    private String Lname;
    private String gender;
    private String major;
    private int phone;
    private String pict;
   public Member(){};
    public Member(int id, String name,String Lname, String gender, String major, int phone, String picture){
    this.id = id;
    this.Fname = name;
    this.Lname = Lname;
    this.gender = gender;
    this.major = major;
    this.phone = phone;
    this.pict = picture;
}
    public void setPict(String pict) {
        this.pict = pict;
    }

    public String getPict() {
        return this.pict;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public void setLname(String Lname) {
        this.Lname = Lname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getGender() {
        return gender;
    }

    public String getMajor() {
        return major;
    }

    public int getPhone() {
        return phone;
    }
    
    public void addMemeber(String Fname, String Lname, String Gender,String major, int Phone,String picture){
        String insertQuery = "insert into Member(firstname,lastname,gender,major,phone, profile) values (?,?,?,?,?,?)";
        PreparedStatement ps;
        
        
        try {
            ps = DB_connect.getConnection().prepareStatement(insertQuery);
            ps.setString(1, Fname);
            ps.setString(2, Lname);
            ps.setString(3, Gender);
            ps.setString(4, major);
            ps.setInt(5, Phone);
            ps.setString(6, picture);
            if(ps.executeUpdate() != 0){
                JOptionPane.showMessageDialog(null, "member have beeln added","added success", 1);
                
            }else{
                JOptionPane.showMessageDialog(null, "the failer to add", "fail",0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void EditMember(int id, String Fname, String Lname, String Gender, String major, int phone, String picture){
        String editQuery = "update Member set firstname = ?, lastname = ?, gender =?, major = ?, phone = ?, profile = ? where id = ?";
        try{
           PreparedStatement ps = DB_connect.getConnection().prepareStatement(editQuery);
           ps.setString(1, Fname);
           ps.setString(2, Lname);
           ps.setString(3, Gender);
           ps.setString(4, major);
           ps.setInt(5, phone);
           ps.setString(6, picture);
           ps.setInt(7, id);
           if(ps.executeUpdate() != 0){
               JOptionPane.showMessageDialog(null, "edit member successful", "successful", 1);
           }else{
               JOptionPane.showMessageDialog(null, "edit member is fail", "failure", 0);
           }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public void removeMember(int id){
        String deleteQuery = "delete from Member where id =" + id;
        
        try {
            PreparedStatement ps = DB_connect.getConnection().prepareStatement(deleteQuery);
            if(ps.executeUpdate()!= 0){
                JOptionPane.showMessageDialog(null, "Member have been delete", "delete successfully", 1);
            }else{
                JOptionPane.showMessageDialog(null, "delete is fail", "failure", 0);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static Member getMemberById(int id){
        String getQuery = ("select * from Member where id = "+ id);

        ResultSet rs = function_java.getData(getQuery);
        
        try {
            if(rs.next()){
                return new Member(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastname"), rs.getString("gender"),rs.getString("major"), rs.getInt("phone"), rs.getString("profile"));
            }else{
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static ArrayList<Member> MemberList(String selectQuery){
        ArrayList<Member> membList = new ArrayList();
        
        function_java func = new function_java();
        try{
            if(selectQuery == null){
             selectQuery = "select * from Member";
            }
            ResultSet rs = func.getData(selectQuery);
            while(rs.next()){
              Member addMem = new  Member(rs.getInt("id"),rs.getString("firstname"),rs.getString("lastname"), rs.getString("gender"),rs.getString("major"), rs.getInt("phone"), rs.getString("profile"));
              membList.add(addMem);
            }
            
        }catch(Exception e){
            
        }
        return membList;
    }
    
}
