package com.giray.Degiskenler;

public class Runner_Ornek_ReferanceDataType {
    public static void main(String[] args) {

        /**
         * Array, Interface ve Class olarak tanýmlayabileceðimiz 3 referans tipi mevcuttur.
         * Referans tiplerde, ilkel tiplerden farklý olarak yapýlan iþlemler deðiþkenin kendisi ile yapýlýr.
         * Referans veri tiplerinde deðiþkenlerin adresleri tutulur.
         * Tanýmlamak için new anahtar sözcüðü kullanýlýr.
         * Son olarak referans tipler belleðin heap alanýnda tutulurlar.
         */

        // Referans Veri Tipleri (String ile sýnýrlý):
        String myText="Hello World !",myWeb="www.giraycinar.com.tr";
        System.out.println("Web Adresi = " + myWeb);
        System.out.println("Text = " + myText);
    }
}
