
package patikaapratik;

import java.util.Scanner;

/**
 *
 * @author Rumeysa
 */
public class UsluSayıHesaplama {
     public static void main(String[] args) {
        int a, b, sonuc=1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Üs bulma a^b olarak hesaplanır");
        System.out.println("Lütfen a sayisini giriniz");
        a = input.nextInt();
        
        System.out.println("Lütfen b sayisini giriniz");
        b = input.nextInt();
        
        for (int i= 1 ; i <= b; i++){
            sonuc = sonuc *a ;
        }
        System.out.println(sonuc);
    }
    
}
