
package yol.vererek.okutma;

import java.io.*;
public class YolVererekOkutma {

    
    public static void main(String[] args) throws FileNotFoundException 
    {
   
        String yol="ogr\\bilgiler.txt";
        File dosya=new File(yol);
        if(dosya.exists())
        {
        System.out.print("dosya bulundu !!");
        PrintWriter dosyaya_yaz=new PrintWriter(dosya);
        dosyaya_yaz.print("UMUT TÜMER");
        dosyaya_yaz.println(2021);
        dosyaya_yaz.close();
        }
        else
        {
         System.out.print("dosya bulunamadı !!");
        }
        
        
        
        
        
    }
    
}
