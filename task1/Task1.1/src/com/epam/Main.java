package com.epam;

public class Main {

    public static void main(String[] args) {

        int number = -123,
        numberPalind;
        numberPalind = ((number % 10) * 100) + ((number % 100) - (number % 10)) + (number / 100) ;
        System.out.println(" number = " + number);
        System.out.println(" numberPalind = " + numberPalind);
        System.out.println(" sub = " + (number - numberPalind));
    }
}
