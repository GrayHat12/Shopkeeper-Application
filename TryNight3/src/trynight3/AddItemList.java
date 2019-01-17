/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gray_hat
 */
public class AddItemList {

    public static boolean add(String item,double price) {
        boolean added = true;
        File dir = new File("data");
        dir.mkdirs();
        File file = new File(dir, "shoit");
        File file2 = new File(dir, "shopr");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.append(item + "\n");
            fw.close();
        } catch (IOException err) {
            added = false;
        }
        try (FileWriter fw2 = new FileWriter(file2, true)) {
            fw2.append(price + "\n");
            fw2.close();
        } catch (IOException err) {
            added = false;
        }
        return added;
    }

    public static String view() {
        String text="";
        BufferedReader reit,repr;
        if(ItemExists())
        {
            try
            {
                reit=new BufferedReader(new FileReader("data//shoit"));
                repr=new BufferedReader(new FileReader("data//shopr"));
                String it=reit.readLine();
                String pr=repr.readLine();
                while(it!=null)
                {
                    text+=it+"\t costing \t"+pr+"\n\n";
                    System.out.println(text);
                    it=reit.readLine();
                    pr=repr.readLine();
                }
                reit.close();
                repr.close();
            }
            catch(Exception e)
            {
                text+=""+e;
            }
        }
        else
            text+="--NO ITEM--";
        return text;
    }

    public static String remove(String item) {
        BufferedReader read,readp;
        boolean mf = false;
        System.out.println(mf);
        String list[] = new String[0];
        String listp[]=new String[0];
        int i = 0;
        System.out.println(i);
        if (ItemExists()) {
            try {
                read = new BufferedReader(new FileReader("data//shoit"));
                readp=new BufferedReader(new FileReader("data//shopr"));
                String line = read.readLine();
                String p=readp.readLine();
                while (line != null && !"\n".equals(line)) {
                    System.out.println(line);
                    if (line.trim().equalsIgnoreCase(item.trim())) {
                        System.out.println(i + "\t" + line + "\t" + item + "\t" + mf);
                        list = addArr(list, ".", i);
                        listp=addArr(listp,".",i);
                        mf = true;
                        System.out.println(mf + "\t" + list[i]);
                        i += 1;
                    } else {
                        list = addArr(list, line, i);
                        listp=addArr(listp,p,i);
                        System.out.println(i + "\t" + line + "\t" + item + "\t" + mf);
                        i += 1;
                    }
                    line = read.readLine();
                }
                read.close();
                readp.close();
            } catch (Exception err) {
                ;
            }
            if (mf) {
                File dir = new File("data//");
                File filein = new File(dir, "shoit");
                filein.delete();
                File filepr = new File(dir, "shopr");
                filepr.delete();
                int k=0;
                for(String s=list[k],pr=listp[k];k<list.length;k++)
                {
                    if (!s.equals(".")) {
                        s+="\n";
                        pr+="\n";
                        System.out.println("\t" + s);
                        File file=new File(dir,"shoit");
                        try {
                                System.out.println(s);
                                FileWriter fw = new FileWriter(file, true);
                                fw.append(s);
                                fw.close();
                            
                        } catch (Exception err) {
                            ;
                        }
                        File file2=new File(dir,"shopr");
                        try {
                                System.out.println(s);
                                FileWriter fw = new FileWriter(file2, true);
                                fw.append(pr);
                                fw.close();
                            
                        } catch (Exception err) {
                            ;
                        }
                    }
                }
            }
            if (mf) {
                return item + " removed";
            } else {
                return item + " not found";
            }
        } else {
            return "file.NotExists";
        }

    }

    static boolean ItemExists() {
        File dir = new File("data//shoit");
        boolean exist = dir.exists();
        return exist;
    }

    static String[] addArr(String pr[], String el, int i) {
        String tmp[] = new String[pr.length + 1];
        System.out.println("Initialised tmp");
        System.arraycopy(pr, 0, tmp, 0, pr.length);
        System.out.println("Copied arr");
        tmp[i] = el;
        System.out.println("added element");
        return tmp;
    }
}