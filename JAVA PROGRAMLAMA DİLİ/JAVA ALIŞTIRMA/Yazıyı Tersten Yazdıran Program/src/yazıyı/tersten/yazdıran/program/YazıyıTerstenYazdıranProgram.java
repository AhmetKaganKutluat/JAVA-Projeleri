
package yazıyı.tersten.yazdıran.program;

import java.util.Scanner;

public class YazıyıTerstenYazdıranProgram {

    
    public static void main(String[] args)
    {
        Scanner oku = new Scanner(System.in);
        System.out.println("METİN GİRİNİZ :");
        String metin=oku.nextLine();
        String ters="";
        
        for (int i = metin.length()-1;i>=0;i--)
        {
        ters=ters+metin.charAt(i);
        }
        System.out.println("GİRDİĞİNİZ METNİN TERSİ:\n"+ters);
        
                
        
    }
    
}
