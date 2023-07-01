
package patikaapratik;

import java.util.Scanner;

/*Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 * @author Rumeysa
 */
public class SinifGecme {
     public static void main(String[] args) {
         
        int dersSayisi=5, mat, fzk, trk, kim, mzk;
        double ort;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Matematik Dersinin notunu giriniz:\n ");
        mat = input.nextInt();
        
        if ((mat == 0) || (mat > 100)){
            System.out.println("Ders notu 100-0 aralığında olmalıdır. Yanlış Girdiğiniz için Bu ders notu ortalamaya eklenmeyecektir!!!");
            mat= 0;
            dersSayisi--;
        }
        System.out.println("lütfen Fizik Dersinin Notunu Giriniz:\n");
        fzk = input.nextInt();
        
        if ((fzk == 0) || (fzk > 100)) {
            System.out.println("Ders notu 100-0 aralığında olmalıdır. Yanlış Girdiğiniz için Bu ders notu ortalamaya eklenmeyecektir!!!");
            fzk = 0;
            dersSayisi--;
        }
        System.out.println("Lütfen Türkçe Dersinin Notunu Giriniz:\n");
        trk = input.nextInt();
        
        if ((trk == 0) || (trk > 100)) {
            System.out.println("Ders notu 100-0 aralığında olmalıdır. Yanlış Girdiğiniz için Bu ders notu ortalamaya eklenmeyecektir!!!");
            trk = 0;
            dersSayisi--;
        }
        System.out.println("Lütfen Kimya Dersinin Notunu Giriniz:\n");
        kim = input.nextInt();
        
        if ((kim == 0) || (kim > 100)) {
            System.out.println("Ders notu 100-0 aralığında olmalıdır. Yanlış Girdiğiniz için Bu ders notu ortalamaya eklenmeyecektir!!!");
            kim = 0;
            dersSayisi--;
        }
        System.out.println("Lütfen Müzik Dersinin Notunu Giriniz:\n");
        mzk = input.nextInt();
        
        if ((mzk == 0) || (mzk > 100)) {
            System.out.println("Ders notu 100-0 aralığında olmalıdır. Yanlış Girdiğiniz için Bu ders notu ortalamaya eklenmeyecektir!!!");
            mzk = 0;
            dersSayisi--;
        }
        
        ort = (mat + fzk + trk + kim + mzk) / dersSayisi;
        if (ort >= 55)
            System.out.println("Dersten Geçtiniz. Ortlamanız:\n" + ort );
        else System.out.println("Dersten Kaldınız. Ortalamanız:\n" + ort );
    }
    
}
