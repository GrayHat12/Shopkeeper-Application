/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.nio.file.*;

/**
 *
 * @author gray_hat
 */
public class ExistingUserLog {

    public static String getName(long phon) {
        String name = "";
        String phone = "" + phon;
        try {
            String data = readFileAsString("data//" + phone.hashCode() + "//valuen");
            name = data;
        } catch (Exception error) {
            name = "" + error;
        }
        return name;
    }

    public static String readFileAsString(String fileName) throws Exception {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public static void BUY(String it, double quan, long phon,double price) {
        String phone = "" + phon;
        String text = "";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        text += (it +" : "+price+ " x " + quan + " = "+(price*quan)+"\ton : " + dtf.format(now) + "\n\n\n");

        try {
            File dir = new File("data//" + phone.hashCode());
            File file = new File(dir, "value");
            FileWriter fw = new FileWriter(file, true);
            fw.append(text);
            fw.close();
        } catch (Exception error) {
            System.out.println(error);
        }
    }

    public static String LOG(long phon) {
        String text;
        String phone = "" + phon;
        try {
            String data = readFileAsString("data//" + phone.hashCode() + "//value");
            text = data;
        } catch (Exception error) {
            text = "" + error;
        }
        return text;
    }

    static boolean UserExists(long phon) {
        String phone = "" + phon;
        File dir = new File("data//" + phone.hashCode());
        boolean exist = dir.exists();
        return exist;
    }

    static String icnPth(long phone) {
        String path = "";
        String ph = "" + phone;
        if (UserExists(phone))
        {
            try {
                String data = readFileAsString("data//" + ph.hashCode() + "//valuei");
                path = data;
            } catch (Exception error) {
                path = "/trynight3/inpro.png";
            }
        }
        else
            path="/trynight3/inpro.png";
        return path;
    }
}