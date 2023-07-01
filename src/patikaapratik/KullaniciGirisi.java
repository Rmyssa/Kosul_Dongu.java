
package patikaapratik;

import java.util.Scanner;

/*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve 
unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, 
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan program
 * @author Rumeysa
 */
public class KullaniciGirisi {
      public static void main(String[] args) {
        String username, password, select, npassword;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        username=inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password=inp.nextLine();

        if(username.equals("patika") && password.equals("java101"))
        {
            System.out.println("Giriş Yaptınız.");
        }else if(!(password.equals("java101")))
        {
            System.out.println("Şifreyi Sıfırlamak İstermisiniz? E/H");
            select=inp.nextLine();
            switch(select)
            {   
                case "E" :
                    System.out.println("Yeni Şifrenizi Giriniz");
                    npassword=inp.nextLine();
                    if(npassword.equals("java101"))
                    {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre oluşturun.");
                    }else
                    {
                        System.out.println("Şifre oluşturuldu.");
                    }
                    break;
                    
                case "H":
                    System.out.println("Tekrar deneyiniz"); 
                    break;
                default:
                    System.out.println("Gecerli bir değer giriniz");
                    break;       
            }
        }else if(!(username.equals("patika")))
        {
            System.out.println("Kulalnıcı adını hatalı girdiniz");
        }else
        {
            System.out.println("Kullanıcı adı veya şifreyi hatalı girdiniz.");
        }
        
    }
    
}
