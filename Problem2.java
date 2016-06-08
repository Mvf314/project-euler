package com.mvf314.euler;

public class Problem2 {

    public static void main(String[] args) {

        int num = 1;
        int temp = 0;
        int sum = 0;

        while (num < 4000000) {
            if ((num & 1) == 0) {
                sum += num;
            }
            num += temp;
            temp = num - temp;
        }

        System.out.println(sum);

    }

}
