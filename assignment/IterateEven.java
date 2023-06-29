package com.assignment;
//5) Java Program to print the elements of an array present on an even position

public class IterateEven {
    public static void main(String[] args) {
        int arr5[]={4,5,6,8,0,6,3,1,2};
        System.out.print("Elements from even positions : ");
        for (int i=0; i< arr5.length;  i++){
            if(i%2==0){
                System.out.print(" " + arr5[i]);
            }
        }
    }
}
