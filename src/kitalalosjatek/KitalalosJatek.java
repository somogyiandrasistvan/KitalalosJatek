package kitalalosjatek;

public class KitalalosJatek {

    public static void main(String[] args) {
        kirak();
        melyik();
        kever();
        eredmeny();
    }

    private static void kirak() {
        String lapok[] = new String[22];
        String szinek[] = {"P", "T", "Z", "M"};
        String[] ertekek = {"Asz", "Kir", "Fel", "X", "IX", "VII"};
        int i = 0;
        for (String szinek1 : szinek) {
            for (String ertekek1 : ertekek) {
                lapok[i] = ertekek1 + szinek1;
                i++;
            }
        }
        
        for (String lap : lapok) {
            System.out.println(lap);
        }

    }

    private static void melyik() {

    }

    private static void kever() {

    }

    private static void eredmeny() {

    }

}
