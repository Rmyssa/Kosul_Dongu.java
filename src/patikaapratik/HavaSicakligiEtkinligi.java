
package patikaapratik;

import java.util.Scanner;

/**
 *
 * @author Rumeysa
 */
public class HavaSicakligiEtkinligi {
      public static void main(String[] args) {
          
        int heat;

        Scanner inp =new Scanner(System.in);
        System.out.print("Sıcaklık Giriniz : ");
        heat=inp.nextInt(); //sıcaklık değerini kullanıcıdan istiyoruz

        //girilen sıcaklığa göre etkinlik önerme
        if(heat<=5){
            System.out.println("Kayak yapabilirsiniz");
        }else if(heat<=15){
            System.out.println("Sinemaya gidebilirsiniz");
        }else if(heat<=25){
            System.out.println("Pikniğe gidebilirsiniz");
        }else{
            System.out.println("Yüzmeye gidebilirsiniz");  
        }
    }
    
}
