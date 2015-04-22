package com.tw;

import java.util.*;

/**
 * Created by prateeks on 4/15/15.
 */
public class PrimeGenerator {

    public static void main(String args[]){
        printList(getListOfPrimeFactors(30));
    }

    public static <E> void printList(List<E> list){
        for(E element : list) {
            System.out.print(element.toString() + ", ");
        }
    }

    public static List<Integer> getListOfPrimeFactors(int n) {
        List<Integer> factors = getListOfFactors(n);
        return extractListOfPrimeNumbers(factors);
    }

    public static List<Integer> getListOfFactors(int number) {
        List<Integer> factors = new ArrayList<>();
        for(int divisor =1; divisor < (number/2)+1; divisor++) {
            if(isDivisble(number, divisor)){
                factors.add(divisor);
            }
        }
        factors.add(number);
        return factors;
    }

    public static boolean isDivisble(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    public static List<Integer> extractListOfPrimeNumbers(List<Integer> numbers) {
        List<Integer> primeNumbers = new ArrayList<>();
        for(int number : numbers) {
            if(isPrimeNumber(number)){
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public static boolean isPrimeNumber(int number){
        if(isUnit(number)||isZero(number)){
            return false;
        } else {
            return numberOfFactors(number)==2;
        }
    }

    public static boolean isUnit(int n) {
        return n==1;
    }

    public static boolean isZero(int n) {
        return n==0;
    }

    public static int numberOfFactors(int number){
        return getListOfFactors(number).size();
    }
}
