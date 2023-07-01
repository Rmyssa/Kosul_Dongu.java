
package patikaapratik;

import java.util.Scanner;

/*Aynı program içerisinde koşullu ifadeler kullanılarak, 
eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , 
küçük ise "Sınıfta Kaldı" yazsın.*/

public class NotOrtalama {

 
   public static void main(String[] args) {
    int mat , fzk , kmya , turk , mzk , tarh; // Değişkenler oluşturuldu.
    String ort;

    Scanner inp =new Scanner(System.in);
    
    //sınav sonuçları kullanıcıdan isteniyor.
    System.out.print("Matematik notunuzu giriniz : ");
    mat=inp.nextInt();
    
    System.out.print("Fizik notunuzu giriniz : ");
    fzk=inp.nextInt();

    System.out.print("Kimya notunuzu giriniz : ");
    kmya=inp.nextInt();

    System.out.print("Türkçe notunuzu giriniz : ");
    turk=inp.nextInt();

    System.out.print("Müzik notunuzu giriniz : ");
    mzk=inp.nextInt();

    System.out.print("Tarih notunuzu giriniz : ");
    tarh=inp.nextInt();

    int toplam =mat+fzk+kmya+turk+mzk+tarh;
    double sonuc = toplam/6; //ortalamayı buluyoruz.
    
    ort=(sonuc>60)? "Sınıfı Geçti":"Sınıfta Kaldı";
    System.out.println("Ortalama : "+sonuc+" "+ort);

    
  }
    }
    

