
package patikaapratik;

import java.util.Scanner;

/**
 *
 * @author Rumeysa
 */
public class YildizlarlaElmas {
      public static void main(String[] args) {
          
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int sayi = klavye.nextInt();
        
       
        for (int i = 0; i <= sayi; i++) // satır sayısını gosterıyor 
            {
            for (int j = 0; j < (sayi - i); j++) {
                System.out.print(" "); // boşlukları yazdırıyor
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // yıldızları yazdırıyor 
            }
            System.out.println(" "); //satır arasındakı boslugu yazdırıyor
        }
            
            for (int i = 1; i <= sayi - 1; i++) { // satır sayısını gosterıyor

                for (int j = 0; j < i; j++) { // boslukları yazdırıyor
                    System.out.print(" ");
                }
                for (int k = (sayi - i) * 2 - 1; k > 0; k--) {
                    System.out.print("*"); // yıldızları yazdırıyor
                }
                System.out.println(); // satır arasındakı boslugu yazdırıyor
            }
        }
    
}
