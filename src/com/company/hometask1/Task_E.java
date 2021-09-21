package com.company.hometask1;

import java.util.Scanner;

public class Task_E {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt(); //длина катетов
        //координаты точки
        int x = sc.nextInt();
        int y = sc.nextInt();
        double l1;//расстояние до A
        double l2;//расстояние до B
        double l3;//расстояние до C


        if (x >= 0 && y >= 0 && x + y - d <= 0) {
            System.out.println(0);
        } else {
            l1 = Math.sqrt(x * x + y * y);
            l2 = Math.sqrt((x - d) * (x - d) + y * y);
            l3 = Math.sqrt((y - d) * (y - d) + x * x);

            double minLength = myMin(l1, l2, l3);

            if (l1 == minLength) {
                System.out.println(1);
            } else if (l2 == minLength) {
                System.out.println(2);
            } else if (l3 == minLength) {
                System.out.println(3);
            }
        }
    }

    public static double myMin(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }


}

