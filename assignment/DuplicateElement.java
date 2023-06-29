package com.assignment;

import java.util.Arrays;

//8) Java Program to print the duplicate elements of an array
public class DuplicateElement {
    public static void main(String[] args) {
        int arr7[] = {5, 6, 3, 6, 5, 7, 1, 3, 2, 9};
        Arrays.sort(arr7);
        for (int i = 0; i < arr7.length; i++) {
            if ((i < arr7.length - 1) && (arr7[i] == arr7[i + 1])) {
                System.out.println(arr7[i]);

            }
        }
    }
}




