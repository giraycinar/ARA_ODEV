package com.giray.Operatorler;

public class Runner_Odev_TekliOperatorler {
    public static void main(String[] args) {

        /**
         * Tekli Operat�rler--> - veya + konulmas�, ilgili operand�n de�erini negatif veya pozitif yapmak i�in kullan�l�r.
         * Artt�rma Operat�r� (++), Azaltma Operat�r� (--)
         * a --> int bir de�er olsun,
         * Sonras�nda Art�� veya Azaltma (a++ / a--)
         * �ncesinde Artt�rma veya Azaltma(++a / --a)
         * ! --> De�il Operat�r�
         */

        int sayi1=50;
        int sayi2=425;
        int sayi3=45;
        int sayi4 =5;
        boolean kosul=true;
        System.out.println("sayi1 1 artt�" + " " + ++sayi1);
        System.out.println("sayi2 i�lem sonras�nda 1 artacak " + " " + sayi2++);
        System.out.println("Say� artt� "+ sayi2);
        System.out.println("sayi3 1 azald�" + " " + --sayi3);
        System.out.println("sayi4 i�lem sonras�nda 1 azalacak " + " " + sayi4--);
        System.out.println("Say� azald "+ sayi4);
        //Mant�ksal de�il operat�r�. Ko�ulun de�ilini al�r.
        System.out.println("De�il(!): " + !kosul);

        
    }

}
