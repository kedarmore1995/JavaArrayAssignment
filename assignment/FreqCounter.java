package com.assignment;

//2) Java Program to find the frequency of each element in the array

import java.util.Arrays;

public class FreqCounter {
    public static void main(String[] args) {
        int arr2[] = {5, 3, 5, 4, 6, 5, 8, 7, 6};
        Arrays.sort(arr2);
        for (int i=0; i< arr2.length; i++){
            int n =1;
            while (i< arr2.length-1 && arr2[i]==arr2[i+1]){
                i++;
                n++;
            }
            System.out.println(arr2[i]+" : "+ n);
            n++;
        }
    }

    }

