package com.giray.Operatorler;

public class Runner_Odev_TekliOperatorler {
    public static void main(String[] args) {

        /**
         * Tekli Operatörler--> - veya + konulmasý, ilgili operandýn deðerini negatif veya pozitif yapmak için kullanýlýr.
         * Arttýrma Operatörü (++), Azaltma Operatörü (--)
         * a --> int bir deðer olsun,
         * Sonrasýnda Artýþ veya Azaltma (a++ / a--)
         * Öncesinde Arttýrma veya Azaltma(++a / --a)
         * ! --> Deðil Operatörü
         */

        int sayi1=50;
        int sayi2=425;
        int sayi3=45;
        int sayi4 =5;
        boolean kosul=true;
        System.out.println("sayi1 1 arttý" + " " + ++sayi1);
        System.out.println("sayi2 iþlem sonrasýnda 1 artacak " + " " + sayi2++);
        System.out.println("Sayý arttý "+ sayi2);
        System.out.println("sayi3 1 azaldý" + " " + --sayi3);
        System.out.println("sayi4 iþlem sonrasýnda 1 azalacak " + " " + sayi4--);
        System.out.println("Sayý azald "+ sayi4);
        //Mantýksal deðil operatörü. Koþulun deðilini alýr.
        System.out.println("Deðil(!): " + !kosul);

        
    }

}
