//Klavyeden girilen n . Dereceden polinom hesabı
package ornek7_10;

import java.util.Scanner;

public class ornek7_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Denklem Derecesini Giriniz :");
        int derece = input.nextInt();

        double dizi[] = new double[derece + 1];

        for (int i = 0; i <= derece; i++) {

            System.out.print("X^" + i + " ' nin Katsayısı :");
            dizi[i] = input.nextDouble();
        }
        System.out.println("Hesaplanacak X Değerini Giriniz :");
        double x = input.nextDouble();

        double toplam = dizi[0];

        for (int i = 0; i <= derece; i++) {

            toplam += dizi[i] * Math.pow(x, i);
        }

        System.out.println("\ny(" + x + ")=" + toplam);

    }
}
