/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centre_libraly;


import Java_class.Member;
import Java_class.function_java;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author HP
 */
public class ListForm extends javax.swing.JFrame {

    function_java func = new function_java();
    /**
     * Creates new form MannaegBooks
     */
    int member_id;
    Java_class.Authors AuthorInstance = new Java_class.Authors();
    
    public ListForm() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
         
        
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(0,153,153));
        MainPanel.setBorder(panelHeaderBorder);
        function_java.customTableHeader(Jtable_memlist, new Color(42, 187, 155), 14);

        func.displayImage(50, 50, "image/team.png", Title_Member);
        // label image create border
        Border label_Border = BorderFactory.createMatteBorder(3, 3, 3, 3, new Color(42, 187, 155));
        jLabel_image.setBorder(label_Border);
        
        //add a default image to jlabel image
        
        
        //table to show data
          Jtable_Member(null);
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
        jButton1_add = new javax.swing.JButton();
        Value_search = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Jtable_memlist = new javax.swing.JTable();
        jLabel_image = new javax.swing.JLabel();
        jLabel_Fname = new javax.swing.JLabel();
        jLabel_major = new javax.swing.JLabel();
        jLabel_gender = new javax.swing.JLabel();
        jLabel_phone = new javax.swing.JLabel();
        label_id = new javax.swing.JLabel();
        jButton1_add1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        MainPanel.setBackground(new java.awt.Color(255, 255, 255));

        Title_Member.setBackground(new java.awt.Color(0, 153, 153));
        Title_Member.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Title_Member.setForeground(new java.awt.Color(255, 255, 255));
        Title_Member.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_Member.setText("Member list");
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
        jLabel2.setText("Enter name :");
        jLabel2.setToolTipText("");

        jButton1_add.setText("search");
        jButton1_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_addActionPerformed(evt);
            }
        });

        Jtable_memlist.setModel(new javax.swing.table.DefaultTableModel(
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
        Jtable_memlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Jtable_memlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Jtable_memlist);

        jLabel_Fname.setText("fullName");

        jLabel_major.setText("major");

        jLabel_gender.setText("gender");

        jLabel_phone.setText("phone");

        label_id.setText("ID");

        jButton1_add1.setText("Remove");
        jButton1_add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(38, 38, 38)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Value_search, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel_phone)
                                        .addGap(12, 74, Short.MAX_VALUE))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_major)
                                            .addComponent(jLabel_gender)
                                            .addComponent(jLabel_Fname)
                                            .addComponent(label_id))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(Title_Member, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(252, 252, 252)
                .addComponent(jButton1_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Title_Member, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Value_search, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton1_add))
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel1))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel_image, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)
                                .addComponent(label_id)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_Fname)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_gender)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_major)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_phone)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1_add1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jLabel1_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1_exitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_jLabel1_exitMouseClicked

    private void jButton1_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_addActionPerformed
        String value_search = Value_search.getText();
        String query = "select * from Member where firstname = '"+value_search+"'";
        Jtable_Member(query);
    }//GEN-LAST:event_jButton1_addActionPerformed

    private void Jtable_memlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Jtable_memlistMouseClicked
        //display selected member in table
        
        Member SelectedMember;
        try{
            Integer RowIndex = Jtable_memlist.getSelectedRow();
            member_id = Integer.parseInt(Jtable_memlist.getModel().getValueAt(RowIndex,0).toString());
            SelectedMember = Member.getMemberById(member_id);
            if(SelectedMember != null){
                String Fname = SelectedMember.getFname();
                String Lname = SelectedMember.getLname();
                
                String fullname = Fname + " " + Lname;
                
                label_id.setText(String.valueOf(SelectedMember.getId()));
                jLabel_Fname.setText(fullname);
                jLabel_gender.setText(SelectedMember.getGender());
                jLabel_major.setText(SelectedMember.getMajor());
                jLabel_phone.setText(String.valueOf(SelectedMember.getPhone()));
            }else{
                JOptionPane.showMessageDialog(null, "name with this id wasn't found");
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }//GEN-LAST:event_Jtable_memlistMouseClicked

    private void jButton1_add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_add1ActionPerformed
        // TODO add your handling code here:
            try
        {
            
            Member deleteMem = new Member();
            int confirm = JOptionPane.showConfirmDialog(null, "are you sure, do you wanna delete this","confirmation", 0);
            if(confirm == JOptionPane.YES_OPTION){
                deleteMem.removeMember(member_id);
                Jtable_Member(null);
            }else{
                System.out.println("cancel");
            }
            
        }catch(Exception e){
            
        }  
    }//GEN-LAST:event_jButton1_add1ActionPerformed

     public void Jtable_Member(String query){
     ArrayList<Member> member = Member.MemberList(query);
     
     String[] colName = {"ID","FIRSTNAME","LASTNAME","GENDER","MAJOR", "PHONE" };
     
     Object[][] rows = new Object[member.size()][colName.length];
     for(int i =0;i<member.size(); i++){
         rows[i][0] = member.get(i).getId();
         rows[i][1] = member.get(i).getFname();
         rows[i][2] = member.get(i).getLname();
         rows[i][3] = member.get(i).getGender();
         rows[i][4] = member.get(i).getMajor();
         rows[i][5] = member.get(i).getPhone();
     }
     DefaultTableModel model = new DefaultTableModel(rows, colName);
     Jtable_memlist.setModel(model);
     
 }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Jtable_memlist;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel Title_Member;
    private javax.swing.JTextField Value_search;
    private javax.swing.JButton jButton1_add;
    private javax.swing.JButton jButton1_add1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1_exit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Fname;
    private javax.swing.JLabel jLabel_gender;
    private javax.swing.JLabel jLabel_image;
    private javax.swing.JLabel jLabel_major;
    private javax.swing.JLabel jLabel_phone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_id;
    // End of variables declaration//GEN-END:variables
}