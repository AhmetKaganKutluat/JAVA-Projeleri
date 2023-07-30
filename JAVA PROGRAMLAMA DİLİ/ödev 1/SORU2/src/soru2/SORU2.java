
package soru2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class SORU2 {

    public static void main(String[] args)
    {
 
        Scanner deger = new Scanner(System.in);
        
     
        int vize = Integer.parseInt(JOptionPane.showInputDialog("VİZE NOTUNUZU GİRİNİZ"));
       
        int fınal = Integer.parseInt(JOptionPane.showInputDialog("FİNAL NOTUNUZU GİRİNİZ"));
        
        double not = (vize * 0.4) + (fınal * 0.6);
        
        System.out.println("Notunuz = " + not);
        
        if(not > 85) {
            System.out.println("AA ile dersi geçtiniz.");
           
        }
        else if(not > 80) {
            System.out.println("BA ile dersi geçtiniz.");
        }
        else if(not > 75) {
            System.out.println("BB ile dersi geçtiniz.");
        }
        else if(not > 70) {
            System.out.println("CB ile dersi geçtiniz.");
            
        }
        else if(not >= 60) {
            System.out.println("GEÇTİNİZ.");
        }
        else {
            System.out.println("KALDINIZ.");
        }
    }
        
    }
    

