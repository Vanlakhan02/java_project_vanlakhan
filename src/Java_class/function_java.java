
package Java_class;

import centre_libraly.DB_connect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class function_java {
    public void displayImage(int width, int height, String ImagePath, JLabel dasboard_logo){
        ImageIcon imageIcon = new ImageIcon(getClass().getResource(ImagePath));
        Image image = imageIcon.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH);
        
        dasboard_logo.setIcon(new ImageIcon(image));
    }
    public void displayImageChoose(int width, int height, String ImagePath, JLabel dasboard_logo){
        ImageIcon imageIcon = new ImageIcon(ImagePath);
        Image image = imageIcon.getImage().getScaledInstance(dasboard_logo.getWidth(),dasboard_logo.getHeight(), Image.SCALE_SMOOTH);
        
        dasboard_logo.setIcon(new ImageIcon(image));
    }
    public void displayImageByte(int width, int height, byte[] ImagePath, JLabel dasboard_logo){
        ImageIcon imageIcon = new ImageIcon(ImagePath);
        Image image = imageIcon.getImage().getScaledInstance(dasboard_logo.getWidth(),dasboard_logo.getHeight(), Image.SCALE_SMOOTH);
        
        dasboard_logo.setIcon(new ImageIcon(image));
    }
    
    public static ResultSet getData(String query){
        PreparedStatement ps;
        ResultSet rs = null;
        try{
            ps = DB_connect.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        return rs;
    }
    
    
    // customize table to show data 
    public static void customTable(JTable table){
        table.setSelectionBackground(Color.lightGray);
        table.setSelectionForeground(Color.white);
        table.setRowHeight(30);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(new Color(42, 187, 155));
        
    }
    
    // custom jtable header
    public static void customTableHeader(JTable table, Color color, Integer fontSize){
        table.getTableHeader().setBackground(color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("defago notosan", Font.BOLD,fontSize));
        table.getTableHeader().setOpaque(false);
    }
    
    // functin to selected the image 
  public static String selectImage(){
      JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("select Profile picture");
        filechooser.setCurrentDirectory(new File("c:\\ function_java"));
        FileNameExtensionFilter extentionFilter = new FileNameExtensionFilter("image", ".png", ".jpg",".jpeg");
        filechooser.addChoosableFileFilter(extentionFilter);
        
        int fileState = filechooser.showSaveDialog(null);
        String path = "";
        if(fileState == JFileChooser.APPROVE_OPTION){
            path = filechooser.getSelectedFile().getAbsolutePath();
            
        }
        return path;
  }
  
  
  // function to count the number of book in theh libraly
  
  public static int countData(String tableName)
  {
      int total;
      ResultSet rs;
      Statement st;
      
        try {
            st = DB_connect.getConnection().createStatement();
            rs = st.executeQuery("select count(*) as total from "+tableName);
            if(rs.next()){
                total = rs.getInt("total");
            }else{
                return 0;
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(function_java.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return total;
  }
}
