
import java.awt.Container;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.proteanit.sql.DbUtils;

public class classes extends javax.swing.JInternalFrame {

      Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
      
    
    
    
    public classes() {
        initComponents();
        conn=javaconnect.ConnecrDb();
           date1.hide();
            date2.hide();
            jcombo_date2.hide();
            jcombo_date.hide();
            txt_timechooser.hide();
            txt_timechooser2.hide();
            time2.hide();
            time1.hide();
            update_table();
            update_table2();
    }
    
    private void update_table(){
    
        try {
            
            String sql="SELECT c.cid as 'Class ID',c.name as 'Name of Sir',c.subject as 'Subject',c.grade as 'Grade',c.moblie_numer as 'Mobile Number',c.image as 'Image',t.date1 as 'Date1',t.time1 as 'Time1',t.date2 as 'Date2',t.time2 as 'Time2' FROM classess c,class_time t WHERE c.cid=t.ctime ";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             all_class_details.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
      private void update_table2(){
    
        try {
            
            String sql="SELECT c.name as 'Name of Sir',c.subject as 'Subject',c.grade as 'Grade',c.moblie_numer as 'Mobile Number',c.image as 'Image',t.date1 as 'Date1',t.time1 as 'Time1',t.date2 as 'Date2',t.time2 as 'Time2' FROM classess c,class_time t WHERE c.cid=t.ctime ";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             class_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clean(){
    
           txt_sirname.setText("");
           txt_subject.setText("");
           jcombo_grade.setSelectedIndex(0);
           txt_telphone.setText("");
           jcombo_date.setSelectedIndex(0);
           txt_timechooser.setText("Select Time");
           txt_path.setText("");
           jcombo_date2.setSelectedIndex(0);
           txt_timechooser2.setText("");
            date1.hide();
            date2.hide();
            jcombo_date2.hide();
            jcombo_date.hide();
            txt_timechooser.hide();
            txt_timechooser2.hide();
            time2.hide();
            time1.hide();
            jcombo_number_ofdays.setSelectedIndex(0);
          
    }
    
   
    public void comboselect(){
 
            int d=jcombo_number_ofdays.getSelectedIndex();
                if(d==1){
                
              date1.setVisible(true);
             time1.setVisible(true);
             jcombo_date.setVisible(true);
             txt_timechooser.setVisible(true);
             
               if(jcombo_date.getSelectedItem().equals("--Select--")|| (txt_timechooser.getText().equals("select time"))){
                
                     JOptionPane.showMessageDialog(null, "Select the Date and Time");
                
                }
              
                }
              
                if(d==2){
    
                 date1.setVisible(true);
                time1.setVisible(true);
                jcombo_date.setVisible(true);
                txt_timechooser.setVisible(true);
                date2.setVisible(true);
                time2.setVisible(true);
                jcombo_date2.setVisible(true);
                txt_timechooser2.setVisible(true);

                  if(jcombo_date2.getSelectedItem().equals("--Select--")|| (txt_timechooser2.getText().equals("select time"))){
                
                     JOptionPane.showMessageDialog(null, "Select the Dates and TIme");
                
                }
    
            }
     }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_sirname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_subject = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcombo_grade = new javax.swing.JComboBox<>();
        date1 = new javax.swing.JLabel();
        time1 = new javax.swing.JLabel();
        txt_path = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txt_timechooser = new com.github.lgooddatepicker.components.TimePicker();
        jPanel11 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        image = new javax.swing.JLabel();
        jcombo_date = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        txt_telphone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        date2 = new javax.swing.JLabel();
        txt_timechooser2 = new com.github.lgooddatepicker.components.TimePicker();
        jcombo_date2 = new javax.swing.JComboBox<>();
        time2 = new javax.swing.JLabel();
        jcombo_number_ofdays = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        class_table = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();
        btn_clean = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_searchname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_Subject = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jcmbo_search_grade = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_imagepath = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_search_mobile = new javax.swing.JTextField();
        txt_search_time2 = new com.github.lgooddatepicker.components.TimePicker();
        jPanel12 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        picture = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_search_time1 = new com.github.lgooddatepicker.components.TimePicker();
        txt_dateselect2 = new javax.swing.JTextField();
        txt_date1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_CID = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        all_class_details = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_search_subject = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1200, 530));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Classes Management", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 233, 106))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 522));

        jPanel2.setPreferredSize(new java.awt.Dimension(1145, 430));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "New Class Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 223, 8))); // NOI18N

        jLabel3.setText("Sir Name");
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_sirname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setText("Subject");
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setToolTipText("");

        txt_subject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setText("Grade");
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jcombo_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "  1", "  2", "  3", "  4", "  5", "  6", "  7", "  8", "  9", " 10", " 11", " 12", " 13" }));

        date1.setText("Date1");
        date1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        time1.setText("Time1");
        time1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton1.setText("Attach Image");
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txt_timechooser.setText("Select Time");
        txt_timechooser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        image.setText("jLabel8");

        jDesktopPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jcombo_date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "  Sunday", "  Monday", "  Tuesday", "  Wednesday", "  Thursday", "   Friday", "  Saturday" }));

        jLabel17.setText("Mobile Number");
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_telphone.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_telphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telphoneKeyTyped(evt);
            }
        });

        jLabel2.setText("Number of days  will teach");
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        date2.setText("Date2");

        txt_timechooser2.setText("Select Time");

        jcombo_date2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "  Sunday", "  Monday", "  Tuesday", "  Wednesday", "  Thursday", "   Friday", "  Saturday" }));
        jcombo_date2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        time2.setText("Time2");

        jcombo_number_ofdays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "1", "2" }));
        jcombo_number_ofdays.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jcombo_number_ofdays.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcombo_number_ofdaysPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcombo_grade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_subject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sirname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_telphone, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcombo_number_ofdays, 0, 190, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(date1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcombo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(time1)
                            .addComponent(date2)
                            .addComponent(time2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_timechooser, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txt_timechooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(jcombo_date2, 0, 190, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_path, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton1)))
                .addGap(10, 10, 10))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_path, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_sirname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jcombo_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_telphone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jcombo_number_ofdays, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcombo_date, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date1))))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timechooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time1))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date2)
                    .addComponent(jcombo_date2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_timechooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(time2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "All Claas Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 223, 8))); // NOI18N

        class_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sir Name", "Subject", "Grade", "Date", "Time", "Imagel"
            }
        ));
        class_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                class_tableMouseClicked(evt);
            }
        });
        class_table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                class_tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(class_table);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user-add-icon.png"))); // NOI18N
        btn_add.setText("Add");
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_add.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_addMouseMoved(evt);
            }
        });
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_clean.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/edit-clear.png"))); // NOI18N
        btn_clean.setText("Clean");
        btn_clean.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_clean.setPreferredSize(new java.awt.Dimension(93, 41));
        btn_clean.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_cleanMouseMoved(evt);
            }
        });
        btn_clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_add, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(20, 20, 20)
                .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_clean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("New Class", jPanel2);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "New Class Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 223, 8))); // NOI18N

        jLabel9.setText("Sir Name");
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_searchname.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setText("Subject");
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setToolTipText("");

        txt_Subject.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel11.setText("Grade");
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jcmbo_search_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" }));

        jLabel12.setText("Date1");
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setText("Time1");
        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jButton3.setText("Attach Image");
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setText("Mobile Number");
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_search_mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_search_mobileKeyTyped(evt);
            }
        });

        txt_search_time2.setText("Select Time");

        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        picture.setText("jLabel8");

        jDesktopPane2.setLayer(picture, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(picture, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setText("Date2");
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel7.setText("Time2");
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_search_time1.setText("Select Time");

        txt_date1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel14.setText("Cid");
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_CID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addGap(17, 17, 17)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(txt_dateselect2, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_search_time1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                        .addComponent(txt_date1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jcmbo_search_grade, 0, 190, Short.MAX_VALUE)
                                            .addComponent(txt_search_mobile, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(txt_Subject, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(txt_searchname, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                            .addComponent(txt_CID, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton3)))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txt_search_time2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txt_imagepath, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txt_CID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_searchname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Subject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jcmbo_search_grade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_search_mobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_date1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txt_search_time1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_dateselect2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_search_time2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "All Class Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 223, 8))); // NOI18N

        all_class_details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sir Name", "Subject", "Grade", "Date", "Time", "Imagel"
            }
        ));
        all_class_details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                all_class_detailsMouseClicked(evt);
            }
        });
        all_class_details.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                all_class_detailsKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(all_class_details);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        btn_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/system-software-update-icon.png"))); // NOI18N
        btn_update.setText("Update");
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_update.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_updateMouseMoved(evt);
            }
        });
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/delete-icon.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_delete.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_deleteMouseMoved(evt);
            }
        });
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/report-key-icon.png"))); // NOI18N
        jButton2.setText("Report");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/edit-clear.png"))); // NOI18N
        jButton4.setText("Clean");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_update)
                .addGap(30, 30, 30)
                .addComponent(btn_delete)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_update)
                    .addComponent(btn_delete)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update & Delete ", jPanel3);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)), "Search Classes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(230, 223, 8))); // NOI18N

        jLabel1.setText("Name");
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_name.setToolTipText("Search Using Sir 's Name");
        txt_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nameKeyReleased(evt);
            }
        });

        jLabel16.setText("Subject");
        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txt_search_subject.setToolTipText("Search Using Subject");
        txt_search_subject.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_search_subjectKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel16)
                .addGap(15, 15, 15)
                .addComponent(txt_search_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(txt_search_subject, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(568, 568, 568))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Search Class", jPanel13);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //filechooser
        
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        txt_path.setText(filename);
            
            try {
            
            File image=new File(filename);
            FileInputStream fis=new FileInputStream(image);
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            byte[] buf=new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
            
            bos.write(buf,0,readNum);
            
            }
             person_image=bos.toByteArray();
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


        
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
                //insert btn
        if(txt_sirname.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null,"Fill the Name of Sir");
        }
        else if(txt_subject.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Fill the Name of Subject");
        }
           else if(jcombo_grade.getSelectedItem().equals("--Select--")){
        
        JOptionPane.showMessageDialog(null,"Select the Grade");
        
        }
           else if(txt_telphone.getText().isEmpty()){
       
              
         JOptionPane.showMessageDialog(null,"Enter the Telephone Number");
    
          }
          else if(txt_telphone.getText().length()!=10){
          
              JOptionPane.showMessageDialog(null,"Invaild Telephone Number");
 
          }
         else if(jcombo_number_ofdays.getSelectedItem().equals("--Select--")){
          
         JOptionPane.showMessageDialog(null,"Select Number of days will teach");
         
         }
         else if(jcombo_date.getSelectedItem().equals("--Select--")){
         
          JOptionPane.showMessageDialog(null,"Select the Date of week");
         
         }
         
         else if(txt_timechooser.getText().isEmpty()){
         
              JOptionPane.showMessageDialog(null,"Select the time");
         
         }
           else if (jcombo_number_ofdays.getSelectedItem().equals("2")&&(jcombo_date2.getSelectedItem().equals("--Select--")||(txt_timechooser2.getText().equals("select time")))){
               
                  JOptionPane.showMessageDialog(null,"Select the Dates of the week");
               
           }
            else if(txt_path.getText().isEmpty()){

               JOptionPane.showMessageDialog(null,"Select the Image");
           }
            else{
                
                  try {
                  
                   String sql="INSERT INTO classess (name,subject,grade,moblie_numer,image)VALUES(?,?,?,?,?)";
                   pst=conn.prepareStatement(sql);
                   pst.setString(1, txt_sirname.getText());
                   pst.setString(2, txt_subject.getText());
                   pst.setString(3, jcombo_grade.getSelectedItem().toString());
                   pst.setString(4, txt_telphone.getText());
                   pst.setBytes(5, person_image);
                   pst.execute();
                  // JOptionPane.showMessageDialog(null, "ADDED!");
                   
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null, e);
               }
                   
           if(jcombo_number_ofdays.getSelectedIndex()==1){
         
             try {
                 String date1=jcombo_date.getSelectedItem().toString();
                 String time1=txt_timechooser.getTime().toString();
                 String sql="INSERT INTO class_time(date1,time1,date2,time2) VALUES('"+date1+"','"+time1+"','Not Selected','Not Selected')";
                 pst=conn.prepareStatement(sql);
                 pst.execute();
                 //JOptionPane.showMessageDialog(null, "Saved!!!!");
                 
             } catch (Exception e) {
                 JOptionPane.showMessageDialog(null,e);
             }
             
         }
        
           if(jcombo_number_ofdays.getSelectedIndex()==2){
               try {
                   
           String day1=jcombo_date.getSelectedItem().toString();
           String times1=txt_timechooser.getTime().toString();
           String day2=jcombo_date2.getSelectedItem().toString();
           String times2=txt_timechooser2.getTime().toString();
           String sql="INSERT INTO class_time(date1,time1,date2,time2) VALUES('"+day1+"','"+times1+"','"+day2+"','"+times2+"')";
           pst=conn.prepareStatement(sql);
           pst.execute();
           JOptionPane.showMessageDialog(null, "Data Saved");
           clean();        
                   
               } catch (Exception e) {
                   JOptionPane.showMessageDialog(null,e);
               }
       
           }
       
           
            }
         update_table();  
        update_table2();
    }//GEN-LAST:event_btn_addActionPerformed

    private void class_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_class_tableMouseClicked
        
        
    }//GEN-LAST:event_class_tableMouseClicked

    private void txt_telphoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telphoneKeyTyped
        // This method content the only enter the numbers
        
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE)){
        
        getToolkit().beep();
        evt.consume();
       
        }
       
    }//GEN-LAST:event_txt_telphoneKeyTyped

    private void btn_cleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cleanActionPerformed
        
        
             txt_sirname.setText("");
           txt_subject.setText("");
           jcombo_grade.setSelectedIndex(0);
           txt_telphone.setText("");
           jcombo_date.setSelectedIndex(0);
           txt_timechooser.setText("Select Time");
           txt_path.setText("");
           txt_timechooser2.setText("Select Time");
           txt_timechooser2.hide();
           jcombo_date.hide();
           date1.hide();
           time1.hide();
           txt_timechooser.hide();
           jcombo_date2.setSelectedIndex(0);
           jcombo_date2.hide();
           date2.hide();
           time2.hide();
           jcombo_number_ofdays.setSelectedIndex(0);
           
    }//GEN-LAST:event_btn_cleanActionPerformed

    private void btn_addMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseMoved
       
        
        
    }//GEN-LAST:event_btn_addMouseMoved

    private void btn_cleanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cleanMouseMoved
       
      
        
        
    }//GEN-LAST:event_btn_cleanMouseMoved

    private void class_tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_class_tableKeyReleased
       
    }//GEN-LAST:event_class_tableKeyReleased

    private void txt_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nameKeyReleased
        //search by name action performed
        
        try {
            
            String name=txt_name.getText();
            String sql="SELECT c.name,c.subject,c.grade,c.moblie_numer,c.image,t.date1,t.time1,t.date2,t.time2 FROM classess c JOIN class_time t ON c.cid=t.ctime WHERE name LIKE'%"+name+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            all_class_details.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txt_nameKeyReleased

    private void txt_search_subjectKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_subjectKeyReleased
       // //search by subject action performed
       
       try {
            
            String subject=txt_search_subject.getText();
            String sql="SELECT c.name,c.subject,c.grade,c.moblie_numer,c.image,t.date1,t.time1,t.date2,t.time2 FROM classess c JOIN class_time t ON c.cid=t.ctime WHERE subject LIKE'%"+subject+"%'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            all_class_details.setModel(DbUtils.resultSetToTableModel(rs));
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
       
       
     
    }//GEN-LAST:event_txt_search_subjectKeyReleased

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void all_class_detailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_class_detailsMouseClicked
        
        
        //table_click
        
           int row=all_class_details.getSelectedRow();
            String Table_click=(all_class_details.getModel().getValueAt(row,0).toString());
        try {
        
            String sql="SELECT image FROM classess WHERE name='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
            
                byte[]imagedata=rs.getBytes("image");
                format=new ImageIcon(imagedata);
                picture.setIcon(format);
       
            }
                     
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            
            
            String sql="SELECT c.cid,c.name,c.subject,c.grade,c.moblie_numer,t.date1,t.time1,t.date2,t.time2 FROM classess c JOIN class_time t ON c.cid=t.ctime WHERE cid='"+Table_click+"'";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("cid");
            txt_CID.setText(add);
            String add1=rs.getString("name");
            txt_searchname.setText(add1);
            String add2=rs.getString("subject");
            txt_Subject.setText(add2);
            int add3=rs.getInt("grade");
            jcmbo_search_grade.setSelectedIndex(add3);
            String add4=rs.getString("moblie_numer");
            txt_search_mobile.setText(add4);
            String add5=rs.getString("date1");
            txt_date1.setText(add5);
            String add6=rs.getString("time1");
            txt_search_time1.setText(add6);
            String add7=rs.getString("date2");
            txt_dateselect2.setText(add7);
            String add8=rs.getString("time2");
            txt_search_time2.setText(add8);
          
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       
    }//GEN-LAST:event_all_class_detailsMouseClicked

    private void all_class_detailsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_all_class_detailsKeyReleased

        if((evt.getKeyCode()==KeyEvent.VK_UP)||(evt.getKeyCode()==KeyEvent.VK_DOWN)){
        
            int row=all_class_details.getSelectedRow();
            String Table_click=(all_class_details.getModel().getValueAt(row,0).toString());
        try {
        
            String sql="SELECT image FROM classess WHERE name='"+Table_click+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            
            if(rs.next()){
            
                byte[]imagedata=rs.getBytes("image");
                format=new ImageIcon(imagedata);
                picture.setIcon(format);
       
            }
                     
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            
            
            String sql="SELECT c.cid,c.name,c.subject,c.grade,c.moblie_numer,t.date1,t.time1,t.date2,t.time2 FROM classess c JOIN class_time t ON c.cid=t.ctime WHERE cid='"+Table_click+"'";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
            if(rs.next()){
            String add=rs.getString("cid");
            txt_CID.setText(add);
            String add1=rs.getString("name");
            txt_searchname.setText(add1);
            String add2=rs.getString("subject");
            txt_Subject.setText(add2);
            int add3=rs.getInt("grade");
            jcmbo_search_grade.setSelectedIndex(add3);
            String add4=rs.getString("moblie_numer");
            txt_search_mobile.setText(add4);
            String add5=rs.getString("date1");
            txt_date1.setText(add5);
            String add6=rs.getString("time1");
            txt_search_time1.setText(add6);
            String add7=rs.getString("date2");
            txt_dateselect2.setText(add7);
            String add8=rs.getString("time2");
            txt_search_time2.setText(add8);
            
            
           
            
            
          
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
            
        } 
    }//GEN-LAST:event_all_class_detailsKeyReleased

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       //update btn action performed
       
       if(txt_searchname.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(null,"Fill the Name of Sir");
        }
        else if(txt_Subject.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Fill the Name of Subject");
        }
           else if(jcmbo_search_grade.getSelectedItem().equals("--Select--")){
        
        JOptionPane.showMessageDialog(null,"Select the Grade");
        
        }
           else if(txt_search_mobile.getText().isEmpty()){
       
              
         JOptionPane.showMessageDialog(null,"Enter the Telephone Number");
    
          }
          else if(txt_search_mobile.getText().length()!=9){
          
              JOptionPane.showMessageDialog(null,"Invaild Telephone Number");
 
          }
          else if(txt_date1.getText()==null){
          
          JOptionPane.showMessageDialog(null,"Fill the Date");
          
          }
          else if(txt_search_time1.getText().equals("select time")){
          
              JOptionPane.showMessageDialog(null,"Select the Time");
          
          }
          else if(txt_dateselect2.getText()==null){
          
          JOptionPane.showMessageDialog(null,"Fill the Date");
          }
          else if(txt_search_time2.getText().equals("select time")){
          
               JOptionPane.showMessageDialog(null,"Select the Time");
          
          }
       
          else{
       
       
        try {
       String sql="UPDATE SET c.name='"+txt_searchname.getText()+"',c.subject='"+txt_Subject.getText()+"',c.grade='"+jcmbo_search_grade.getSelectedItem()+"',c.moblie_numer='"+txt_search_mobile.getText()+"' FROM classess as c JOIN class_time as t ON c.cid=t.ctime  WHERE UPDATE date1='"+txt_date1.getText()+"',time1='"+txt_search_time1.getText()+"',date2='"+txt_dateselect2.getText()+"',time2='"+txt_search_time2.getText()+"'";
       pst=conn.prepareStatement(sql);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Up!!!"); 
       } catch (Exception e) {
           
           JOptionPane.showMessageDialog(null, e);
            }
            
       //String sirname=txt_searchname.getText();
      // String subject=txt_Subject.getText();
      // String grade=jcmbo_search_grade.getSelectedItem().toString();
       //String phone=txt_search_mobile.getText();
       //String Day1=txt_date1.getText();
      // String Time1=txt_search_time1.getTime().toString();
       //String Day2=txt_dateselect2.getText();
       //String Time2=txt_search_time2.getTime().toString();
            /*try {
       String sql1="UPDATE class_time SET  WHERE cid='"+txt_CID.getText()+"'";
       pst=conn.prepareStatement(sql1);
       pst.execute();
       JOptionPane.showMessageDialog(null, "Updated!!!");   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }*/
     
          }
       
      
    }//GEN-LAST:event_btn_updateActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_search_mobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_search_mobileKeyTyped
     
       
    }//GEN-LAST:event_txt_search_mobileKeyTyped

    private void btn_updateMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_updateMouseMoved
    
        
        
        
        
    }//GEN-LAST:event_btn_updateMouseMoved

    private void btn_deleteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_deleteMouseMoved
        
        
        
        
    }//GEN-LAST:event_btn_deleteMouseMoved

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jcombo_number_ofdaysPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcombo_number_ofdaysPopupMenuWillBecomeInvisible
       
     
   comboselect();
        
        
    }//GEN-LAST:event_jcombo_number_ofdaysPopupMenuWillBecomeInvisible


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable all_class_details;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clean;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JTable class_table;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jcmbo_search_grade;
    private javax.swing.JComboBox<String> jcombo_date;
    private javax.swing.JComboBox<String> jcombo_date2;
    private javax.swing.JComboBox<String> jcombo_grade;
    private javax.swing.JComboBox<String> jcombo_number_ofdays;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel time1;
    private javax.swing.JLabel time2;
    private javax.swing.JLabel txt_CID;
    private javax.swing.JTextField txt_Subject;
    private javax.swing.JTextField txt_date1;
    private javax.swing.JTextField txt_dateselect2;
    private javax.swing.JTextField txt_imagepath;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_path;
    private javax.swing.JTextField txt_search_mobile;
    private javax.swing.JTextField txt_search_subject;
    private com.github.lgooddatepicker.components.TimePicker txt_search_time1;
    private com.github.lgooddatepicker.components.TimePicker txt_search_time2;
    private javax.swing.JTextField txt_searchname;
    private javax.swing.JTextField txt_sirname;
    private javax.swing.JTextField txt_subject;
    private javax.swing.JTextField txt_telphone;
    private com.github.lgooddatepicker.components.TimePicker txt_timechooser;
    private com.github.lgooddatepicker.components.TimePicker txt_timechooser2;
    // End of variables declaration//GEN-END:variables

private ImageIcon format=null;
private ImageIcon icons=null;
String filename=null;
String filenames=null;
int s=0;
byte[] person_image=null;


   

}

