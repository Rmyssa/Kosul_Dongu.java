
package patikaapratik;

import java.util.Scanner;

/* girilen sayıya kadar olan 4 ve 5'in kuvvetlerini 
ekrana yazdıran programı yazıyoruz.
 */
public class DortVeBesinKatlari {
    public static void main(String[] args) {
        int sayi;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Lütfen Sayi giriniz");
        sayi = input.nextInt();
        
            System.out.println("4'ün " + sayi +"sayısına kadar olan katları:");
            for (int i = 1; i <= sayi; i *= 4) {
                System.out.println(i);
            }
            System.out.println("5'in " + sayi +"sayısına kadar olan katları:");
            for (int i = 1; i <= sayi; i *= 5) {
                System.out.println(i);
            }
    }
    
}
