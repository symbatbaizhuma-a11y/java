package lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("x мәнін енгізіңіз: ");
        double x = sc.nextDouble();

        // f(x) = cos(x) + x + 5 − 27π
        double y = Math.cos(x) + x + 5 - 27 * Math.PI;

        System.out.println("f(x) = " + y);
    }
}2