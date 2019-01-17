/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trynight3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author gray_hat
 */
public class GetItemList
{
    public static String[] item()
    {
        BufferedReader read;
        String[] list = new String[1];
        list[0]="SELECT ITEM";
        String noItem[]={"No Item"};
        int i=1;
        if(ItemExists())
        {
            try
            {
                read=new BufferedReader(new FileReader("data//shoit"));
                String line;
                while((line=read.readLine())!=null)
                {
                    list=AddItemList.addArr(list,line,i);
                    i+=1;
                }
                read.close();
                return list;
            }
            catch(IOException e)
            {
                String err[]={"ERROR"+e};
                return err;
            }
        }
        else
            return noItem;
        //return list;
    }
    
    public static String[] price()
    {
        BufferedReader read;
        String[] list = new String[1];
        list[0]="0.00";
        String noItem[]={"0.00"};
        int i=1;
        if(ItemExists())
        {
            try
            {
                read=new BufferedReader(new FileReader("data//shopr"));
                String line;
                while((line=read.readLine())!=null)
                {
                    list=AddItemList.addArr(list,line,i);
                    i+=1;
                }
                read.close();
                return list;
            }
            catch(IOException e)
            {
                String err[]={"ERROR"+e};
                return err;
            }
        }
        else
            return noItem;
        //return list;
    }
    
    static boolean ItemExists()
    {
        File dir=new File("data//shoit");
        boolean exist=dir.exists();
        return exist;
    }
}