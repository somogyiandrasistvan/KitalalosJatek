package kitalalosjatekk;

import java.util.Scanner;

public class KitalalosJatekk {

    public static void main(String[] args) {
        kirak();
        melyik();
        kever();
        eredmeny();
    }

    private static void kirak() {
        String lapok[] = new String[24];
        String szinek[] = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VIII"};
        int index = 0;
        for (String szin : szinek) {
            for (String ertek : ertekek) {
                lapok[index] = szin + "_" + ertek;
                index++;
            }
        }
        for (int i = 0; i < lapok.length; i++) {
            if (i % 3 == 0) {
                System.out.println("");
            }
            System.out.print(lapok[i] + "  ");
        }
    }

    private static void melyik() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("melyik oszlop (1-3): ");
        int szam = sc.nextInt();
        while (szam < 1 || szam > 3) {
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
