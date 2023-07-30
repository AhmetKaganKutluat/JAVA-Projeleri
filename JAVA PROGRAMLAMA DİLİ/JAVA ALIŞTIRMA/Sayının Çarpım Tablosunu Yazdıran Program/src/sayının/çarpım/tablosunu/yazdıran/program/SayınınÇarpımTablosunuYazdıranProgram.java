
package sayının.çarpım.tablosunu.yazdıran.program;

import java.util.Scanner;

public class SayınınÇarpımTablosunuYazdıranProgram {

    public static void main(String[] args) 
    
    {
        
        Scanner oku = new Scanner(System.in);
        int sayi;
        
        System.out.print("LÜTFEN BİR SAYI GİRİNİZ = ");
        sayi=oku.nextInt();
        
        for (int i=1;i<=10;i++)
        {
        System.out.println(i+" x "+sayi+" = "+(i*sayi));
        
        }
     
    }
    
}
