
package text_ıslemlerı;

import java.io.FileWriter;  // sadece yazdırma dosyalama işlemleri için kütüphane sadece yazdırma işlemi için kullanılır.
//import java.io.*;         // io dosyalama işlemleri için genel kütüphane dosyala ile ilgili herşeyi kullanabiliriz
import java.io.IOException;    //try catch gibi yapılarda cath içine tanımlamak için kullanılır hata işlemidir.
import java.util.Scanner;     // klasik okuma işlemi için kütüphane.


public class TEXT_ISLEMLERI {

  
    public static void main(String[] args) 
    
    {
            Scanner oku = new Scanner(System.in);   //in hangi tip sayı olursa olsun alan demek
            String isim;
            int gelir;
            double maas;
            
            System.out.println("LÜTFEN ADINIZI GİRİNİZ      : "); isim =oku.next();
            System.out.println("LÜTFEN GELİR GİRİNİZ        : "); gelir=oku.nextInt();   //sayısal oldugu için
            System.out.println("LÜTFEN MAAŞINIZI GİRİNİZ    : "); maas=oku.nextDouble(); // double değişken olgunu için
        
            try
                {
                    FileWriter dosya=new FileWriter("bilgiler.txt");  // yazmak için tanımlamamız lazım  otomatik derleyince kendi oluşturuyo
                    
                    //dosya.write("MANAVGAT MESLEK YÜKSEK OKULU");      //bilgiler.txt içine yazdık  
                    // **EGER YAZDIRICAĞIMIZ DEĞERDE SAYISAL STRİNG DEĞER VARSA SIKINTI YOK AMA DOUBLE FLOAT VARSA DOSYA.WRİTE ÇALIŞMAZ HATA VERİRZ.**
                    dosya.write(isim);
                    dosya.write(gelir); 
                    //dosya.write(maas);  // MAASI ALMIYO ÇÜNKÜ DOUBLE DEĞİŞKEN KABUL ETMİYO 2.UYGULAMADA FARKLI YÖNTEMŞE KAYIT YAPICAZ.
                    dosya.close();    //açılan dosya kapanmak zorundadır.
                    System.out.println("BAŞARIYLA YÜKLEDİ");
                }
             catch(IOException e)
                {
                System.out.println("BEKLENMEDİK HATA OLUŞTU");
                }
                 // bunda finally yoktur.
        
        
        
    }
    
}
