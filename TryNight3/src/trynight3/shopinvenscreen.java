/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author root
 */
public class shopinvenscreen extends javax.swing.JFrame {

    /**
     * Creates new form shopinvenscreen
     */
    public shopinvenscreen() {
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

        item = new javax.swing.JTextField();
        invlab = new javax.swing.JLabel();
        itemsp = new javax.swing.JSeparator();
        add = new javax.swing.JButton();
        rem = new javax.swing.JButton();
        view = new javax.swing.JButton();
        back = new javax.swing.JButton();
        close = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        pricesp = new javax.swing.JSeparator();
        bckgrd = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setUndecorated(true);
        setOpacity(0.9F);
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
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

        item.setBackground(new java.awt.Color(14,14,14,14));
        item.setFont(new java.awt.Font("FreeMono", 0, 18)); // NOI18N
        item.setForeground(new java.awt.Color(204, 255, 204));
        item.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        item.setText("--INPUT ITEM NAME--");
        item.setBorder(null);
        item.setNextFocusableComponent(add);
        item.setOpaque(false);
        getContentPane().add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 158, 220, 53));

        invlab.setFont(new java.awt.Font("Jamrul", 0, 24)); // NOI18N
        invlab.setForeground(new java.awt.Color(204, 255, 204));
        invlab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invlab.setLabelFor(this);
        invlab.setText("INVENTORY PANEL");
        getContentPane().add(invlab, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 52, 299, 51));
        getContentPane().add(itemsp, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 209, 220, 2));

        add.setBackground(new java.awt.Color(14, 14, 14));
        add.setForeground(new java.awt.Color(204, 255, 204));
        add.setText("ADD ITEM");
        add.setBorder(null);
        add.setBorderPainted(false);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 229, 140, 40));

        rem.setBackground(new java.awt.Color(14, 14, 14));
        rem.setForeground(new java.awt.Color(204, 255, 204));
        rem.setText("REMOVE ITEM");
        rem.setBorder(null);
        rem.setBorderPainted(false);
        rem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remMouseClicked(evt);
            }
        });
        getContentPane().add(rem, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 229, 140, 40));

        view.setBackground(new java.awt.Color(14, 14, 14));
        view.setForeground(new java.awt.Color(204, 255, 204));
        view.setText("VIEW INVENTORY");
        view.setBorder(null);
        view.setBorderPainted(false);
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });
        getContentPane().add(view, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 287, 163, 40));

        back.setBackground(new java.awt.Color(14, 14, 14));
        back.setForeground(new java.awt.Color(204, 255, 204));
        back.setText("BACK");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 339, 163, 40));

        close.setForeground(new java.awt.Color(204, 0, 0));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 20, 20));

        price.setBackground(new java.awt.Color(14,14,14,14));
        price.setFont(new java.awt.Font("FreeMono", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(204, 255, 204));
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setText("--INPUT PRICE--");
        price.setBorder(null);
        price.setNextFocusableComponent(add);
        price.setOpaque(false);
        getContentPane().add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 220, 53));
        getContentPane().add(pricesp, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 220, 2));

        bckgrd.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bckgrd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trynight3/bck.jpg"))); // NOI18N
        bckgrd.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        bckgrd.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(bckgrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        MainScreen.main();
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xp=evt.getX();
        yp=evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        this.setLocation(evt.getXOnScreen()-xp,evt.getYOnScreen()-yp);
    }//GEN-LAST:event_formMouseDragged

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        String  itnm=item.getText();
        String prce=price.getText();
        boolean done=false;
        if(!itnm.trim().equalsIgnoreCase("--INPUT ITEM NAME--"))
        {
            try
            {
                double prc=Double.parseDouble(prce);
                done=AddItemList.add(itnm, prc);
            }
            catch(Exception e)
            {
                errorMessage("Check price","Error",JOptionPane.ERROR_MESSAGE);
            }
            if(done)
                errorMessage("Added Item","DONE",JOptionPane.PLAIN_MESSAGE);
        }
        else
            errorMessage("Check item name","Error",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_addMouseClicked

    private void remMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remMouseClicked
        String  itnm=item.getText();
        String msg=AddItemList.remove(itnm);
        errorMessage(msg,"Message",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_remMouseClicked

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        try {
            System.out.println("DisplayItem.main();");
            DisplayItem.main();
        } catch (Exception ex) {
            Logger.getLogger(shopinvenscreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_viewMouseClicked

    int xp=0,yp=0;
    
    
    public static void main() {
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
            java.util.logging.Logger.getLogger(shopinvenscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(shopinvenscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(shopinvenscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(shopinvenscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new shopinvenscreen().setVisible(true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton add;
    public javax.swing.JButton back;
    public javax.swing.JLabel bckgrd;
    public javax.swing.JLabel close;
    public javax.swing.JLabel invlab;
    public javax.swing.JTextField item;
    public javax.swing.JSeparator itemsp;
    public javax.swing.JTextField price;
    public javax.swing.JSeparator pricesp;
    public javax.swing.JButton rem;
    public javax.swing.JButton view;
    // End of variables declaration//GEN-END:variables
}
