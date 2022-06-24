package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s= new Scanner(System.in);
        int [] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("Number of times you want to rotate the array");
        int k=s.nextInt();
        int temp=0;
        for(int i=0;i< k;i++){
            for(int j=arr.length-1;j>0;j--){
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
