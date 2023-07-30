

package text_ıslemlerı_2;

import java.io.*;
import java.util.Scanner;



public class TEXT_ISLEMLERI_2 {

   
    public static void main(String[] args) throws IOException   // sarı imlece basım ekledik bu ıoexceptionu.
    {
        
        File dosya=new File("bilgiler.txt");
        if(!dosya.exists()) // dosya kontrolü böyle bir dosya yoksa
        {
        dosya.createNewFile();
        }
        
            
        
        
        Scanner oku = new Scanner(System.in);
        String isim; int gelir; float maas;
        System.out.println("LÜTFEN ADINIZI GİRİNİZ"); isim=oku.next();
        System.out.println("LÜTFEN GELİR GİRİNİZ"); gelir=oku.nextInt();
        System.out.println("LÜTFEN MAAS GİRİNİZ"); maas=oku.nextFloat();
        
        try
            {
                FileWriter kaydet= new FileWriter(dosya,true);
                PrintWriter yazıcı=new PrintWriter(dosya);
                yazıcı.print(isim); yazıcı.print(" ");  yazıcı.print(gelir); yazıcı.print(" "); yazıcı.print(maas); 
                yazıcı.close();
                System.out.println("KAYIT İŞLEMİ BAŞARILI");
                
                
            }
        catch(IOException e)
                
            {
                 System.out.println("KAYIT İŞLEMİ BAŞARISIZ");    
            }
        
        
    
        
        
    }
    
}
