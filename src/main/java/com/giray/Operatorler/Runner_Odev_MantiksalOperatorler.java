package com.giray.Operatorler;

import java.util.Scanner;

public class Runner_Odev_MantiksalOperatorler {
    public static void main(String[] args) {

        /**
         * && --> "ve" baðlacý. Verilen 2 ifadeninde doðru olduðu koþullarda true deðeri döner.
         * || --> "veya" baðlacý. Verilen 2 ifadeden en az birisi doðru olduðu sürece true deðeri döner.
         * ! --> "deðil" operatörü. Verilen ifadenin deðilini alýr.
         * Kullanýcý adý ve þifre isteyen bir uygulama ile mantýksal operatörleri inceleyelim.
         * Ve deðil operatörüne küçük bir örnek ile göz atalým.
         */

        //********************************************************************

        // Deðiþken Tanýmlamasý:
        int sayi= 815;
        // Mantýksal Operatörlerden ! (deðil) kullanýmý þu þekildedir.
        if((sayi%2)!=0)
            System.out.println("Sayý Tektir.");
        else
            System.out.println("Sayý Çiftir.");

        //********************************************************************

        String kullaniciAdi = "giraycinar";
        String kullaniciAdi1;
        int sifre = 123456;
        int sifre1;
        System.out.println("Lütfen Kullanýcý Adýnýzý Giriniz : ");
        kullaniciAdi1 = new Scanner(System.in).nextLine();
        System.out.println("Lütfen Þifrenizi Giriniz : ");
        sifre1 = new Scanner(System.in).nextInt();
        // Uygulama giriþlerinde ad vi þifrenin ayný olmasý beklenir. o yüzden ve (&&) baðlacý kullandýk.
        if((kullaniciAdi.equals(kullaniciAdi1)) && (sifre==sifre1)){
            System.out.println("Giriþ Baþarýlý...");
        }
        else {
            System.out.println("Hatalý Giriþ... Lütfen Tekrar Deneyiniz...");
        }


    }
}
