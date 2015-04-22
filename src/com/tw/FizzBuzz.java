package com.tw;

/**
 * Created by prateeks on 4/15/15.
 */
public class FizzBuzz {
    public static void main(String args[]){
        fizzBuzz();
    }

    public static void fizzBuzz(){
        for(int i = 1; i<=100;i++) {
            boolean isNormal = true;
            if(isDivisbleBy3(i)){
                System.out.print("fizz");
                isNormal = false;
            } if(isDivisbleBy5(i)){
                System.out.print("Buzz");
                isNormal=false;
            }
            if(isNormal){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static boolean isDivisbleBy3(int number){
        return number % 3 == 0 ;
    }

    public static boolean isDivisbleBy5(int number){
        return number % 5 == 0 ;
    }
}
