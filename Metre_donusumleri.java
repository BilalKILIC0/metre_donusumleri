// Klavyeden metre cinsinden girilen uzunluğu , seçilen birime dönüştüren program.
package metre_donusumleri;
import java.util.Scanner;

/*
Adım 1: Başla 
Adım 2: Kullanıcıdan Metre değerini al
Adım 3: Kullanıcının Hangi uzunluk birimine döştürmeyi düşündüğünü sor 
Adım 4: Seçilen işleme göre gerekli işlemleri yap
Adım 5: Ekrana Yazdır 
Adım 6: Bitir 

Kusura Bakmayın aceleyle yazdım doğru olmaya bilir Algoritma
*/

public class Metre_donusumleri {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Metre Cinsinden Bir Uzunluk Giriniz :");
        float girilen = input.nextFloat();
        float sonuc;
        
        System.out.println("MM 'ye Çevirmek İçin 1\nCM 'ye Çevirmek İçin 2\nDM 'ye Çevirmek İçin 3\nKM 'ye Çevirmek İçin 4 Tuşuna Basınız.");
        int sayac = input.nextInt();
        
        if (sayac == 1)
        {
            sonuc =girilen*1000;
            System.out.println(sonuc+" MM 'dir.");
        }
        else if (sayac == 2)
        {
            sonuc =girilen*100;
            System.out.println(sonuc+" CM 'dir.");
        }
        else if (sayac == 3)
        {
            sonuc =girilen*10;
            System.out.println(sonuc+" DM 'dir.");
        }
        else {
            sonuc = girilen/1000;
            System.out.println(sonuc+" KM 'dir.");
        }
    }   
}
