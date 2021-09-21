package com.company.hometask1;
import java.util.Scanner;

public class Task_D {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//число учеников

        int[] sas = new int[N];//координанты учеников

        for (int i = 0; i < N; i++){
            sas[i] = sc.nextInt();
        }

        System.out.println(sas[N / 2]);
    }
}
