package Acadamy;

import java.util.Scanner;

class DataTypesVariables {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // int a = 25;
        // int b = 10;
        // System.out.println(a + b);
        // b = 20;
        // System.out.println(b);
        // int mul = a * b;
        // System.out.println(mul); //25 *20 = 500;
        // System.out.println((a * b) / (a - b));


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 1st Number: ");
        int num = sc.nextInt();
        
        System.out.print("Enter Your 2nd Number: ");
        int num1 = sc.nextInt();

        int sum = num + num1;

        System.out.print("Total Sum is :" + sum);



    }
}
