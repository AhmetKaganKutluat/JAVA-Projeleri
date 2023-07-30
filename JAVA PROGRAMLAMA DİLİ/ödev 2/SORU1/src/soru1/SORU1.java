
package soru1;
import java.util.Scanner;

public class SORU1 {

    
    public static void main(String[] args)
    
    {
      Scanner sc = new Scanner(System.in); 
        System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\n Denklemdeki sabitleri aşağıdaki gibi sırayla girin"); 
        
        System.out.print("a değerini giriniz :"); 
        double a = sc.nextInt(); 
        System.out.print("b değerini giriniz   :"); 
        double b = sc.nextInt(); 
        System.out.print("c değerini giriniz   :"); 
        double c = sc.nextInt(); 
        //diskriminant (delta)
        double delta = (b * b) - (4 * a * c); 
        
        if (delta > 0){ 
            double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a); 
            double x2 = ((-1 * b) + Math.sqrt(delta)) / (2 * a); 
            System.out.println("x1= " + x1 + " x2= " + x2); 
        } 
        if (delta < 0){
            System.out.println("Denklemin Gerçel Kökü Yoktur."); 
        } 
        if (delta == 0){ 
            double x = (-1 * b) / (2 * a);
            System.out.println("Çakışık kökü var x1= x2= " + x); 
        }
   
        
    }
    
}
