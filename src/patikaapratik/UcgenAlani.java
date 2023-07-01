
package patikaapratik;

import java.util.Scanner;

/*Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan program
 * @author Rumeysa
 */
public class UcgenAlani {
     public static void main(String[] args) {
        int kenar1, kenar2;
        double kenar3 , cevre , alan , u;

        //üçgen kenarlarını giriniz
        Scanner inp =new Scanner(System.in);
        System.out.print("1.Kenarı Giriniz : ");
        kenar1=inp.nextInt();
        
        System.out.print("2.Kenarı Giriniz : ");
        kenar2=inp.nextInt();
        
        kenar3=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));
        u=(kenar1+kenar2+kenar3)/2;
        cevre=2*u;//cevre hesaplama
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));//alan hesaplama
        
        System.out.println("Hipotenüs : "+kenar3);
        System.out.println("Çevre : "+cevre);
        System.out.println("Alan : "+alan);      
    }
    
}
