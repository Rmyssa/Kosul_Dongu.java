
package patikaapratik;

import java.util.Scanner;

/*
 * @author Rumeysa
 */
public class HesapMakinesi {
     public static void main(String[] args) {
        int n1 , n2, select;

        Scanner inp =new Scanner(System.in);
        System.out.print("1.sayıyı giriniz : ");
        n1=inp.nextInt();
        
        System.out.print("2.sayıyı giriniz : ");
        n2=inp.nextInt();
        
        System.out.println("1-Toplama\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme");
        System.out.print("Seçiminiz : ");
        select=inp.nextInt();
        
        switch (select){
            case 1:
              System.out.println("Toplam : "+(n1+n2));
            break;
            case 2:
                System.out.println("Çıkarma : "+(n1-n2));
            break;
            case 3:
                System.out.println("Çarpma : "+(n1*n2));
            break;
            case 4:
                if(n2!=0)
                {
                System.out.println("Bölme : "+((double)n1/n2));
                }else
                {
                    System.out.println("0'a bölünemez.");
                }
            break;
            default:
                System.out.println("Geçerli bir değer giriniz.");            
        }
    
    }
}
