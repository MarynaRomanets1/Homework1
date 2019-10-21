package com.epam;

public class Main {

    public static void main(String[] args) {
	 int deposit = 10000;
	 int months = 6;
	 int percent = 12;
	 System.out.println("Your sum is " + deposit);
	 System.out.println("Percents per year are --> " + percent + "%");
	 System.out.println("Period is " + months + " months");
	 System.out.println("You can get " + ((deposit / 100 * percent) / 12 * months));
    }
}
