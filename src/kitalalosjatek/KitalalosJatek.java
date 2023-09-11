package kitalalosjatek;

import java.util.Scanner;

public class KitalalosJatek {

    public static void main(String[] args) {
        kirak();
        melyik();
        kever();
        eredmeny();
    }

    private static void kirak() {
        String lapok[] = new String[21];
        String szinek[] = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "XIII"};
        int index = 0;
        for (String szin : szinek) {
            for (int e = 0; index < 21 && e < ertekek.length; e++) {
                lapok[index++] = szin + "_" + ertekek[e];

            }
            for (int i = 0; i < lapok.length; i++) {
                if (i % 3 == 0) {
                    System.out.println("");
                }
                System.out.print(lapok[i] + "  ");
            }
        }
    }

    private static void melyik() {
        Scanner sc = new Scanner(System.in);
        System.out.print("meik oszlop (1-3): ");
        int szam = sc.nextInt();
        while (szam < 0 || szam > 3) {
            System.out.print("melyik oszlop (1-3): ");
            int szam2 = sc.nextInt();
            szam = szam2;
        }
    }

    private static void kever() {

    }

    private static void eredmeny() {

    }

}
