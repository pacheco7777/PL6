package org.example;

public class NumeroEx2 {
    public boolean isPrime(int number){
        if (number <=1)
            return false;
        for(int i = 2 ;i<number;i++){
            if(number%i ==0){
                return false;
            }
        }
        return true;
    }
    public boolean isEven(int number){
        boolean par = false;
        if(number%2==0){
            par=true;
        }
        else {
            par = false;
        }
        return par;
    }
    public boolean isMultiple(int number, int divisor){
        boolean multiple = false;
        if(number%divisor==0){
            multiple = true;
        }
        else{
            multiple = false;
        }
        return multiple;
    }

}
