package com.giray.Degiskenler;

public class Runner_Odev_PrimitiveDataType {
    public static void main(String[] args) {
        /**
         * Byte -----------> Bellek üzerinde 1 byte yer kaplar.Tamsayý türünde -128 ile 127 arasýnda deðer alýr.
         * Short ----------> 16 bittir. Byte tipinde tanýmlanan sayýlardan daha büyük sayýlar tanýmlanabilir.
         *                   -32768 ile 32767 arasýnda deðerler tanýmlanabilir.
         * Integer (int) --> En fazla kullanýlan veri tipidir. Bellekte 4 Byte yer kaplar ve 32 bittir.
         *                   -2³¹ ile 2³¹-1 arasýnda deðerler tanýmlanabilir.
         * Long -----------> Uzunluðu 64 bittir. Tamsayý türünde -2?³ ile 2?³-1 arasýnda deðerler tanýmlanabilir.
         * Float ----------> Uzunluðu 32 bittir. Ondalýk sayý türünde -3.4*10³? ile 3.4*10³? arasýnda deðerler alýr.
         * Double ---------> Uzunluðu 64 bittir. Ondalýk sayý türünde -1.7*10³?? ile 1.7*10³?? arasýnda deðerler alýr.
         * Char -----------> Veri tipinin uzunluðu 16 bittir. Karakter türünde deðerler alýr.
         *                   Tanýmlama yapýlýrken yalnýz bir rakam, iþaret veya harf kullanýlabilir.
         *                   Yapýlan tanýmlama iþlemleri tek týrnak arasýnda yapýlmalýdýr.
         * Boolean --------> Diðer deðiþkenlerden daha farklý olarak sadece 2 deðer alýr.
         *                   Bu deðerler true veya false’dir. Bellekte bir bit yer kaplar.
         *                   Mantýksal tipler olarak da bilinir.
         *
         */
        //Ýlkel Veri Tipleri :
        byte myByte=88;
        short myShort=166;
        int myInt=5416;
        long myLong=94516;
        float myFloat= 415.5f;
        double myDouble=16.88;
        char myChar='X';
        boolean myBoolean=true;
        System.out.println("Byte Deðeri = " + myByte + "\nShort Deðeri:"+myShort+"\nInteger Deðeri:"+myInt+
                "\nLong Deðeri:"+ myLong+"\nFloat Deðeri:"+myFloat+"\nDouble Deðeri:"+myDouble+"\nChar Deðeri:"
                +myChar+"\nBoolean Deðeri:"+myBoolean);



        /**
         * Null Veri Tipleri --> Herhangi bir veriye sahip olmama durumuna verilen isimdir.
         * null ---> Referans türü için,
         * false --> Boolean veri tipi için,
         * 0 ------> Sayýsal veri tipleri için,
         * \u0000 -> Char veri tipi için kullanýlýr.
         */

    }
}
