
package uygulama1;
import java.util.Scanner;
public class UYGULAMA1 {

    
    public static void main(String[] args) 
    
    {
     // fibonacci serisi 0 1 1 2 3 5 8 13 ....
        Scanner oku = new Scanner(System.in);
        int s1=0; 
        int s2=1;
        int okunan;
        int i;
        int sonuc;
        
        System.out.print("Kaç Tane Fibonacci Sayısı Yazdırılsın : ");
        okunan=oku.nextInt();
        System.out.print(s1+" "+s2);
        for (i=2;i<okunan;i++)
        {
        sonuc=s1+s2;
        System.out.print(" "+sonuc);
        s1=s2;
        s2=sonuc;
        }
        System.out.println();
        
        
        
    }
    
}
