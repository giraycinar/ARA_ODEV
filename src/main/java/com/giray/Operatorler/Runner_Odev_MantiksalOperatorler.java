package com.giray.Operatorler;

import java.util.Scanner;

public class Runner_Odev_MantiksalOperatorler {
    public static void main(String[] args) {

        /**
         * && --> "ve" ba�lac�. Verilen 2 ifadeninde do�ru oldu�u ko�ullarda true de�eri d�ner.
         * || --> "veya" ba�lac�. Verilen 2 ifadeden en az birisi do�ru oldu�u s�rece true de�eri d�ner.
         * ! --> "de�il" operat�r�. Verilen ifadenin de�ilini al�r.
         * Kullan�c� ad� ve �ifre isteyen bir uygulama ile mant�ksal operat�rleri inceleyelim.
         * Ve de�il operat�r�ne k���k bir �rnek ile g�z atal�m.
         */

        //********************************************************************

        // De�i�ken Tan�mlamas�:
        int sayi= 815;
        // Mant�ksal Operat�rlerden ! (de�il) kullan�m� �u �ekildedir.
        if((sayi%2)!=0)
            System.out.println("Say� Tektir.");
        else
            System.out.println("Say� �iftir.");

        //********************************************************************

        String kullaniciAdi = "giraycinar";
        String kullaniciAdi1;
        int sifre = 123456;
        int sifre1;
        System.out.println("L�tfen Kullan�c� Ad�n�z� Giriniz : ");
        kullaniciAdi1 = new Scanner(System.in).nextLine();
        System.out.println("L�tfen �ifrenizi Giriniz : ");
        sifre1 = new Scanner(System.in).nextInt();
        // Uygulama giri�lerinde ad vi �ifrenin ayn� olmas� beklenir. o y�zden ve (&&) ba�lac� kulland�k.
        if((kullaniciAdi.equals(kullaniciAdi1)) && (sifre==sifre1)){
            System.out.println("Giri� Ba�ar�l�...");
        }
        else {
            System.out.println("Hatal� Giri�... L�tfen Tekrar Deneyiniz...");
        }


    }
}
