package com.company.hometask1;

import java.util.Scanner;

public class Task_B {

    public static void main(String[] args) {
        int n; //число станций
        int a; //станция отправления
        int b; //станция прибытия

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();

        //длины дуг
        int x = -1;
        int y = -1;


        if (a < b) {
            x = b - a - 1;
            y = n - (b - a) - 1;
        } else if (b < a) {
            x = a - b - 1;
            y = n - (a - b) - 1;
        }

        System.out.println(Math.min(Math.abs(x), Math.abs(y)));




    }
}