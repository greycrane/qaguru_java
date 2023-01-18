package org.example;

public class Main {
    public static void main(String args[]) {
        boolean isOkay = true; // true or false
        byte varByte = 117; // -128 ... 127
        short varShort = 10000; // -32,768 ... 32,767
        int varInt = 10000000; // -2_147_483_648 ... 2_147_483_647
        long varLong = 327592579L; // -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
        float varFloat = 237864.324684F; // хранит 6-7 знаков после точки
        double varDouble = 3453.012345678901234; // хранит 15 знаков после точки
        char varChar = 't'; // один символ

        System.out.println("Сложение: " + (varByte + 1));
        System.out.println("Вычитание: " + (varShort - (short)varByte));
        System.out.println("Умножение: " + (varLong * varByte));
        System.out.println("Деление: " + (varFloat / varDouble));
        System.out.println("Остаток от деления: " + (varInt % varByte));

        System.out.println("Переполнение: " + (byte) (varByte + 11));

        int a = 10;
        int b = 14;
        int c = 9;
        int d = 10;
        if (a > b || c != d) {
            System.out.println("Логический набор 1");
        } else if (b <= ++c && isOkay) {
            System.out.println("Логический набор 2");
        } else {
            System.out.println("Логический набор 3");
        }

        System.out.println("int + double: " + (varInt + varDouble));
        System.out.println("float * short: " + (varFloat % varShort));
    }
}
