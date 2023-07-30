
package soru2;

//import java.util.Scanner;
import javax.swing.JOptionPane;

public class SORU2 {

    
    public static void main(String[] args)
    {
       int sayi=Integer.parseInt(JOptionPane.showInputDialog("LÜTFEN AŞAĞIYA BİR SAYI YAZININ"," SAYI GİRİŞİ : ")); 
       switch (sayi)
       {
           case 1: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN PAZARTESİ"); break;
           case 2: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN SALI"); break;
           case 3: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN ÇARŞAMBA"); break;
           case 4: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN PERŞEMBE"); break;
           case 5: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN CUMA"); break;
           case 6: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN CUMARTESİ"); break;
           case 7: JOptionPane.showMessageDialog(null," BUGÜN GÜNLERDEN PAZAR"); break;  
           default:JOptionPane.showMessageDialog(null," YANLIŞ TUŞLAMA","HATA",JOptionPane.WARNING_MESSAGE); break;  
       
       
       }
       
    }
    
}
