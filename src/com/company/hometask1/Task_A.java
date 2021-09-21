package com.company.hometask1;

import java.util.Scanner;

public class Task_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();//код завершения задачи
        int i = sc.nextInt();//вердикт интерактора
        int c = sc.nextInt();//вердикт чекера
        int res;//итоговый вердикт

        if (i == 0) {
            if (r != 0) {
                res = 3;
            } else {
                res = c;
            }
        } else if (i == 1) {
            res = c;
        } else if (i == 4) {
            if (r != 0) {
                res = 3;
            } else {
                res = 4;
            }
        } else if (i == 6) {
            res = 0;
        } else if (i == 7) {
            res = 1;
        } else {
            res = i;
        }

        System.out.println(res);
    }
}
