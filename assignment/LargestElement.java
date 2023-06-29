package com.assignment;

//3) Java Program to print the largest element in an array
public class LargestElement{
    public static void main(String[] args) {
        int [] arr3={51,96,62,65,16,55,65,69,21,66};
        int max=arr3[0];
        for (int i=0; i<arr3.length; i++){
            if (arr3[i]>max){
                max=arr3[i];
            }
        }System.out.println("Largest element of the array is : "+max);
    }
}
