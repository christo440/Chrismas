package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int largeArray[] = {2,4,6,8,10,12,16,20,18};
        int smallest = largeArray[0];
        int largest = largeArray[0];
        int sum,avg;
        sum = 0;
        for(int i = 0; i <= 8;i++){
            if(largeArray[i] < smallest) smallest = largeArray[i];
            if(largeArray[i] > largest) largest = largeArray[i];
        }
        for(int j=0; j <= largeArray.length-1;j++){
            sum += largeArray[j];

        }
        avg= sum/largeArray.length-1;
            System.out.println("The smallest value in the array " + smallest);
            System.out.println("The largest value in the array " + largest);
        System.out.println("The average value in the array " + avg);


    }


    }

