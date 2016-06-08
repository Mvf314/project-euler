package com.mvf314.euler;

public class Problem3 {

    public static void main(String[] args) {

        long n = 600851475143L;

        long i = 2;

        while (i * i < n) {
            while (n % i == 0) {
                n /= i;
            }
            i += 1;
        }
        System.out.println(n);
    }

}
