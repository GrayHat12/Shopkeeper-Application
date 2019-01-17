/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author gray_hat
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        newulab = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        namsp = new javax.swing.JSeparator();
        phone = new javax.swing.JTextField();
        phnsp = new javax.swing.JSeparator();
        signup = new javax.swing.JButton();
        meslab = new javax.swing.JLabel();
        exisulab = new javax.swing.JLabel();
        uid = new javax.swing.JTextField();
        uidsep = new javax.swing.JSeparator();
        login = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        forShoplab = new javax.swing.JLabel();
        bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shopper Stop V4.6.6");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setIconImage(Toolkit.getDefaultToolkit().getImage("Det.png"));
        setLocation(new java.awt.Point(500, 300));
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);
        setSize(new java.awt.Dimension(700, 490));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(14, 14, 14));
        jPanel1.setForeground(new java.awt.Color(0, 51, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setBackground(new java.awt.Color(14, 14, 14));
        exit.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 0));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 30, 30));

        newulab.setBackground(new java.awt.Color(14, 14, 14));
        newulab.setFont(new java.awt.Font("Courier 10 Pitch", 0, 24)); // NOI18N
        newulab.setForeground(new java.awt.Color(204, 255, 204));
        newulab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newulab.setLabelFor(jPanel1);
        newulab.setText("SIGN UP");
        jPanel1.add(newulab, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 219, 63));

        name.setBackground(new java.awt.Color(14, 14, 14));
        name.setForeground(new java.awt.Color(204, 255, 204));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setText("--NAME HERE--");
        name.setBorder(null);
        name.setCaretColor(java.awt.Color.blue);
        name.setOpaque(false);
        name.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        name.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, 190, 34));

        namsp.setBackground(new java.awt.Color(51, 62, 129));
        jPanel1.add(namsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 190, 5));

        phone.setBackground(new java.awt.Color(14, 14, 14));
        phone.setForeground(new java.awt.Color(204, 255, 204));
        phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        phone.setText("--PHONE NUMBER--");
        phone.setBorder(null);
        phone.setCaretColor(java.awt.Color.blue);
        phone.setOpaque(false);
        phone.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        phone.setSelectionColor(new java.awt.Color(0, 0, 0));
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, 190, 34));

        phnsp.setBackground(new java.awt.Color(51, 62, 129));
        jPanel1.add(phnsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 190, 5));

        signup.setBackground(new java.awt.Color(126, 81, 229));
        signup.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        signup.setText("SIGN UP");
        signup.setBorder(null);
        signup.setBorderPainted(false);
        signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupMouseClicked(evt);
            }
        });
        jPanel1.add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 228, 39));

        meslab.setBackground(new java.awt.Color(51, 51, 51));
        meslab.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        meslab.setForeground(new java.awt.Color(102, 102, 102));
        meslab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        meslab.setText("SIGN IN TO USE THE SOFTWARE");
        meslab.setDoubleBuffered(true);
        meslab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(meslab, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 370, 270, 40));

        exisulab.setBackground(new java.awt.Color(51, 62, 129));
        exisulab.setFont(new java.awt.Font("Courier 10 Pitch", 0, 24)); // NOI18N
        exisulab.setForeground(new java.awt.Color(204, 255, 204));
        exisulab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exisulab.setLabelFor(jPanel1);
        exisulab.setText("LOGIN");
        exisulab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exisulab.setIconTextGap(0);
        exisulab.setNextFocusableComponent(uid);
        exisulab.setRequestFocusEnabled(false);
        exisulab.setVerifyInputWhenFocusTarget(false);
        jPanel1.add(exisulab, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 228, 63));

        uid.setBackground(new java.awt.Color(51, 62, 129));
        uid.setForeground(new java.awt.Color(204, 255, 204));
        uid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uid.setText("--UID HERE--");
        uid.setBorder(null);
        uid.setCaretColor(java.awt.Color.blue);
        uid.setOpaque(false);
        uid.setSelectedTextColor(new java.awt.Color(51, 51, 255));
        uid.setSelectionColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(uid, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 228, 34));

        uidsep.setBackground(new java.awt.Color(14, 14, 14));
        jPanel1.add(uidsep, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 195, 228, 5));

        login.setBackground(new java.awt.Color(14, 14, 14));
        login.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        login.setForeground(new java.awt.Color(204, 255, 204));
        login.setText("LOGIN");
        login.setBorder(null);
        login.setBorderPainted(false);
        login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        login.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/trynight3/bck.jpg"))); // NOI18N
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 235, 228, 39));

        jButton3.setBackground(new java.awt.Color(14, 14, 14));
        jButton3.setFont(new java.awt.Font("Chilanka", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(204, 255, 204));
        jButton3.setText("SHOP INVENTORY");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/trynight3/bck.jpg"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 361, 228, 44));

        forShoplab.setBackground(new java.awt.Color(51, 62, 129));
        forShoplab.setFont(new java.awt.Font("Jamrul", 0, 8)); // NOI18N
        forShoplab.setForeground(new java.awt.Color(204, 255, 204));
        forShoplab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        forShoplab.setText("FOR SHOPKEEPERS");
        jPanel1.add(forShoplab, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 423, 228, 23));

        bckgrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trynight3/bck.jpg"))); // NOI18N
        bckgrd.setPreferredSize(new java.awt.Dimension(410, 490));
        jPanel1.add(bckgrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    int xp = 0, yp = 0;

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xp = evt.getX();
        yp = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen() - xp, evt.getYOnScreen() - yp);
    }//GEN-LAST:event_formMouseDragged

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        this.dispose();
        shopinvenscreen.main();
    }//GEN-LAST:event_jButton3MouseClicked

    private void signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupMouseClicked
        try {
            long ph = Long.parseLong(phone.getText());
            if (phone.getText().length() == 10) {
                if (!name.getText().trim().equalsIgnoreCase("--NAME HERE--")) {
                    if (!ExistingUserLog.UserExists(ph)) {
                        new NewUserCreate(ph, name.getText());
                        this.dispose();
                        UserScreen.main(ph);
                    } else {
                        meslab.setText("User already exists.. Head to Login Section in left");
                        name.setText("--NAME HERE--");
                        phone.setText("--PHONE NUMBER HERE--");
                    }
                } else {
                    meslab.setText("Check name");
                }
            }
        } catch (Exception e) {
            meslab.setText("Check phone number :");
            name.setText("--NAME HERE--");
            phone.setText("--PHONE NUMBER HERE--");
        }
    }//GEN-LAST:event_signupMouseClicked

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        if (uid.getText().length() == 10) {
            try {
                long ph = Long.parseLong(uid.getText());
                if (ExistingUserLog.UserExists(ph)) {
                    this.dispose();
                    UserScreen.main(ph);
                } else {
                    errorMessage("User dosent exist. Sign-up first", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (Exception e) {
                errorMessage("Incorrect UID", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            errorMessage("Incorrect UID", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Dracula".equalsIgnoreCase(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    public void errorMessage(String msg, String title, int ob) {
        UIManager.put("OptionPane.background", Color.red);
        UIManager.put("Panel.background", Color.red);
        JOptionPane.showMessageDialog(this, msg, title, ob);
        //error=false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel bckgrd;
    public javax.swing.JLabel exisulab;
    public javax.swing.JLabel exit;
    public javax.swing.JLabel forShoplab;
    public javax.swing.JButton jButton3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JButton login;
    public javax.swing.JLabel meslab;
    public javax.swing.JTextField name;
    public javax.swing.JSeparator namsp;
    public javax.swing.JLabel newulab;
    public javax.swing.JSeparator phnsp;
    public javax.swing.JTextField phone;
    public javax.swing.JButton signup;
    public javax.swing.JTextField uid;
    public javax.swing.JSeparator uidsep;
    // End of variables declaration//GEN-END:variables
}