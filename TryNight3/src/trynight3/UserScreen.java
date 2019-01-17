/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author root
 */
public class UserScreen extends javax.swing.JFrame {

    /**
     * Creates new form UserScreen
     */
    public UserScreen() {
        initComponents();
    }
    
    static String list[];
    static String prlist[];
    
    static long uid=0;
    
    public static String getIcon(long phone)
    {
        String path=ExistingUserLog.icnPth(phone);
        return path;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        proPic = new javax.swing.JLabel();
        uname = new javax.swing.JLabel();
        unasep = new javax.swing.JSeparator();
        uphone = new javax.swing.JLabel();
        uphsep = new javax.swing.JSeparator();
        logout = new javax.swing.JButton();
        formsep = new javax.swing.JSeparator();
        itemlist = new javax.swing.JComboBox();
        price = new javax.swing.JLabel();
        prisep = new javax.swing.JSeparator();
        quantity = new javax.swing.JTextField();
        quasep = new javax.swing.JSeparator();
        buy = new javax.swing.JButton();
        log = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(500, 300, 700, 400));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        //setFocusCycleRoot(false);
        setLocation(new java.awt.Point(500, 300));
        setUndecorated(true);
        setOpacity(0.9F);
        setSize(new java.awt.Dimension(700, 400));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                System.out.println("Mouse Dragged init");
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                System.out.println("Mouse Pressed init");
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        proPic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        proPic.setIcon(new javax.swing.ImageIcon(getClass().getResource(getIcon(uid))));
        proPic.setPreferredSize(new java.awt.Dimension(100, 100));
        getContentPane().add(proPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 57, -1, -1));

        uname.setForeground(new java.awt.Color(204, 255, 204));
        uname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uname.setLabelFor(this);
        uname.setText(ExistingUserLog.getName(uid)
        );
        uname.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 195, 200, 30));
        getContentPane().add(unasep, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 226, 200, -1));

        uphone.setForeground(new java.awt.Color(204, 255, 204));
        uphone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        uphone.setText(""+uid);
        getContentPane().add(uphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 260, 200, 30));
        getContentPane().add(uphsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 291, 200, -1));

        logout.setBackground(new java.awt.Color(14,14,14,14));
        logout.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        logout.setForeground(new java.awt.Color(14, 14, 14));
        logout.setText("LOGOUT");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setBorderPainted(false);
        logout.setContentAreaFilled(false);
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 319, 150, 30));

        formsep.setOrientation(javax.swing.SwingConstants.VERTICAL);
        formsep.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(formsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 12, -1, 368));

        itemlist.setBackground(new java.awt.Color(66, 88, 174));
        itemlist.setFont(new java.awt.Font("Manjari Thin", 0, 18)); // NOI18N
        itemlist.setForeground(new java.awt.Color(204, 255, 204));
        itemlist.setModel(new javax.swing.DefaultComboBoxModel(list));
        itemlist.setSelectedIndex(0);
        itemlist.setOpaque(false);
        itemlist.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                itemlistItemStateChanged(evt);
            }
        });
        getContentPane().add(itemlist, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 121, 200, 30));

        price.setForeground(new java.awt.Color(204, 255, 204));
        price.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price.setText(prlist[itemlist.getSelectedIndex()]);
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 185, 200, 30));
        getContentPane().add(prisep, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 215, 200, -1));

        quantity.setBackground(new java.awt.Color(14,14,14,14));
        quantity.setForeground(new java.awt.Color(204, 255, 204));
        quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        quantity.setText("--QUANTITY--");
        quantity.setBorder(null);
        quantity.setOpaque(false);
        
        getContentPane().add(quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 248, 200, 30));
        getContentPane().add(quasep, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 279, 200, -1));

        buy.setBackground(new java.awt.Color(14,14,14,14));
        buy.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        buy.setForeground(new java.awt.Color(14, 14, 14));
        buy.setText("BUY");
        buy.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));
        buy.setContentAreaFilled(false);
        buy.setFocusCycleRoot(true);
        buy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buyMouseClicked(evt);
            }
        });
        getContentPane().add(buy, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 319, 150, 30));

        log.setBackground(new java.awt.Color(14,14,14,14));
        log.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        log.setForeground(new java.awt.Color(14, 14, 14));
        log.setText("LOG");
        log.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.gray, null, null));
        log.setContentAreaFilled(false);
        log.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logMouseClicked(evt);
            }
        });
        getContentPane().add(log, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 319, 150, 30));

        close.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(204, 0, 0));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 0, 20, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trynight3/bck.jpg"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
        setVisible(true);
    }                 

    private void buyMouseClicked(java.awt.event.MouseEvent evt) {                                 
        try
        {
            double quan=Double.parseDouble(quantity.getText());
            if(quan>0)
            {
                ExistingUserLog.BUY(""+itemlist.getItemAt(itemlist.getSelectedIndex()),quan,uid,Double.parseDouble(price.getText()));
                errorMessage("Successfully Bought","MESSAGE",JOptionPane.PLAIN_MESSAGE);
            }
            else
                errorMessage("Quantity should be more than 0","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        catch(Exception e)
        {
            errorMessage("Check Quantity","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }                                

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {                                   
        this.dispose();
        System.exit(0);
    }                                  

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {                                    
        this.dispose();
        MainScreen.main();
    }                                   

    private void logMouseClicked(java.awt.event.MouseEvent evt) {                                 
        try
        {
            DisplayLog.main(uid);
        }
        catch(Exception e)
        {
            errorMessage(""+e,"ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }                                

    private void itemlistItemStateChanged(java.awt.event.ItemEvent evt) {                                          
        price.setText(prlist[itemlist.getSelectedIndex()]);
    }                                         

    private void formMousePressed(java.awt.event.MouseEvent evt) {                                  
        System.out.println("Mouse Prressed <");
        xp=evt.getX();
        yp=evt.getY();
        System.out.println("Mouse Pressed >");
    }                                 

    private void formMouseDragged(java.awt.event.MouseEvent evt) {                                  
        System.out.println("Mouse Dragged <");
        this.setLocation(evt.getXOnScreen()-xp,evt.getYOnScreen()-yp);
        System.out.println("Mouse Dragged >");
    }                                 

    int xp=0,yp=0;
    
    
    public static void main(long user) {
        uid=user;
        list=GetItemList.item();
        prlist=GetItemList.price();
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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen();
            }
        });
    }
    
    public void errorMessage(String msg,String title,int ob)
    {
        UIManager.put("OptionPane.background", Color.red);
        UIManager.put("Panel.background", Color.red);
        JOptionPane.showMessageDialog(this,msg,title,ob);
        //error=false;
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton buy;
    public javax.swing.JLabel close;
    public javax.swing.JSeparator formsep;
    public javax.swing.JComboBox itemlist;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JButton log;
    public javax.swing.JButton logout;
    public javax.swing.JLabel price;
    public javax.swing.JSeparator prisep;
    public javax.swing.JLabel proPic;
    public javax.swing.JTextField quantity;
    public javax.swing.JSeparator quasep;
    public javax.swing.JLabel uname;
    public javax.swing.JSeparator unasep;
    public javax.swing.JLabel uphone;
    public javax.swing.JSeparator uphsep;
    // End of variables declaration                   
}