package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        int num, total = 0;

        //loop should start here

        int i = 10;
        while (i > 0) {
            System.out.println("Enter number: ");
            num = keyboard.nextInt();
            total += num;
            i--;
        }

        // loop should end here

        System.out.println("The total of all 10 numbers is " + total);

    }
}
