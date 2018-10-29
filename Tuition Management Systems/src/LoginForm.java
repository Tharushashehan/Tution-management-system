
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import com.jtattoo.plaf.noire.NoireLookAndFeel;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import com.sun.speech.freetts.*;
import java.io.*;


public class LoginForm extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    
    
   
    public LoginForm() {
        initComponents();
        conn=javaconnect.ConnecrDb();
         new Thread(new Runnable() {

            public void run() {
                while (true) {
                    m();

                }
            }
        }).start();
    }
        String s = " ";

    void m() {
        String txt = "Siyathra Institue of Education";
        String[] arr1 = txt.split("");
        for (int i = 0; i < arr1.length; i++) {

            s = s.concat(arr1[i]);

            this.setTitle(s);

            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }


        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println(e);
        }
        s = " ";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcombo_usertype = new javax.swing.JComboBox<>();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_login = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "Login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 153, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("User Type");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("User Name");

        jcombo_usertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select UserType", "Admin", "Employee" }));
        jcombo_usertype.setPreferredSize(new java.awt.Dimension(6, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_username)
                    .addComponent(jcombo_usertype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jcombo_usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 102));
        jLabel4.setText("Welcome !");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 102));
        jLabel5.setText("Enter UserName & Password");

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel4.setPreferredSize(new java.awt.Dimension(198, 2));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/New Siyathra Logo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 153));
        jLabel7.setText("Siyathra");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 153));
        jLabel8.setText("Institute of Education");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("No 156,Badulla Road,Hali ella");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 153));
        jLabel10.setText("T.P 072-6658198, 077-5808555");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(49, 49, 49))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/login 50x50.png"))); // NOI18N
        btn_login.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_loginMouseMoved(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Exit.png"))); // NOI18N
        btn_exit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_exitMouseMoved(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_exit, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_login))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 781, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private static final String VOICENAME="kevin 16k";
    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
      
        submit();
   
     
     
     
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
      
        System.exit(0);
        
        
        
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_loginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseMoved
        // TODO add your handling code here:
        
        Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
        btn_login.setCursor(cur1);
        
        
        
    }//GEN-LAST:event_btn_loginMouseMoved

    private void btn_exitMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseMoved
        // TODO add your handling code here:
        
          Cursor cur1=new Cursor(Cursor.HAND_CURSOR);
        btn_exit.setCursor(cur1);
        
    }//GEN-LAST:event_btn_exitMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    
                    
                      UIManager.setLookAndFeel(new BernsteinLookAndFeel());
                    
                    
                    
                } catch (Exception e) {
                }
                
                
                
                
                new LoginForm().setVisible(true);
            }
        });
    }
    
     public void submit()
    {
        if(txt_username.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Username");
            return;
        }
        else if(txt_password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Enter Password");
            return;
        }
        else if(jcombo_usertype.getSelectedItem().equals("Select UserType")){
        
            JOptionPane.showMessageDialog(null, "Select UserType");
            return;
        
        
        }
        else{
            access();
        }
               
    }
public void access(){

    try {
        
        String sql="SELECT * FROM login WHERE username=? AND password=? AND usertype=?";
        pst=conn.prepareStatement(sql);
        pst.setString(1, txt_username.getText());
        pst.setString(2, txt_password.getText());
        pst.setString(3, jcombo_usertype.getSelectedItem().toString());
        rs=pst.executeQuery();
        
        
        if(rs.next()){
        JOptionPane.showMessageDialog(this, "username and password matched and you are logined as "+rs.getString("usertype"));
        if(jcombo_usertype.getSelectedIndex()==1){
        
                Admin ad=new Admin();
                ad.setVisible(true);
                this.setVisible(false);
        }
        else{
        
             EmployeeManagement emp=new EmployeeManagement();
            emp.setVisible(true);
            this.setVisible(false);
        }
      }
        else{
        
        JOptionPane.showMessageDialog(this, "username and password do not matched or Selected UserType Wrong");
        
        }
        
        
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    
     if(jcombo_usertype.getSelectedItem().equals("Admin") || jcombo_usertype.getSelectedItem().equals("Employee")){
         
             try {
                 
                    DateFormat y_m_d= new SimpleDateFormat("yyyy-MM-dd"); 
                    DateFormat h_m_s= new SimpleDateFormat("HH:mm:ss"); 
                    Date d=new Date();  
                    String sql="INSERT INTO login_details (uname,utype,logged_date,logged_time) VALUES('"+txt_username.getText()+"','"+jcombo_usertype.getSelectedItem().toString()+"','"+y_m_d.format(d)+"','"+h_m_s.format(d)+"')";
                    pst=conn.prepareStatement(sql);
                    pst.execute();
                   //JOptionPane.showMessageDialog(null, "Saved!!!");
               
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null, e);
             }
         
         
         }   
}
   





    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JComboBox<String> jcombo_usertype;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables


}
