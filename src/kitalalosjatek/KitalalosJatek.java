
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
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < szinek.length; j++) {
                for (int k = 0; k < ertekek.length; k++) {
                    lapok[i] = ertekek[k]+szinek[j];
                    System.out.print(lapok[i]+" ");
                }
            }
        }
       
    }

    private static void melyik() {
        
    }

    private static void kever() {
        
    }

    private static void eredmeny() {
        
    }
    
}
