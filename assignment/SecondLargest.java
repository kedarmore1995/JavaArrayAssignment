package com.assignment;
//Find 2nd Largest Number in an Array
public class SecondLargest {
    public static void main(String[] args) {
        int arr9[]={5,3,4,9,3,12,5,3,2};
        for (int i=0;i<arr9.length;i++){
            for (int j=i+1; j< arr9.length;j++){
                int temp=0;
                if (arr9[i]<arr9[j]){
                    temp=arr9[i];
                    arr9[i]=arr9[j];
                    arr9[j]=temp;
                }
            }
        }System.out.println("2nd Largest Number in an Array: "+arr9[1]);
    }
}
