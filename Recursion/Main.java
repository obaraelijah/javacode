package Recursion;

public class Main {
    public static void main(String[] args) {
        //print numbers
        printNumbers(4);

        // get eyes
        System.out.println("Cat eyes: " + catEyes(10));


        // power
        System.out.println("Powers: " + power(3, 3));

        // factorial
        System.out.println("Factorial: " + factorial(4));
    }

    public static void printNumbers(int num ) {
        if(num == 0) {
            return;
        } else {
            System.out.println(num);
            printNumbers( num - 1);
        }
    }

    public static int catEyes(int cats) {
        if(cats == 0) {
            return 0;
        } else {
            return 2 + catEyes(cats - 1);
        }
    }

    public static int power(int base, int num) {
        if(num == 1) {
            return base;
        } else {
            return base * power(base, num - 1);
        }
    }

    public static int factorial(int num) {
        if(num == 0 || num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
