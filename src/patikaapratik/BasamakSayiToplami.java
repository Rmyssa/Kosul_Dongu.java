
package patikaapratik;

import java.util.Scanner;

/*Bir sayının basamak sayılarının toplamını hesaplayan program 

Örnek : 1643 = 1 + 6 + 4 + 3 = 14
 */
public class BasamakSayiToplami {
    
      public static void main(String[] args) {
        int sayi,basamakToplami= 0, sayiDegeri;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen Basamak toplamını hesaplamak istediginiz sayiyi giriniz:");
        sayi = input.nextInt();

        while (sayi != 0){
            sayiDegeri = sayi % 10;
            basamakToplami += sayiDegeri;
            sayi = sayi / 10;
        }
        System.out.println(basamakToplami);
    }
    
}
