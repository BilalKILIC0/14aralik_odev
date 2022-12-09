package ornek7.pkg9;

import java.util.Scanner;

public class Ornek79 {

    //N elemanlı A ve B dizisinin Skaler Çarpımı
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Dizi Uzunluğu Aldık
        System.out.println("Lütfen Bir Dizi Uzunluğu Giriniz :");
        int uzunluk = input.nextInt();

        //Toplam Değişkenini Tanımladık
        int toplam = 0;

        //A Ve B Dizisini Oluşturduk
        int A[] = new int[uzunluk];
        int B[] = new int[uzunluk];

        //For döngüsü ile A Ve B Dizisinin Elelmanlarını Kulanıcıdan Aldık
        for (int i = 0; i < uzunluk; i++) {

            System.out.print("A Dizisinin " + (i + 1) + " . Elemanını Giriniz :");
            A[i] = input.nextInt();
            System.out.print("B Dizisinin " + (i + 1) + " . Elemanını Giriniz :");
            B[i] = input.nextInt();
        }

        //Toplamı Hesaplattık
        for (int i = 0; i < uzunluk; i++) {

            toplam += A[i] * B[i];

        }

        //Bulduğumuz Skaler Çarpımı Ekrana Yazdırdık
        System.out.println("\nA X B İşleminin Sonucu : " + toplam);

    }

}
