package com.giray.Operatorler;

public class Runner_Odev_IliskiselOperatorler {
    public static void main(String[] args) {
        /**
         * Ýfadelerin birbirleri ile ilgili olan durumlarýný inceler.
         * Ýki verinin karþýlaþtýrmasýný yapar.
         * Dönen deðer boolean türündeki true ya da false dur.
         */
        int sayi1=10;
        int sayi2=22;
        // Küçüktür Operatörü (<)
        System.out.println(sayi1<sayi2);  //--> true
        // Büyüktür Operatörü (>)
        System.out.println(sayi1>sayi2);  //--> false
        // Eþittir Operatörü (==)
        System.out.println(sayi1==sayi2); //--> false (eþit deðiller)
        // Küçük eþittir Operatörü (<=)
        System.out.println(sayi1<=sayi2); //--> true
        // Büyük eþittir Operatörü (>=)
        System.out.println(sayi1>=sayi2); //--> false
        // Eþit deðildir Operatörü (!=)
        System.out.println(sayi1!=sayi2); //--> true (eþit deðildir doðru)


    }
}
