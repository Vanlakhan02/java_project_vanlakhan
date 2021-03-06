/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centre_libraly;


import Java_class.Authors;
import Java_class.Genres;
import Java_class.function_java;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class Mannage_Authors extends javax.swing.JFrame {

    function_java func = new function_java();
    /**
     * Creates new form MannaegBooks
     */
    Java_class.Authors AuthorInstance = new Java_class.Authors();
    
    public Mannage_Authors() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
         
        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3,3, new Color(0,153,153));
        MainPanel.setBorder(panelHeaderBorder);
        
        function_java.customTable(jTable1_Authors);
        
        function_java.customTableHeader(jTable1_Authors, new Color(42, 187, 155), 14);
        func.displayImage(50, 50, "image/writer.png", Title_Authors);
        jLabel3_enterName.setVisible(false);
        
        //table to show data
        Jtable_genres();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        Title_Authors = new javax.swing.JLabel();
        jLabel1_exit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2_Lname = new javax.swing.JTextField();
        jButton1_add = new javax.swing.JButton();
        jButton2_edit = new javax.swing.JButton();
        jButton3_delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_Authors = new javax.swing.JTable();
        jLabel3_enterName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2_Fname = new javax.swing.JTextField();
        jTextField2_Expertise = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3_enterName1 = new javax.swing.JLabel();
        jLabel3_enterName2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title_Authors.setBackground(new java.awt.Color(0, 153, 153));
        Title_Authors.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title_Authors.setForeground(new java.awt.Color(255, 255, 255));
        Title_Authors.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Authors.setText("Manage Authors");
        Title_Authors.setOpaque(true);

        jLabel1_exit.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1_exit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1_exit.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_exit.setText("x");
        jLabel1_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1_exit.setOpaque(true);
        jLabel1_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1_exitMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel1.setText("ID:");
        jLabel1.setToolTipText("");

        jTextField1_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1_idActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Name:");
        jLabel2.setToolTipText("");

        jButton1_add.setText("Add");
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });

        jButton2_edit.setText("Edit");
        jButton2_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_editActionPerformed(evt);
            }
        });

        jButton3_delete.setText("Delete");
        jButton3_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3_deleteActionPerformed(evt);
            }
        });

        jTable1_Authors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1_Authors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_AuthorsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_Authors);

        jLabel3_enterName.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_enterName.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3_enterName.setText("please! enter your name");
        jLabel3_enterName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_enterNameMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("lastname:");
        jLabel3.setToolTipText("");

        jTextField2_Expertise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_ExpertiseActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("About:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Expertise:");
        jLabel5.setToolTipText("");

        jLabel3_enterName1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_enterName1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3_enterName1.setText("please! enter your name");
        jLabel3_enterName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_enterName1MouseClicked(evt);
            }
        });

        jLabel3_enterName2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3_enterName2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel3_enterName2.setText("please! enter your name");
        jLabel3_enterName2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3_enterName2MouseClicked(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addComponent(Title_Authors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField2_Fname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jTextField2_Lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3_enterName, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3_enterName1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3_enterName2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField2_Expertise))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title_Authors, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3_enterName2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3_enterName1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2_Expertise, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jLabel3_enterName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3_delete)
                            .addComponent(jButton2_edit)
                            .addComponent(jButton1_add)))
                    .addComponent(jScrollPane1))
                .addGap(22, 22, 22))
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jLabel1_exitMouseClicked

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed
        
        DasboardForm dash  = new DasboardForm();
        dash.displayCount();
        
        int id = Integer.parseInt(jTextField1_id.getText());
        String Fname = jTextField2_Fname.getText();
        String Lname = jTextField2_Lname.getText();
        String expertise = jTextField2_Expertise.getText();
        String about = jTextArea1.getText();
        
        if(Fname.isEmpty() && Lname.isEmpty()){
            jLabel3_enterName.setVisible(true);
        }else{
            try{
                AuthorInstance.addAuthors(id, Fname, Lname, expertise, about);
                
                
                Jtable_genres();
                
            }catch(NumberFormatException ex){
                 JOptionPane.showMessageDialog(null,"invalid genres id", "error", 0);
            }
            
        }
    }//GEN-LAST:event_jButton1_addActionPerformed

    private void jButton2_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_editActionPerformed
        // TODO add your handling code here:
        int Id = Integer.valueOf(jTextField1_id.getText());
        String Fname = jTextField2_Fname.getText();
        String Lname = jTextField2_Lname.getText();
        String expertise = jTextField2_Expertise.getText();
        String about = jTextArea1.getText();
        
        if(Fname.isEmpty() && Lname.isEmpty()){
            jLabel3_enterName.setVisible(true);
            
        }else{
            AuthorInstance.editAuthors(Id, Fname, Lname, expertise, about);
            
            Jtable_genres();
        }
    }//GEN-LAST:event_jButton2_editActionPerformed

    private void jButton3_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3_deleteActionPerformed
        // TODO add your handling code here:
        
        try{
            int id = Integer.parseInt(jTextField1_id.getText());
            AuthorInstance.deleteAuthors(id);
            Jtable_genres();
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "invalid genres "+ ex.getMessage(), "error", 0);
        }
    }//GEN-LAST:event_jButton3_deleteActionPerformed

    private void jTable1_AuthorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_AuthorsMouseClicked
        // TODO add your handling code here:
        int index = jTable1_Authors.getSelectedRow();
        
        String id = jTable1_Authors.getValueAt(index, 0).toString();
        String name = jTable1_Authors.getValueAt(index, 1).toString();
        String Lname = jTable1_Authors.getValueAt(index, 2).toString();
        String Expertise = jTable1_Authors.getValueAt(index, 3).toString();
        String about = jTable1_Authors.getValueAt(index, 4).toString();
        
        jTextField1_id.setText(id);
        jTextField2_Fname.setText(name);
        jTextField2_Lname.setText(Lname);
        jTextField2_Expertise.setText(Expertise);
        jTextArea1.setText(about);
        this.validate();
    }//GEN-LAST:event_jTable1_AuthorsMouseClicked

    private void jLabel3_enterNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_enterNameMouseClicked
        // TODO add your handling code here:
        
        jLabel3_enterName.setVisible(false);
    }//GEN-LAST:event_jLabel3_enterNameMouseClicked

    private void jTextField1_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1_idActionPerformed

    private void jTextField2_ExpertiseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_ExpertiseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_ExpertiseActionPerformed

    private void jLabel3_enterName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_enterName1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3_enterName1MouseClicked

    private void jLabel3_enterName2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3_enterName2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3_enterName2MouseClicked

    
    
    public void Jtable_genres(){
        ArrayList<Authors> datalist = Authors.AuthorList();
        
        String[] colNames = {"ID", "Name", "Lastname", "Expertise", "about"};
        
        Object[][] Rows = new Object[datalist.size()][colNames.length];
        
        for(int i = 0; i<datalist.size(); i++)
        {
            Rows[i][0] = datalist.get(i).getId();
            Rows[i][1] = datalist.get(i).getName();
            Rows[i][2] = datalist.get(i).getLastName();
            Rows[i][3] = datalist.get(i).getFieldOFexpertise();
            Rows[i][4] = datalist.get(i).getAbout();
        }
        
        DefaultTableModel model = new DefaultTableModel(Rows, colNames);
        jTable1_Authors.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Title_Authors;
    private javax.swing.JButton jButton1_add;
    private javax.swing.JButton jButton2_edit;
    private javax.swing.JButton jButton3_delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel3_enterName;
    private javax.swing.JLabel jLabel3_enterName1;
    private javax.swing.JLabel jLabel3_enterName2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1_Authors;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1_id;
    private javax.swing.JTextField jTextField2_Expertise;
    private javax.swing.JTextField jTextField2_Fname;
    private javax.swing.JTextField jTextField2_Lname;
    // End of variables declaration//GEN-END:variables
}
