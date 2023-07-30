
package uygulama1;

import java.util.Locale;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;


public class UYGULAMA1 {
    
    public static String  ekran(int a[])
    {
        String yaz="";
        
        for(int i=0;i<a.length;i++)
        {
        yaz=yaz+String.format("%8d",a[i]);
        
        }
    yaz=yaz+"\n";
    return yaz;
    }

   
    public static void main(String[] args)
    {
       // TEK BOYUTLU DİZİ UYGULAMASI ÖNEMLİ !!
        int dizi1[]={15,5,7,9,12,14,61,11,2,60};
        int dizi2[]={10,6,4,12,9,3,6,12,45,87};
        int dizi3[]=new int[dizi1.length];
        
        int i =0;
        
        while(i<dizi1.length)
        {
        
        dizi3[i]=dizi1[i]+dizi2[i];
        i++;
        }
           String metin = "DİZİ 1 ELEMANLARI : \n"+ekran(dizi1)+"\nDİZİ2 ELEMANLARI : \n"+ekran(dizi2)+"\nSONUÇ SAYILARI : \n"+ekran(dizi3);
           String baslik="DİZİ ELEMANLARININ BİREBİR ÇIKTILARI AŞAĞIDADIR";
           
           JOptionPane.showMessageDialog(null,metin,baslik,JOptionPane.PLAIN_MESSAGE);
    }
    
}
