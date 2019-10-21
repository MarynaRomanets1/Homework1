package com.epam;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float weightLbs = 7.18F;
        System.out.println("You entered weight in Lbs --> " + weightLbs + " lbs");
        float lbsToKg = 2.2046F;
        float gram, kg;
        kg = (int)(weightLbs / lbsToKg);
        gram = (weightLbs / lbsToKg - kg) * 1000;
        gram = (int) gram / 1;
        System.out.println("This is " + kg + " kgs " + gram + " grams");

    }
}
