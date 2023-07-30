package dosya.işlemlerii;

import java.io.*;
import java.util.Scanner;
public class DOSYAİŞLEMLERİİ {

  
    public static void main(String[] args) 
    {
       File dosya=new File("bilgiler.txt");
       if(dosya.exists())
       {
       System.out.println("DOSYANIN ADI         :   "+dosya.getName()); 
       System.out.println("DOSYANIN TAM YOLU    :"+dosya.getAbsolutePath());
       System.out.println("DOSYA YAZILABİLİR Mİ ?"+dosya.canWrite());
       System.out.println("DOSYA OKUNABİLİR Mİ  ?"+dosya.canRead());
       System.out.println("DOSYANIN KAPLADIĞI ALAN :"+dosya.length());
       System.out.println("KLASÖR MÜSÜN          ?"+dosya.isDirectory());
       System.out.println("DOSYA MISIN          ?"+dosya.isFile());
       System.out.println("MODİFİYELİ MİSİN     ?"+dosya.lastModified());       
       }
       else 
       {
       System.out.print("Böyle Bir dosya yoktur");
       }
       
       try
       {
       Scanner okuyucu = new Scanner(dosya);
       while(okuyucu.hasNextLine())
       {
       String okunan=okuyucu.nextLine();
       System.out.print(okunan);
       }
       okuyucu.close();
       
       }
       catch(IOException e)
               {    
               System.out.print("hata !");
               }
       
        
        
         // ******BUFFERREADER YÖNTEMİ ****//
        /*
        try
        {
        FileReader dosya = new FileReader("bilgiler.txt");
        BufferedReader okuyucu=new BufferedReader(dosya);
        String okunan;
        while((okunan=okuyucu.readLine())!=null)
        {
        System.out.print(okunan);
        }
        
        }
        catch (IOException e)
        {System.out.print("HAATAAAA!!!");}
      
       */
    }
    
}
