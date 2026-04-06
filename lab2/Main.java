package lab2;

import java.util.Scanner;

public class Main {

    int a, b;

    public static void main(String[] args) {
        Main obj = new Main();
        Helper helper = new Helper();
        helper.setData(obj);

        System.out.println("Енгізілген мәндер: a = " + obj.a + ", b = " + obj.b);
    }
}

class Helper {
    void setData(Main o) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a мәнін енгізіңіз: ");
        o.a = sc.nextInt();
        System.out.print("b мәнін енгізіңіз: ");
        o.b = sc.nextInt();
    }
}