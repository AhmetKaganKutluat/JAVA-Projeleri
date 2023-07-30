
package soru3;

import java.util.Scanner;
public class SORU3 {

 
    public static void main(String[] args)
    
    {
     
      Scanner okunan = new Scanner(System.in);
        
        System.out.print("Dairenin yarıçapını giriniz: ");
        int yarıcap = okunan.nextInt();
        
        System.out.println("Dairenin alanı = " + (Math.PI * yarıcap * yarıcap));
        System.out.println("Dairenin cevresı = " + (Math.PI * yarıcap*2 ));
        
    }
    
}
