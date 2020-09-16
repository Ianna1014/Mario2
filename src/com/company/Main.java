package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        do {
            System.out.print("Size: ");
            num = keyboard.nextInt();
        } while (num < 1 || num > 8);
        {
            for (int x= 0; x<= num; x++) {
                for (int y = 1; y <= x; y++) {
                    System.out.print("*");

                }
                for (int y = x * 2; y < num * 2; y++) {
                    System.out.print(" ");

                }
                for (int z = x; z >= 1; z--) {
                    System.out.print("*");

                }
                System.out.print("\n");
            }
        }
    }
}

