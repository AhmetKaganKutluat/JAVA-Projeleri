
package dizi.elemanlarının.tek.çift.olduğunu.bulan.uygulama;


public class DiziElemanlarınınTekÇiftOlduğunuBulanUygulama {

    public static void main(String[] args) 
    {
       
        Integer dizi[]={1,2,3,4,5,6,7,8,9,10};
        for(int i=0;i< dizi.length;i++)
        {
            
        if (dizi[i] %2==0) 
        {
        System.out.println(dizi[i]+" cift");
        }
        if (dizi[i] %2!=0) 
        {
        System.out.println(dizi[i]+" tek");
        }
        
        }
        
    }
    
}
