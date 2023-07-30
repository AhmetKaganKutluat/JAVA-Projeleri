
package soru1;
import java.util.Scanner;

public class SORU1 {

    public static void main(String[] args)
    {
        Scanner okunan = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int deger = okunan.nextInt();
        int faktoriyel = 1;
        for(int i = 1; i<= deger; i++){
            faktoriyel = faktoriyel * i;
        }
         
        System.out.println("GİRDİĞİNİZ SAYININ FAKTORİYEL KARŞILIĞI : "+faktoriyel);
    }
    
}
