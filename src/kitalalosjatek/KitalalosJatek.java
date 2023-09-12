package kitalalosjatek;

import java.util.Random;
import java.util.Scanner;

public class KitalalosJatek {

    public static void main(String[] args) {
        String lapok[] = kirak();
        int szam = melyik();
        kever(szam, lapok);
        eredmeny();
    }

    private static String[] kirak() {
        String lapok[] = new String[22];
        String szinek[] = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "XIII"};
        int index = 1;
        for (String szin : szinek) {
            for (int e = 0; index < 22 && e < ertekek.length; e++) {
                lapok[index++] = szin + "_" + ertekek[e];

            }
        }
        for (int i = 1; i < lapok.length; i++) {
            System.out.printf("%-8s", lapok[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }

        return lapok;
    }

    private static int melyik() {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.print("Melyik oszlop (1-3): ");
        int szam = sc.nextInt();
        while (szam < 1 || szam > 3) {
            System.out.print("Melyik oszlop (1-3): ");
            szam = sc.nextInt();
        }

        return szam;
    }

    private static void kever(int szam, String[] lapok) {

        switch (szam) {
            case 3:
                harmadikOszlop(lapok);
        }
    }

    private static void harmadikOszlop(String[] lapok) {
        String[] csereLapok = new String[lapok.length];
        int szamol = 1;

        for (int i = 1; i < 8; i++) {
            int index = 20 - (i - 1) * 3;
            csereLapok[szamol] = lapok[index];

            index = 21 - (i - 1) * 3;
            csereLapok[szamol + 7] = lapok[index];

            index = 19 - (i - 1) * 3;
            csereLapok[szamol + 14] = lapok[index];
            szamol++;
        }

        for (int i = 1; i < csereLapok.length; i++) {
            System.out.printf("%-8s", csereLapok[i]);
            if (i % 3 == 0) {
                System.out.println("");
            }
        }
    }

    private static void eredmeny() {

    }

}
