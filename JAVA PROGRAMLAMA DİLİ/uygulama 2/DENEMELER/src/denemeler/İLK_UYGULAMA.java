
package denemeler;

import java.util.Scanner;


public class İLK_UYGULAMA 
{
    public static void main(String[] args) 
    {
    //String isim="manavgat meslek yüksek okulu";
     //int sayi1=5;
     //int sayi2=10;
     //System.out.println(sayi1+sayi2);
     //System.out.println(isim);
    int a,b;
    int sonuc;
     
    
        Scanner veriler = new Scanner(System.in);
        
              
                System.out.print("lütfen birinci sayi giriniz :");
                a= veriler.nextInt();
                System.out.print("lütfen ikinci sayi giriniz :");
                b= veriler.nextInt();
                sonuc=a+b;
                
                System.out.println("iki sayinin toplami :"+sonuc);
               //System.out.println("iki sayinin toplami"+(a+b));
                
               
                
                
    
    
    }
    
}
