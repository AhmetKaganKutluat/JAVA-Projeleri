
package girilen.en.büyük.sayıyı.bulan.program;


import java.util.Scanner;
public class GirilenEnBüyükSayıyıBulanProgram {

    
 
    public static void main(String[] args)
    {
        
         int max=0;
        int min=0;
        int sayı;
        
        Scanner oku=new Scanner(System.in);
        System.out.print("KAÇ TANE SAYI GİRMEK İSTİYORSUNUZ :");
        sayı=oku.nextInt();
       
        
        
        
        for (int i=1;i<=sayı;i++)
        {
        System.out.print(i+" SAYIYI GİRİNİZ :");
        int sayılar=oku.nextInt();
        
        if(i==1)
        {
        max=sayılar;
        min=sayılar;
        
        }
        
         if (sayılar>max)
                max=sayılar;
            
            if (sayılar<min)
                min=sayılar;
            
         }
        
        System.out.println("girdiginiz sayilar icinden en buyuk olani: "+max);
        System.out.println("girdiginiz  sayilar icinden en kucuk olani: "+min);
                
       
    }
    
}
