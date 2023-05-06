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

        //fibonnacci
        System.out.println("Fibonnacci: " + fibonacci(6));

        //6
        System.out.println("Mobile speakers: " + mobileSpeakers(4));

        //sum
        System.out.println("Sum: " + sum(145));

        //count5
        System.out.println("Number: " + count5(15547845));
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

    public static int fibonacci(int num) {
        if(num == 0 ) {
            return 0;
        } if(num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static int mobileSpeakers(int mobiles) {
        if(mobiles == 0) {
            return 0;
        } else {
            if(mobiles % 2 == 0) {
                return 2 + mobileSpeakers(mobiles - 1);
            } else {
                return 1 + mobileSpeakers(mobiles - 1);
            }
        }
    }

    public static int sum(int num) {
        if(num <= 9) {
            return num;
        } else {
            return num % 10 + sum(num / 10);
        }
    }

    public static int count5(int num) {
        if (num <= 9) {
            if (num == 5) {
                return 1;
            } else {
                return 0;
            }
        } else {
            if (num % 10 == 5) {
                return 1 + count5(num / 10);
            } else {
                return 0 + count5(num / 10);
            }
        }
    }
}
