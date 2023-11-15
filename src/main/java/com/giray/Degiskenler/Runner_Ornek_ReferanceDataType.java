package com.giray.Degiskenler;

public class Runner_Ornek_ReferanceDataType {
    public static void main(String[] args) {

        /**
         * Array, Interface ve Class olarak tan�mlayabilece�imiz 3 referans tipi mevcuttur.
         * Referans tiplerde, ilkel tiplerden farkl� olarak yap�lan i�lemler de�i�kenin kendisi ile yap�l�r.
         * Referans veri tiplerinde de�i�kenlerin adresleri tutulur.
         * Tan�mlamak i�in new anahtar s�zc��� kullan�l�r.
         * Son olarak referans tipler belle�in heap alan�nda tutulurlar.
         */

        // Referans Veri Tipleri (String ile s�n�rl�):
        String myText="Hello World !",myWeb="www.giraycinar.com.tr";
        System.out.println("Web Adresi = " + myWeb);
        System.out.println("Text = " + myText);
    }
}
