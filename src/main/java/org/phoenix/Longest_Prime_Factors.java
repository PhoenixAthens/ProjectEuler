package org.phoenix;
import java.util.ArrayList;
public class Longest_Prime_Factors {
    public static void main(String...args){
        System.out.println(primes(13195L)); //6857
        System.out.println(primes(600851475143L));
        System.out.println(isPrime(35));
    }
    public static int primes(long n){
        int currentResult = 1;
        int sqrt = (int)Math.sqrt(n);
        for(int i=2;i<sqrt;i++){
            if(isPrime(i) && n%(long)i==0)currentResult=i;
        }
        return currentResult;
    }
    public static boolean isPrime(int n){
        int sqrt = (int)Math.sqrt(n);
        for(int i = 2; i <= sqrt; i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
