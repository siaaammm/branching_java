/*
Draw the flowchart and then write the Java code of a program that calculates the tax and prints it as follows:
a) No tax if you get paid less than 10,000
b) 5% tax if you get paid between 10,000 and 20,000 (both inclusive)
c) 10% tax if you get paid more than 20,000
d) NO TAX IF YOU ARE LESS THAN 18 YEARS OLD.

*/

import java.util.Scanner;

public class hw53 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your salary");
        int s = sc.nextInt();
        System.out.println("enter your age");
        int a = sc.nextInt();

        double t1 = s * .05;
        double t2 = s * .10;

        if (a >= 18) {
            if (s > 10000) {
              if (s >= 10000 && s <= 20000) {
                    System.out.println("Your Tax amount is " + t1);
                } else if (s > 20000) {
                    System.out.println("Your Tax amount is " + t2);
                }
            } else {
                System.out.println("Your Tax amount is 0 Tk");
            }
        } else {
            System.out.println("Your Tax amount is 0 Tk");
        }
        sc.close ();
    }
}


