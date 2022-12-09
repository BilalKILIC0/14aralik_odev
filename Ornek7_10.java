package ornek7_10;

import java.util.Scanner;

public class Ornek7_10 {

    //Klavyeden Girilen A elemanlı dizinin Aritmatik , Geometrik , Harmonik , Kontraharmonik Ortalamasını Hesaplayan Program.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Dizi Uzunluğunu Aldık
        System.out.println("A Dizisinin Eleman Sayısını Giriniz :");
        int terim = input.nextInt();

        //Diziyi Tanımladık
        int A[] = new int[terim];

        //Dizi Elemanlarını Aldık
        for (int i = 0; i < terim; i++) {

            System.out.print("A Dizisinin " + (i + 1) + " . Elemanını Giriniz :");
            A[i] = input.nextInt();

        }
        //Değişkenleri Tanımladık
        double Htaban = 0;
        double carpim = 1;
        int toplam = 0;
        double usttop = 0;

        double ArtOrt;
        double harOrt;
        double GeoOrt;
        double KHO;

        //İşlemleri Yaptırdık
        for (int i = 0; i <= A.length - 1; i++) {

            toplam += A[i];

            carpim *= A[i];

            Htaban += 1 / A[i];

            usttop += Math.pow(toplam, 2);

        }
        //Ekrana Yazdırdık

        ArtOrt = (double) toplam / terim;

        GeoOrt = (double) Math.pow(carpim, 1 / terim);

        harOrt = (double) terim / Htaban;

        KHO = (double) usttop / toplam;

        System.out.println("Dizinin Aritmatik Ortalaması :" + ArtOrt + " , Geometrik Ortalaması : " + GeoOrt + " , Harmonik Ortalaması :" + harOrt + " , KontraHarmonik Ortalamsı : " + KHO);

    }

}
