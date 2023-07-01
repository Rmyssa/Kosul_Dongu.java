
package patikaapratik;

import java.util.Scanner;

/*gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran program
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.

 * @author Rumeysa
 */
public class TaksimetreHesaplama {
      public static void main(String[] args) {
          
        double perKm=2.20 , startPrice=10 ,total;
        int km;
        Scanner inp =new Scanner(System.in);
        
        System.out.print("Gidilen Mesafeyi Giriniz : ");
        km=inp.nextInt();
        
        total=startPrice+(km*perKm);
        total=(total<20)? 20:total;
        System.out.println("Taksimetre Ücreti : "+total);
    }
    
}
