
package uygulama;

import java.util.Scanner;


public class UYGULAMA {

    public static void main(String[] args) 
    {
     int a,b,secim,sonuc;
     // eger secim char tipinde olsaydı şöyle tanımalnırdı   char secim;
        Scanner okunan =new Scanner (System.in); //metin,karakter,sayı hepsi için kullanılına 
        System.out.print("Lütfen birinci sayiyi giriniz :"); a=okunan.nextInt();
        System.out.print("Lütfen ikinci sayiyi giriniz :"); b=okunan.nextInt();
        System.out.println("1 - TOPLAMA İŞLEMİ");
        System.out.println("2 - ÇIKARMA İŞLEMİ");
        System.out.println("3 - ÇARPMA İŞLEMİ");
        System.out.println("4 - BÖLME İŞLEMİ");
        System.out.print("LÜTFEN BİR SEÇİM YAPINIZ : ");secim=okunan.nextInt();
                                              // char tipinde olsayıdı secim=okunan.next().charAt(0);
        
        switch(secim)
            
        {// switc başlangıcı
        
            case 1:
            {
                sonuc=a+b;
                System.out.print("SAYILARIN TOPLAMI :"+sonuc);
                break;
            }
            case 2:
            {
                sonuc=a-b; 
                System.out.print("SAYILARIN FARKI :"+sonuc);
                break;
            }
            case 3:
            {
                sonuc=a*b;
                System.out.print("SAYILARIN CARPIMI:"+sonuc);
                break;
            }
            case 4:
            {
                sonuc=a/b;
                System.out.print("SAYILARIN BÖLÜMÜ :"+sonuc);
                break;
            }
            default:
            {
               System.out.print("SECİLEN DIŞINDA BİR DEĞER GİRİLDİ");
               System.exit(0);
              // ödev her seçimden sonra tekrar menüde istemem kısmına gider.
                break;
            }
                
              
        }//switc sonu
        
        
        /* if ile aynısını yapma
        
        if(secim==1)   // eger char değişken olursa secim '' içine alınır sayılar.
        {
         sonuc=a+b;
                System.out.print("SAYILARIN TOPLAMI :"+sonuc);
        }
        else if(secim==2)
        {
        sonuc=a-b; 
                System.out.print("SAYILARIN TOPLAMI :"+sonuc);
        }
        else if(secim==3)
        {
        sonuc=a*b;
                System.out.print("SAYILARIN FARKI:"+sonuc);
        }
        else if(secim==4)
        {
        sonuc=a/b;
                System.out.print("SAYILARIN BÖLÜMÜ :"+sonuc);
        }
        else
        {
        System.exit(0);
        }
        
        
        */
      
        
    }
    
}
