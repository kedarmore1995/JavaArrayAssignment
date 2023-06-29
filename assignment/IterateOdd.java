package com.assignment;
//7) Java Program to print the elements of an array present on odd position
public class IterateOdd {
    public static void main(String[] args) {
        int arr5[] = {4, 5, 6, 8, 0, 6, 3, 1, 2};
        System.out.print("Elements from Odd positions : ");
        for (int i = 0; i < arr5.length; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + arr5[i]);
            }
        }
    }
}