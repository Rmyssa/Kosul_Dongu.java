
package patikaapratik;

import java.util.Scanner;

/*Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program
𝜋 sayısını = 3.14 alınız.
Formül : (𝜋 * (r*r) * 𝛼) / 360
 * @author Rumeysa
 */
public class DaireAlaniCevresi {
      public static void main(String[] args) {
        double pi=3.14 , r , a , alan , cevre ;
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz : ");
        r=inp.nextDouble();
        
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a=inp.nextDouble();

        alan=pi*r*r*(a/360); //daire alanını hesaplama
        cevre=2*pi*r*(a/360);//daire çevresini hesaplama

        System.out.println("Alan : "+alan);
        System.out.println("Çevre : "+cevre);
    }
}
