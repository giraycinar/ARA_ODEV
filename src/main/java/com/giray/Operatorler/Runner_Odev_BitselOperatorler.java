package com.giray.Operatorler;

public class Runner_Odev_BitselOperatorler {
    public static void main(String[] args) {

  /**  (~)  --> B�t�n bitlerin tersini al�r. 1 ise 0 olarak �evirir, 0 ise 1 olarak �evirir.
   *   (&)  --> Bitsel olarak �ve� i�lemini yerine getirir.
   *   (|)  --> Bitsel �veya� anlam�na gelir.
   *   (>>) --> Bitsel olarak say�s� istenilen de�er kadar say�y� sa�a kayd�r�r.
   *   (<<) --> Bitsel olarak say�s� istenilen de�er kadar say�y� sola kayd�r�r.
   *
   */
        System.out.println(11<<2); //  44 Olarak Ekrana Yazd�r�r.
        System.out.println(9>>2); // 2 Olarak Ekrana Yazd�r�r.

        /**
         *   9 say�s�n�n binary kar��l��� 1011�e kar��l�k gelir.
         *   Bu say�y� 2 bit sa�a kayd�racak olursak en sa�da bulunan
         *   2 bit kaybolur ve kalan bitler 2 basamak sa�a kaym�� olur.
         *   Yeni ortaya ��kacak say�m�z 0010 olur ve bu de�erin kar��l��� da 2�ye denk gelir.
         *   Ayn� �ekilde bu sefer i�lemi 2 bit sola kayd�rma �eklinde d���n�rsek
         *   kar��m�za ��kacak say� de�eri 101100 olur. Bu da 44 de�erine kar��l�k gelir.
         *
         */

    }
}
