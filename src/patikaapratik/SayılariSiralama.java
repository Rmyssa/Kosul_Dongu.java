
package patikaapratik;

import java.util.Scanner;

/*Girilen 3 sayıyı "küçükten büyüğe" sıralayan program
 * @author Rumeysa
 */
public class SayılariSiralama {
     public static void main(String[] args) {
        int sayi1 , sayi2, sayi3;

        Scanner inp =new Scanner(System.in);
        System.out.print("1.Sayıyı Gririniz :");
        sayi1=inp.nextInt();

        System.out.print("2.Sayıyı Giriniz :");
        sayi2=inp.nextInt();

        System.out.print("3.Sayıyı Giriniz :");
        sayi3=inp.nextInt();
        
        if(sayi1<sayi2 && sayi1<sayi3)
        {
            if(sayi3<sayi2)
            {
                System.out.println(sayi1+"<"+sayi3+"<"+sayi2);
            }else{
                System.out.println(sayi1+"<"+sayi2+"<"+sayi3);
            }
        }else if(sayi2<sayi1 && sayi2<sayi3)
        {
            if(sayi1<sayi3)
            {
                System.out.println(sayi2+"<"+sayi1+"<"+sayi3);   
            }else
            {
                System.out.println(sayi2+"<"+sayi3+"<"+sayi1);
            }
        }else if(sayi3<sayi1 && sayi3<sayi2)
        {
            if(sayi1<sayi2)
            {
                System.out.println(sayi3+"<"+sayi1+"<"+sayi2);
            }else
            {
                System.out.println(sayi3+"<"+sayi2+"<"+sayi1);
            }
        }else
        {
            System.out.println("Eşit sayılar girmeyiniz");
        }
        
        
    }
    
}
