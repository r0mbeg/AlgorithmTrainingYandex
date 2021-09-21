package com.company.hometask2;
import java.util.ArrayList;
import java.util.Scanner;

public class Task_A {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        ArrayList<Integer> sas = new ArrayList<>();
        int max = -1;
        int max_count = 0;
        do {
            x = sc.nextInt();
            if (x != 0) {
                sas.add(x);
                if (x > max) {
                    max_count = 1;
                    max = x;
                } else if(max == x) {
                    max_count++;
                }
            }
        } while (x != 0);



        System.out.println(max_count);

    }
}
