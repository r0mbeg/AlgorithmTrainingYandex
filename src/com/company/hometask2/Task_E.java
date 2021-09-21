package com.company.hometask2;

import java.util.Scanner;

public class Task_E {
    public static void main(String[] args) {
        int n;//число папок
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] sas = new int[n];//число дипломов в каждой папке
        int max = -1;
        int max_index = 0;
        for (int i = 0; i < n; i++) {
            sas[i] = sc.nextInt();
            if (sas[i] > max) {
                max = sas[i];
                max_index = i;
            }
        }
        int res = 0;

        for (int i = 0; i < n; i++) {
            if (i != max_index) {
                res = res + sas[i];
            }
        }

        System.out.println(res);

    }
}
