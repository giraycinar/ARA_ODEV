package com.giray.Degiskenler;

public class Runner_Odev_PrimitiveDataType {
    public static void main(String[] args) {
        /**
         * Byte -----------> Bellek �zerinde 1 byte yer kaplar.Tamsay� t�r�nde -128 ile 127 aras�nda de�er al�r.
         * Short ----------> 16 bittir. Byte tipinde tan�mlanan say�lardan daha b�y�k say�lar tan�mlanabilir.
         *                   -32768 ile 32767 aras�nda de�erler tan�mlanabilir.
         * Integer (int) --> En fazla kullan�lan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir.
         *                   -2�� ile 2��-1 aras�nda de�erler tan�mlanabilir.
         * Long -----------> Uzunlu�u 64 bittir. Tamsay� t�r�nde -2?� ile 2?�-1 aras�nda de�erler tan�mlanabilir.
         * Float ----------> Uzunlu�u 32 bittir. Ondal�k say� t�r�nde -3.4*10�? ile 3.4*10�? aras�nda de�erler al�r.
         * Double ---------> Uzunlu�u 64 bittir. Ondal�k say� t�r�nde -1.7*10�?? ile 1.7*10�?? aras�nda de�erler al�r.
         * Char -----------> Veri tipinin uzunlu�u 16 bittir. Karakter t�r�nde de�erler al�r.
         *                   Tan�mlama yap�l�rken yaln�z bir rakam, i�aret veya harf kullan�labilir.
         *                   Yap�lan tan�mlama i�lemleri tek t�rnak aras�nda yap�lmal�d�r.
         * Boolean --------> Di�er de�i�kenlerden daha farkl� olarak sadece 2 de�er al�r.
         *                   Bu de�erler true veya false�dir. Bellekte bir bit yer kaplar.
         *                   Mant�ksal tipler olarak da bilinir.
         *
         */
        //�lkel Veri Tipleri :
        byte myByte=88;
        short myShort=166;
        int myInt=5416;
        long myLong=94516;
        float myFloat= 415.5f;
        double myDouble=16.88;
        char myChar='X';
        boolean myBoolean=true;
        System.out.println("Byte De�eri = " + myByte + "\nShort De�eri:"+myShort+"\nInteger De�eri:"+myInt+
                "\nLong De�eri:"+ myLong+"\nFloat De�eri:"+myFloat+"\nDouble De�eri:"+myDouble+"\nChar De�eri:"
                +myChar+"\nBoolean De�eri:"+myBoolean);



        /**
         * Null Veri Tipleri --> Herhangi bir veriye sahip olmama durumuna verilen isimdir.
         * null ---> Referans t�r� i�in,
         * false --> Boolean veri tipi i�in,
         * 0 ------> Say�sal veri tipleri i�in,
         * \u0000 -> Char veri tipi i�in kullan�l�r.
         */

    }
}
