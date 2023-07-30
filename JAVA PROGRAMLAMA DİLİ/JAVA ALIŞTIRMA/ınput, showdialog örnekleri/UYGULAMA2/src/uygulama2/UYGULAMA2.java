
package uygulama2;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class UYGULAMA2 {

  
    public static void main(String[] args)
    {
     //int a,b,sonuc; char secim;
      // Scanner okunan=new Scanner(System.in);
        
      //  JOptionPane.showMessageDialog(null, "MANAVGAT MESLEK YÜKSEK OKULU"); // MESAJ KUTUSU 
      //JOptionPane.showMessageDialog(null, "MANAVGAT MESLEK YÜKSEK OKULU","MERHABA",JOptionPane.WARNING_MESSAGE); // BAŞLIKLI MESAJ KUTUSU
    
        int sayi=Integer.parseInt(JOptionPane.showInputDialog("LÜTFEN AŞAĞIYA YAZININ"," SINAV NOTUNUZU GİRİNİZ : ")); //string olarak gelen bir ifadeyi tam sayıya çevrebilirsin aa bu tam sayı integer kütüphanenin elemanıdır.
               System.out.print("GİRİLEN SAYININ HARF KARŞILIĞI  :");
                switch (sayi/10 )
                {
                    case 10:
                    case 9:
                 System.out.print("AA");break;
                    case 8:
                    case 7:
                        System.out.print("BB"); break;
                    case 6: 
                 //System.out.print("CB"); break;
                   JOptionPane.showConfirmDialog(null, "ÖĞRENCİNİN HARF NOTU  : CB","",JOptionPane.CANCEL_OPTION); break;
                    case 5:
                    case 4:
                      System.out.print("CC"); break;  
                        default:System.out.print("FF"); break;  
                }
                      
   
    
    System.out.println("");  // sistem yeşil mesajı aşağıda olsun diye
    }
   
}
