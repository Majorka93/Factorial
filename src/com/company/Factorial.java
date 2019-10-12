package com.company;

import java.util.Scanner;

public class Factorial {
    public static void main(String... args) throws Exception {
        var scanner = new Scanner(System.in);

        System.out.println("Введите число n для вычисления факториала");
        var n = 3;

        if (n < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else if (n > 12) {
            System.out.println("Вы ввели слишком большое число");
        } else {
            var result = 1;
            for (var i = 2; i <= n; i += 1) {
                result *= i;
            }
            System.out.println(n + "! = " + result);
        }
    }
}
