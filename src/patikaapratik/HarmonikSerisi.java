
package patikaapratik;

import java.util.Scanner;

/**
 *
 * @author Rumeysa
 */
public class HarmonikSerisi {
      public static void main(String[] args) {
        int sayi;
        double toplam = 0.0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen harmonik toplami hesaplamak istediğiniz sayiyi giriniz:");
        
        sayi = input.nextInt();
        for (int i =1 ; i <= sayi ; i++){
            toplam += (1.0 / i );
        }
        System.out.println("harmonik sayi toplami:\t " + toplam);
    }
    
}
