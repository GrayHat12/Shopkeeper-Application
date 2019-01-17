/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author gray_hat
 */
public class NewUserCreate
{
    NewUserCreate(long phon, String name)
    {
        String phone=""+phon;
        String write="";
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now=LocalDateTime.now();
        write+=("User joined On : "+dtf.format(now)+"\n\n");
        createIcon(phon,"/trynight3/inpro.png");
        try
        {
            File dir=new File("data//"+phone.hashCode());
            dir.mkdirs();
            File file=new File(dir,"value");
            FileWriter fw = new FileWriter(file);
            fw.write(write);
            fw.close();
            File f2=new File(dir,"valuen");
            FileWriter fw2=new FileWriter(f2);
            fw2.write(name);
            fw2.close();
            File f3=new File(dir,"valuep");
            FileWriter fw3=new FileWriter(f3);
            fw3.write(phone);
            fw3.close();
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
    }
    public static void createIcon(long phon,String path)
    {
        String phone=""+phon;
        try
        {
            File dir=new File("data//"+phone.hashCode());
            dir.mkdirs();
            File file=new File(dir,"valuei");
            FileWriter fw = new FileWriter(file);
            fw.write(path);
            fw.close();
        }
        catch(Exception error)
        {
            System.out.println(error);
        }
    }
}