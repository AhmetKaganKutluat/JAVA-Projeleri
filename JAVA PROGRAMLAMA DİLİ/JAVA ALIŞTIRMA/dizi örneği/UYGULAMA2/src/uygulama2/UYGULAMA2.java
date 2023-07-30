
package uygulama2;

import java.util.Scanner;
import java.util.ArrayList;   // dizi oluşturmak için
import java.util.*;   // liste kutumu çağırmak için
public class UYGULAMA2 {

   
    public static void main(String[] args)
    {
        List memleket = new ArrayList();      
        memleket.add("ISPTARTA"); memleket.add("KAYSERİ"); memleket.add("GAZİANTEP");
        memleket.add("SAMSUN"); memleket.add("İSTANBUL"); memleket.add("KIRIKLARELİ");
        
        System.out.println(memleket);
        System.out.println("DİZİNİN 2. ELEMANI : " + memleket.get(2));
        System.out.println(memleket.isEmpty()); // isempty boş olarak kontrol ediyor. ama boş değil o yüzden false  veriyor
        System.out.println(memleket.contains("İSTANBUL"));  //contains içermek demek istanbulu içeriyormu diyor
        System.out.println(memleket.indexOf("KIRIKLARELİ"));  // index numarasını verir
        memleket.set(3,"ANTALYA");
       // memleket.remove(3);  3.elemanı sil
        System.out.println(memleket);
        
    }
    
}
