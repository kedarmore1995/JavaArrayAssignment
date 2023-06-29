package com.assignment;
//4) Java Program to print the smallest element in an array
public class SmallestElement {
    public static void main(String[] args) {
        int arr4[]={5,6,8,65,36,3,2,5};
        int min = arr4[0];
        for (int i=0; i< arr4.length; i++){
            if (arr4[i]<min){
                min=arr4[i];
            }
        }
        System.out.println("Smallest element of the array is : "+min);
    }
}
