package algoritmasorusu;

import java.util.Scanner;

public class AlgoritmaSorusu {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Metin girin:");
        String metin = scn.nextLine();
        String sesli = "aeiou";
        metin = metin.replace(" ", "");
        System.out.println(sonuc(metin, sesli));
    }

    static String sonuc(String metin, String sesli) {
        int seslisayisi = 0, sessizsayisi = 0;
        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < sesli.length(); j++) {
                if (metin.charAt(i) == sesli.charAt(j)) {
                    seslisayisi++;
                }
            }
        }
        sessizsayisi = metin.length() - seslisayisi;
        if (seslisayisi > sessizsayisi) {
            metin = metin.toLowerCase();
        } else {
            metin = metin.toUpperCase();
        }
        return metin;
    }
}
