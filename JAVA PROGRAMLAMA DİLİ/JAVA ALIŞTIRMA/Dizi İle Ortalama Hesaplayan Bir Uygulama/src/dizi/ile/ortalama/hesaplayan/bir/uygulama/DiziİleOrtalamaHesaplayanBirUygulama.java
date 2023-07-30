
package dizi.ile.ortalama.hesaplayan.bir.uygulama;

import javax.swing.JOptionPane;


public class DiziİleOrtalamaHesaplayanBirUygulama {

    public static void main(String[] args) 
    {
        
        float notlar[]= new float[3];
        
        notlar[0]=Float.valueOf(JOptionPane.showInputDialog(null,"LÜTFEN 1. SAYIYI GİRİNİZ"));
        notlar[1]=Float.valueOf(JOptionPane.showInputDialog(null,"LÜTFEN 2. SAYIYI GİRİNİZ"));
        notlar[2]=Float.valueOf(JOptionPane.showInputDialog(null,"LÜTFEN 3. SAYIYI GİRİNİZ"));
        
        float ortalama = (notlar[0]+notlar[1]+notlar[2])/3;
        
        JOptionPane.showMessageDialog(null,"ORTALAMA "+ Float.toString(ortalama));
        
        System.out.print("ORTALAMA :"+Float.toString(ortalama));
        
        
    }
    
}
