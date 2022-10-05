package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayilar[] = new int[3];

        System.out.println(sayilar); // [I@6442b0a6
        // non-primitive türündeki dataları her zaman doğrudan yazdıramayabiliriz.
        // Array'i yazdırmak istersek Arrays classından yardım isteriz.

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar[2] = 10;
        sayilar[0] = 5;
        sayilar[1] = 3;

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10]

        String sinifList[] = {"Ali", "Ayşe", "Ahmet"};
        System.out.println(Arrays.toString(sinifList)); // [Ali, Ayşe, Ahmet]

        sinifList[1] = "Hasan";

        System.out.println(Arrays.toString(sinifList)); // [Ali, Hasan, Ahmet]

        System.out.println(sinifList[1]); // Hasan'ı yazdıralım

    }
}
