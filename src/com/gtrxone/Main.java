package com.gtrxone;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,99,999));
    }

    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int lastDNum1 = num1%10;
            int lastDNum2 = num2%10;
            int lastDNum3 = num3%10;

            return  (lastDNum1==lastDNum2 || lastDNum1 == lastDNum3|| lastDNum2== lastDNum3);
        }
        return false;
    }
}
