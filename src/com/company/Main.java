package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číšlo: ");
        float a = sc.nextInt();
        float celkem = 0;

        for (int i = 0; i < a; i++) {
            float odecteni = i + 1;
            float vysledek = 1 / odecteni;
            System.out.println("1/" + (i+1) + " => " + vysledek);
            celkem = celkem + vysledek;
        }
        System.out.println("Celkem => " + celkem);
    }
}
