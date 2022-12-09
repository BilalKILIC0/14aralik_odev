//Klavyeden Girilen A dizisinin Pozitif elemanlarını B dizisine , Negatif elemanları C dizisine ekleyen program 
package ornek7_10;

import java.util.Scanner;

public class pozitf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Değişkenleri Tanımladık
        int bindeks = 0;
        int cindeks = 0;

        //Kulalnıcıdan Dizi Uzunluğunu Aldık
        System.out.println("Lütfen A Dizisinin Uzunluğunu Belirleyiniz :");
        int uzunluk = input.nextInt();

        //Dizileri Tanımladık
        int A[] = new int[uzunluk];
        int B[] = new int[uzunluk];
        int C[] = new int[uzunluk];

        //A dizisinin kullanıcının İsteğine Göre Doldurduk
        for (int i = 0; i <= A.length - 1; i++) {

            System.out.print("A Dizisinin " + (i + 1) + " . Elemanını Giriniz :");
            A[i] = input.nextInt();
        }

        //A Dizisindeki elemanların pozitif veya negatif olduklarını kontrol Ettik
        for (int i = 0; i <= A.length - 1; i++) {

            if (A[i] > 0) {

                B[i] = A[i];

            }
            if (A[i] < 0) {

                C[i] = A[i];

            }
        }
        System.out.println("***********************************");

        //B Dizisinin Elemanlarını yazdırdık ve İndekslerini Belirledik
        for (int i = 0; i <= B.length - 1; i++) {

            if (B[i] != 0) {

                System.out.println("B Dizisinin Elemanları : " + B[i] + " Ve İndeksi : " + bindeks);
                bindeks++;
            } else {
                bindeks++;
            }
        }
        System.out.println("***********************************");
        //C Dizisinin Elemanlarını Yazdırdık ve İndeksi Belirledik.
        for (int i = 0; i <= C.length - 1; i++) {

            if (C[i] != 0) {

                System.out.println("C Dizisinin Elemanları : " + C[i] + " Ve İndeksi : " + cindeks);
                cindeks++;
            } else {
                cindeks++;
            }
        }

    }
}
