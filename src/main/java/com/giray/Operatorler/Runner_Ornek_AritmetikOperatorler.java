package com.giray.Operatorler;

import java.util.Scanner;

public class Runner_Ornek_AritmetikOperatorler {
    public static void main(String[] args) {
/**
 * Aritmetik  Operat�rler --> Toplam,fark,�arpma,b�lme,mod alma
 * ORNEK--> Verilen say�lar�n toplam, fark, �arp�m, b�l�m ve modunu bulunuz
 */

        //Toplama Operat�r�-->
        int sayi1 = 89;
        int sayi2 = 56;
        int sayi3;
        int sayi4;
        double sayi5=98.55;
        double sayi6=3.14;
        //Toplama Operat�r�-->
        System.out.println("Toplam Sonucu = " +  (sayi1+sayi2));
        //Fark Operat�r�-->
        System.out.println("Fark�n Sonucu = " + (sayi1-sayi2));
        //�arp�m Operat�r�-->
        System.out.println("�arp�m Sonucu = " + (sayi1*sayi2));
        //B�l�m Operat�r�-->
        System.out.println("B�l�m Sonucu = " + (sayi5/sayi6));
        //Mod Alma Operat�r�-->
        System.out.println("Modu = " + (sayi1%sayi2));

        //Stringlerde de toplama i�lemi �u �ekilde yapabiliriz-->
        String kelime1 = "Hello";
        String kelime2 = "World";
        System.out.println("Kelimemiz : " + kelime1 + " " + kelime2);


        //Kullan�c�dan isteyerekte toplama yapabiliriz-->
        System.out.println("L�tfen 1. say�y� giriniz...: ");
        sayi3 = new Scanner(System.in).nextInt();
        System.out.println("L�tfen 2. say�y� giriniz...: ");
        sayi4 = new Scanner(System.in).nextInt();
        System.out.println("�stenilen Say�lar�n Toplam� = " + (sayi3+sayi4));
        System.out.println("�stenilen Say�lar�n Fark� = " + (sayi3-sayi4));
        System.out.println("�stenilen Say�lar�n �arp�m� = " + (sayi3*sayi4));
        System.out.println("�stenilen Say�lar�n B�l�m� = " + (sayi3/sayi4));
        System.out.println("�stenilen Say�lar�n Modu = " + (sayi3%sayi4));

    }
}
