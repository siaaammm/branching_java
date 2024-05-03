/*
Suppose you are hired by Swapno. Now, your task is to create a java program that will help the 
cashier calculate the change to be returned.
The program takes two inputs. First input is an integer number which is the amount of money
to be paid in taka and the second integer is 
the amount of money the customer gave to the cashier. Your program should print the following:

If the customer gave more money than the actual amount, print change the cashier should return in notes and coins.
If the customer gave less money than the amount to be paid, then print the amount the customer needs to pay. 
 
Consider the following denomination for notes and coins in taka:
Notes: 100, 50, 20, 10. 
Coins: 5, 2, 1.

*/

import java.util.Scanner;
public class hw73  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount the customer need to pay(Taka) ");
        int a = sc.nextInt();
        System.out.println("Enter the amount, customer gave(Taka) ");
        int b = sc.nextInt();
        int m = b - a;
        int n1 = m / 100;
        int n2 = m % 100;
        int n3 = n2 / 50;
        int n4 = n2 % 50;
        int n5 = n4 / 20;
        int n6 = n4 % 20;
        int n7 = n6 / 10;
        int n8 = n6 % 10;
        int n9 = n8 / 5;
        int n10 = n8 % 5;
        int n11 = n10 / 2;
        int n12 = n10 % 2;
        int n13 = n12 / 1;
        int n14 = n12 % 1;
        if (b > a) {
        System.out.println ("The returned amount is " + m + " taka");
        System.out.println ("100 taka note: " + n1);
        System.out.println ("50 taka note: " + n3);
        System.out.println ("20 taka note: " + n5);
        System.out.println ("10 taka note: " + n7);
        System.out.println ("5 taka note: " + n9);
        System.out.println ("2 taka note: " + n11);
        System.out.println  ("1 taka note: " + n13);
        } else if (a > b) {
         System.out.println ("Please pay " + (a - b) +" taka more.");
        } else {
        System.out.println ("The returned amount is 0 taka");
        }     
        sc.close ();
    }
}

