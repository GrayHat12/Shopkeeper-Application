/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.*;

/**
 *
 * @author gray_hat
 */
public class DisplayLog extends JFrame
{
    static DisplayLog mv1;
    JTabbedPane jtp1=new JTabbedPane();
    JPanel jp1=new JPanel();
    JTextArea t1=new JTextArea();
    DisplayLog(long phon) throws Exception
    {
        super(ExistingUserLog.getName(phon)+" LOG");
        //String phone=""+phon;
        t1.append(ExistingUserLog.LOG(phon));
        t1.setEditable(false);
        t1.setBackground(Color.gray);
        jp1.add(t1);
        jtp1.addTab("Records",new JScrollPane(t1));
        jtp1.setBackground(Color.gray);
        //jtp1.add(new JScrollPane(jp1),"Records");
        //jtp1.add(new JScrollPane());
        add(jtp1);  
    }
    public static void main(long phon) throws Exception
    {
        mv1=new DisplayLog(phon);
        mv1.setIconImage(Toolkit.getDefaultToolkit().getImage("Det.png"));
        mv1.setSize(500,400);
        mv1.setVisible(true);   
        mv1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }
}