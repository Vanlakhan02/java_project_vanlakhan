/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centre_libraly;


import Java_class.Member;
import Java_class.function_java;
import java.awt.Color;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author HP
 */
public class EditMemberForm extends javax.swing.JFrame {

    function_java func = new function_java();
    /**
     * Creates new form MannaegBooks
     */
    Java_class.Authors AuthorInstance = new Java_class.Authors();
    
    public EditMemberForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
         
        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0,153,153));
        MainPanel.setBorder(panelHeaderBorder);
        
        func.displayImage(50, 40, "image/team.png", Title_Member);

        
        //table to show data
      
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
        Title_Member = new javax.swing.JLabel();
        jLabel1_exit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2_Lname = new javax.swing.JTextField();
        jButton1_add = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField2_Fname = new javax.swing.JTextField();
        jTextField2_major = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2_phone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        genderbox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        image_icons = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        id_search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title_Member.setBackground(new java.awt.Color(0, 153, 153));
        Title_Member.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title_Member.setForeground(new java.awt.Color(255, 255, 255));
        Title_Member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Member.setText("Edit Member");
        Title_Member.setOpaque(true);

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

        jLabel2.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel2.setText("Name:");
        jLabel2.setToolTipText("");

        jButton1_add.setText("Add");
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel3.setText("Lastname:");
        jLabel3.setToolTipText("");

        jTextField2_major.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_majorActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel5.setText("Major:");
        jLabel5.setToolTipText("");

        jTextField2_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2_phoneActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel6.setText("Phone:");
        jLabel6.setToolTipText("");

        genderbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderboxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel7.setText("Gender");
        jLabel7.setToolTipText("");

        image_icons.setBackground(new java.awt.Color(204, 204, 204));
        image_icons.setOpaque(true);
        image_icons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                image_iconsMouseClicked(evt);
            }
        });

        jLabel8.setText("click above to select profile");

        jLabel4.setFont(new java.awt.Font("Defago Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Enter ID:");
        jLabel4.setToolTipText("");

        jButton1.setText("SEARCH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addComponent(Title_Member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(200, 200, 200)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(image_icons, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(5, 5, 5))
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(MainPanelLayout.createSequentialGroup()
                                    .addComponent(id_search, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jTextField2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2_major, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField2_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_search, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2_Fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2_major, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(image_icons, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 592));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jLabel1_exitMouseClicked

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed
      
        int id = Integer.parseInt(id_search.getText());
        String Fname = jTextField2_Fname.getText();
        String Lname = jTextField2_Lname.getText();
        String gender = genderbox.getSelectedItem().toString();
        String major = jTextField2_major.getText();
        int phonenum = Integer.parseInt(jTextField2_phone.getText());
        String picture = image_icons.getText();
        
    }//GEN-LAST:event_jButton1_addActionPerformed

    private void jTextField2_majorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_majorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_majorActionPerformed

    private void jTextField2_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2_phoneActionPerformed

    private void image_iconsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_image_iconsMouseClicked
        // TODO add your handling code here:
        JFileChooser filechoose = new JFileChooser();
        filechoose.setDialogTitle("select profile picture");
        
        //when user select to choose the profiel this code will link to folder of image
        filechoose.setCurrentDirectory(new File("c:\\Java_class\\image"));
        
        FileNameExtensionFilter extentionFilter = new FileNameExtensionFilter("image",".png",".jpg",".jpeg");
        filechoose.addChoosableFileFilter(extentionFilter);
        
        int fileState = filechoose.showSaveDialog(null);
        
        if(fileState == JFileChooser.APPROVE_OPTION){
            String path = filechoose.getSelectedFile().getAbsolutePath();
            image_icons.setText(path);
        }
    }//GEN-LAST:event_image_iconsMouseClicked

    private void genderboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Integer id= Integer.parseInt(id_search.getText());
        Member SelectMember = Member.getMemberById(id);
        
        if(SelectMember != null){
            jTextField2_Fname.setText(SelectMember.getFname());
            jTextField2_Lname.setText(SelectMember.getLname());
            genderbox.setSelectedItem(SelectMember.getGender());
            jTextField2_major.setText(SelectMember.getMajor());
            jTextField2_phone.setText(String.valueOf(SelectMember.getPhone()));
        }else{
            JOptionPane.showMessageDialog(null, "no members with this id is found", "invalid id", 0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Title_Member;
    private javax.swing.JComboBox<String> genderbox;
    private javax.swing.JTextField id_search;
    private javax.swing.JLabel image_icons;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_add;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField2_Fname;
    private javax.swing.JTextField jTextField2_Lname;
    private javax.swing.JTextField jTextField2_major;
    private javax.swing.JTextField jTextField2_phone;
    // End of variables declaration//GEN-END:variables
}
