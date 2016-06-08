package com.mvf314.euler;

public class Problem4 {

    public static void main(String[] args) {
        int largest = 0;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (i * j == reverseInt(i * j)) {
                    if (i * j > largest) {
                        largest = i * j;
                    }
                }
            }
        }
        System.out.println("The largest palindrome is: " + largest);
    }

    public static int reverseInt(int n) {
        char[] chArr = Integer.toString(n).toCharArray();
        int[] arr = new int[chArr.length];
        String temp = "";
        for (int i = 0; i < chArr.length; i++) {
            arr[i] = (Character.getNumericValue(chArr[i]));
        }
        for (int i = 0; i < arr.length / 2; i++) {
            arr[arr.length - i - 1] = arr[arr.length - i - 1] ^ arr[i];
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[arr.length - i - 1] ^ arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            temp += arr[i];
        }
        return Integer.parseInt(temp);
    }
}