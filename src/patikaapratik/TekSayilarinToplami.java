
package patikaapratik;

import java.util.Scanner;

/*tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve 
girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class TekSayilarinToplami {
     public static void main(String[] args) {
        int sayi;
        boolean sayiTürü = true;
        int toplam=0 ;
        
        Scanner input = new Scanner(System.in);
        
        while(sayiTürü) {
            System.out.println("Lütfen bir sayı giriniz:\t");
            sayi = input.nextInt();
            if ((sayi % 2 == 0) && (sayi % 4 == 0)){
                toplam += sayi;
            } else if (sayi % 2 != 0) {
                sayiTürü = false;
            }
        }
        System.out.println("Çift ve 4 ün katı olan sayilarin toplami:\t " + toplam);

    }
    
}
