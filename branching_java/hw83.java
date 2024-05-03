/*
Write a Java program that reads three numbers and prints "All numbers are equal" 
if all three numbers are equal, "All numbers are different" if all three numbers 
are different and "Neither all are equal or different" otherwise
*/

import java.util.Scanner;

public class hw83  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three number: ");
        int a = sc.nextInt();
       
        int b = sc.nextInt();
       
        int c = sc.nextInt();
        
        if (a == b && b == c && c == a) {
        System.out.println ("All numbers are equal");
        } else if (a != b && b != c && c != a) {
        System.out.println ("All numbers are different");
        } else {
        System.out.println ("Neither all are equal or different");
        }
        sc.close ();
    }
}
