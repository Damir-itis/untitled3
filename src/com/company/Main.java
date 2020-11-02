package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Система счисления :");
        int k=in.nextInt();
        System.out.println("Введите число :");
        int number=in.nextInt();
        int sum=0;
        int step=1;
        if ((number > 0) && (number%10>0)) {
            sum+=1;
        }
        if (step > 0) {
            while (number > 0) {
                if (step>1) {
                    sum+=(number % 10) * step;
                }
                number/=10;
                step*=k;
            }
        }
        System.out.println(sum);
    }
}
