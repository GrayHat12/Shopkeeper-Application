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
public class DisplayItem extends JFrame
{
    static DisplayItem mv1;
    JTabbedPane jtp1=new JTabbedPane();
    JPanel jp1=new JPanel();
    JTextArea t1=new JTextArea();
    DisplayItem() throws Exception
    {
        super("YOUR ITEMS");
        try
        {
        //String phone=""+phon;
        t1.append(AddItemList.view());
        System.out.println("textArea");
        t1.setEditable(false);
        t1.setBackground(Color.gray);
        jp1.add(t1);
        jtp1.addTab("Records",new JScrollPane(t1));
        jtp1.setBackground(Color.gray);
        jtp1.add(new JScrollPane(jp1),"Records");
        jtp1.add(new JScrollPane());
        add(jtp1);
        }
        catch(Exception err)
        {
            t1.append("--No Item--");
        }
    }
    public static void main()throws Exception
    {
        System.out.println("Strated Inv");
        mv1=new DisplayItem();
        mv1.setIconImage(Toolkit.getDefaultToolkit().getImage("Det.png"));
        System.out.println("Icon");
        mv1.setSize(300,500);
        System.out.println("Size");
        mv1.setVisible(true);   
        System.out.println("Visibility");
        mv1.setLocation(500,300);
        System.out.println("Location");
        mv1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        System.out.println("Def Close");
        mv1.repaint();
        System.out.println("Repaint");
    }
}