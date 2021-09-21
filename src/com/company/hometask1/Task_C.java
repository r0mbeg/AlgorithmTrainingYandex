package com.company.hometask1;

import java.util.Scanner;

public class Task_C {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if ((x > 12 & y < 13) | (y > 12 & x < 13) | x == y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
