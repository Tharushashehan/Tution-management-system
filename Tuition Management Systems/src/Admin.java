
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.UIManager;


public class Admin extends javax.swing.JFrame {
  Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
  
    
   
    public Admin() {
        initComponents();
        conn=javaconnect.ConnecrDb();
         setExtendedState(MAXIMIZED_BOTH);
         jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/admin.jpg")));
           
        current_date();
        txt_name.setVisible(true);
        
        
        
         new Thread(new Runnable() {

            public void run() {
                while (true) {
                    m();
                    

                }
            }
        }).start();
         
         new Thread(new Runnable() {

            public void run() {
                while (true) {
                    
                    w();

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
    String c = " ";
    void w() {
        String txt = "PRoSoft.lk  No-226D, Keppetipola Road, Badulla. 077-2528887,071-2554037,076-1113346";
        String[] arr1 = txt.split("");
        for (int i = 0; i < arr1.length; i++) {

            c = c.concat(arr1[i]);

           txt_name.setText(c);

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
        c = " ";
    }
  
    public void current_date()//to display the current date
    {

        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        txt_date.setText("Date " + year + "/" + (month + 1) + "/" + day);

        int second = cal.get(Calendar.SECOND);
        int miniute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        txt_date.setText("Time " + hour + ":" + (miniute) + ":" + second);

        //video #112 Dynamic clock-show date and time
        
        Thread clock=new Thread(){
        public void run(){
        for(;;){
        
        Calendar cal = new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        txt_date.setText("Date " + year + "/" + (month + 1) + "/" + day);

        int second = cal.get(Calendar.SECOND);
        int miniute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR);
        txt_time.setText("Time " + hour + ":" + (miniute) + ":" + second);

            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
    
        }
        
        }
       
        };
        
        clock.start();
        
        
    }

    
    
    
    
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_home = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane()
        ;
        txt_name = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 766));

        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel2.setPreferredSize(new java.awt.Dimension(1380, 64));

        btn_home.setBackground(new java.awt.Color(0, 255, 204));
        btn_home.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/home1.png"))); // NOI18N
        btn_home.setText("Home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/student-icon.png"))); // NOI18N
        jButton2.setText("Student");
        jButton2.setMaximumSize(new java.awt.Dimension(101, 39));
        jButton2.setMinimumSize(new java.awt.Dimension(101, 39));
        jButton2.setPreferredSize(new java.awt.Dimension(101, 39));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/payment-icon.png"))); // NOI18N
        jButton3.setText("Payment");
        jButton3.setMaximumSize(new java.awt.Dimension(101, 39));
        jButton3.setMinimumSize(new java.awt.Dimension(101, 39));
        jButton3.setPreferredSize(new java.awt.Dimension(101, 39));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Classroom-icon.png"))); // NOI18N
        jButton4.setText("New Class");
        jButton4.setMaximumSize(new java.awt.Dimension(101, 39));
        jButton4.setMinimumSize(new java.awt.Dimension(101, 39));
        jButton4.setPreferredSize(new java.awt.Dimension(101, 39));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(204, 0, 204));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/account-balances.png"))); // NOI18N
        jButton5.setText("Accounts");
        jButton5.setMaximumSize(new java.awt.Dimension(101, 39));
        jButton5.setMinimumSize(new java.awt.Dimension(101, 39));
        jButton5.setPreferredSize(new java.awt.Dimension(101, 39));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Message-icon.png"))); // NOI18N
        jButton6.setText("Messages");
        jButton6.setMaximumSize(new java.awt.Dimension(101, 39));
        jButton6.setMinimumSize(new java.awt.Dimension(101, 39));
        jButton6.setPreferredSize(new java.awt.Dimension(101, 39));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Welcome to Siyathra");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Institute of Education");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("No 156, Badulla Road, Hali ela. T.P. 072-6658198/077-5808555");

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        jPanel3.setPreferredSize(new java.awt.Dimension(113, 590));

        jButton7.setBackground(new java.awt.Color(0, 153, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/acc.png"))); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(81, 57));
        jButton7.setMinimumSize(new java.awt.Dimension(81, 57));
        jButton7.setPreferredSize(new java.awt.Dimension(81, 57));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("User Manager");

        jButton8.setBackground(new java.awt.Color(0, 204, 102));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/securecheck.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Access");

        jButton9.setBackground(new java.awt.Color(255, 204, 0));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Question-icon.png"))); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(81, 57));
        jButton9.setMinimumSize(new java.awt.Dimension(81, 57));
        jButton9.setPreferredSize(new java.awt.Dimension(81, 57));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Help");

        jButton10.setBackground(new java.awt.Color(255, 102, 102));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Exit.png"))); // NOI18N
        jButton10.setMaximumSize(new java.awt.Dimension(81, 57));
        jButton10.setMinimumSize(new java.awt.Dimension(81, 57));
        jButton10.setPreferredSize(new java.awt.Dimension(81, 57));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Exit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel5))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(60, 60, 60)
                .addComponent(jButton8)
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(60, 60, 60)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel6)
                .addGap(60, 60, 60)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        txt_name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 0, 255));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 0, 255));
        jLabel9.setText("Hot-line 077-2528887");

        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(382, 382, 382)
                .addComponent(txt_name)
                .addContainerGap(909, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 481, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name)
                    .addComponent(jLabel9))
                .addGap(62, 62, 62))
        );
        jDesktopPane1.setLayer(txt_name, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);

        txt_date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_date.setForeground(new java.awt.Color(255, 55, 102));

        txt_time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_time.setForeground(new java.awt.Color(255, 51, 102));

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(255, 255, 255)));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/Logo New.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_time)
                    .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_date))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_time))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        jDesktopPane1.removeAll();
        StudentManagement stu=new StudentManagement();
        jDesktopPane1.add(stu).setVisible(true);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
         jDesktopPane1.removeAll();
        payment pay=new payment();
        jDesktopPane1.add(pay).setVisible(true);
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // This is exit button 
        System.exit(0);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       //This is usermanagement button action formed
    
       UserManagement user=new UserManagement();
       user.setVisible(true);
       user.setDefaultCloseOperation(user.HIDE_ON_CLOSE);
      
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
       //This is content with access of the user
     LoginDate_time dlog=new LoginDate_time();
     dlog.setVisible(true);
     dlog.setDefaultCloseOperation(dlog.HIDE_ON_CLOSE);
    
         
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // This is content with newclass btn_action
      
        jDesktopPane1.removeAll();
        classes clz =new classes();
        jDesktopPane1.add(clz).setVisible(true);
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        // This is home btn_actionperformed
        
        Admin ad=new Admin();
        ad.setVisible(true);
        
    }//GEN-LAST:event_btn_homeActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // Messages btn_action
        
         jDesktopPane1.removeAll();
        Messages msg=new Messages();
        jDesktopPane1.add(msg).setVisible(true);
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         jDesktopPane1.removeAll();
        AccountManagement acc=new AccountManagement();
        jDesktopPane1.add(acc).setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    
                     UIManager.setLookAndFeel(new BernsteinLookAndFeel());
                    
                } catch (Exception e) {
                }
                
                
                
                
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_home;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
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
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_name;
    private javax.swing.JLabel txt_time;
    // End of variables declaration//GEN-END:variables
}
