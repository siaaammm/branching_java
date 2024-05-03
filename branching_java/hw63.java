/*
Draw a flowchart and java program that takes 3 float numbers as 
input from the user and prints the maximum and minimum number from the inputs.
*/

import java.util.Scanner;

public class hw63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();
        System.out.print("Enter second number: ");
        float b = sc.nextFloat();
        System.out.print("Enter third number: ");
        float c = sc.nextFloat();
        
        if (a > b && a > c) {
        System.out.println ("Maximum number is " + a);
        } else if (b > a && b > c) {
        System.out.println ("Maximum number is " + b);
        } else if (c > a && c > b) {
        System.out.println ("Maximum number is " + c);
        }
        
        if (a < b && a < c) {
        System.out.println ("minimum number is " + a);
        } else if (b < a && b < c) {
        System.out.println ("minimum number is " + b);
        } else if (c < a && c < b) {
        System.out.println ("minimum number is " + c);
        }  
        sc.close ();
    }
}
