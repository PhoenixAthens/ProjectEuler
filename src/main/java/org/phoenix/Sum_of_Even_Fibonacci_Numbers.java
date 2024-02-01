package org.phoenix;

public class Sum_of_Even_Fibonacci_Numbers {
    public static void main(String...args){
        int sum = 0;
        int currentFibValue = 0;
        int i = 1;
        while(currentFibValue<4_000_000){
            currentFibValue = linearFibonacciRecursion(i);
            i++;
            if(currentFibValue%2==0)sum+=currentFibValue;
        }
        if(currentFibValue%2==0)sum-=currentFibValue;
        System.out.println("Sum of Fibonacci numbers below 4,000,000 is "+sum);
    }
    //Sum of Fibonacci numbers below 4,000,000 is 4613732
    public static int linearFibonacciRecursion(int n){
        if(n==0){
            return 0;
        }else{
            return mainMeat(n)[1];
        }
    }
    public static int[] mainMeat(int n){
        if(n==0 || n==1){
            return new int[]{0,1};
        }else{
            int[] temp = mainMeat(n-1);
            return new int[]{temp[1],temp[0]+temp[1]};
        }
    }

}

