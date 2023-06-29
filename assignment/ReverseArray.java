package com.assignment;
//6) Java Program to print the elements of an array in reverse order
public class ReverseArray {
    public static void main(String[] args) {
        int arr6[]={1,2,3,4,5,6};
        System.out.print("Reverse Array : ");
        for (int i= arr6.length-1; i>=0; i--){
            System.out.print(" "+arr6[i]);
        }

    }
}
