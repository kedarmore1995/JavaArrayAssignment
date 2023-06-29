package com.assignment;

//9) Java Program to sort the elements of an array in ascending order
public class SortAsc {
    public static void main(String[] args) {
        int arr8[] = {9, 8, 7, 4, 5, 6, 3};
        System.out.println("Array in ascending order: ");
        for (int i = 0; i < arr8.length; i++) {
            for (int j = i + 1; j < arr8.length; j++) {
                int temp = 0; // to store the value for a moment
                if (arr8[i] > arr8[j]) {
                    temp = arr8[i]; //value stored temporarily
                    arr8[i] = arr8[j]; //interchange the values
                    arr8[j] = temp;  // get smallest value ahead
                }
            }
//prints the sorted element of the array
            System.out.print(" "+arr8[i]);
        }
    }
}
