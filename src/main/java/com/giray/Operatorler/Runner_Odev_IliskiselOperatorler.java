package com.giray.Operatorler;

public class Runner_Odev_IliskiselOperatorler {
    public static void main(String[] args) {
        /**
         * �fadelerin birbirleri ile ilgili olan durumlar�n� inceler.
         * �ki verinin kar��la�t�rmas�n� yapar.
         * D�nen de�er boolean t�r�ndeki true ya da false dur.
         */
        int sayi1=10;
        int sayi2=22;
        // K���kt�r Operat�r� (<)
        System.out.println(sayi1<sayi2);  //--> true
        // B�y�kt�r Operat�r� (>)
        System.out.println(sayi1>sayi2);  //--> false
        // E�ittir Operat�r� (==)
        System.out.println(sayi1==sayi2); //--> false (e�it de�iller)
        // K���k e�ittir Operat�r� (<=)
        System.out.println(sayi1<=sayi2); //--> true
        // B�y�k e�ittir Operat�r� (>=)
        System.out.println(sayi1>=sayi2); //--> false
        // E�it de�ildir Operat�r� (!=)
        System.out.println(sayi1!=sayi2); //--> true (e�it de�ildir do�ru)


    }
}
