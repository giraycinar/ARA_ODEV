package com.giray.Operatorler;

import java.util.Scanner;

public class Runner_Ornek_AritmetikOperatorler {
    public static void main(String[] args) {
/**
 * Aritmetik  Operatörler --> Toplam,fark,çarpma,bölme,mod alma
 * ORNEK--> Verilen sayýlarýn toplam, fark, çarpým, bölüm ve modunu bulunuz
 */

        //Toplama Operatörü-->
        int sayi1 = 89;
        int sayi2 = 56;
        int sayi3;
        int sayi4;
        double sayi5=98.55;
        double sayi6=3.14;
        //Toplama Operatörü-->
        System.out.println("Toplam Sonucu = " +  (sayi1+sayi2));
        //Fark Operatörü-->
        System.out.println("Farkýn Sonucu = " + (sayi1-sayi2));
        //Çarpým Operatörü-->
        System.out.println("Çarpým Sonucu = " + (sayi1*sayi2));
        //Bölüm Operatörü-->
        System.out.println("Bölüm Sonucu = " + (sayi5/sayi6));
        //Mod Alma Operatörü-->
        System.out.println("Modu = " + (sayi1%sayi2));

        //Stringlerde de toplama iþlemi þu þekilde yapabiliriz-->
        String kelime1 = "Hello";
        String kelime2 = "World";
        System.out.println("Kelimemiz : " + kelime1 + " " + kelime2);


        //Kullanýcýdan isteyerekte toplama yapabiliriz-->
        System.out.println("Lütfen 1. sayýyý giriniz...: ");
        sayi3 = new Scanner(System.in).nextInt();
        System.out.println("Lütfen 2. sayýyý giriniz...: ");
        sayi4 = new Scanner(System.in).nextInt();
        System.out.println("Ýstenilen Sayýlarýn Toplamý = " + (sayi3+sayi4));
        System.out.println("Ýstenilen Sayýlarýn Farký = " + (sayi3-sayi4));
        System.out.println("Ýstenilen Sayýlarýn Çarpýmý = " + (sayi3*sayi4));
        System.out.println("Ýstenilen Sayýlarýn Bölümü = " + (sayi3/sayi4));
        System.out.println("Ýstenilen Sayýlarýn Modu = " + (sayi3%sayi4));

    }
}
