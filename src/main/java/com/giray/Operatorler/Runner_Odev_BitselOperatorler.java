package com.giray.Operatorler;

public class Runner_Odev_BitselOperatorler {
    public static void main(String[] args) {

  /**  (~)  --> Bütün bitlerin tersini alır. 1 ise 0 olarak çevirir, 0 ise 1 olarak çevirir.
   *   (&)  --> Bitsel olarak “ve” işlemini yerine getirir.
   *   (|)  --> Bitsel “veya” anlamına gelir.
   *   (>>) --> Bitsel olarak sayısı istenilen değer kadar sayıyı sağa kaydırır.
   *   (<<) --> Bitsel olarak sayısı istenilen değer kadar sayıyı sola kaydırır.
   *
   */
        System.out.println(11<<2); //  44 Olarak Ekrana Yazdırır.
        System.out.println(9>>2); // 2 Olarak Ekrana Yazdırır.

        /**
         *   9 sayısının binary karşılığı 1011‘e karşılık gelir.
         *   Bu sayıyı 2 bit sağa kaydıracak olursak en sağda bulunan
         *   2 bit kaybolur ve kalan bitler 2 basamak sağa kaymış olur.
         *   Yeni ortaya çıkacak sayımız 0010 olur ve bu değerin karşılığı da 2’ye denk gelir.
         *   Aynı şekilde bu sefer işlemi 2 bit sola kaydırma şeklinde düşünürsek
         *   karşımıza çıkacak sayı değeri 101100 olur. Bu da 44 değerine karşılık gelir.
         *
         */

    }
}
