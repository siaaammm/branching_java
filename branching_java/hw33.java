/*
eqn F(x) = { hw3_3 }
*/

import java.util.Scanner;

public class hw33 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter your number: ");
    int x = sc.nextInt();
    
        if (x < 0) {
    System.out.println ("Output: " + (2 * x) );
    } else if (x >= 0 && x < 2) {
    System.out.println("Output: " + (x + 1) );
    } else if (x >= 2 && x < 5) {
    System.out.println("Output: " + (x*x - 1) );
    } else if (x >= 5) {
    System.out.println("Output: " + (3*x*x + 2) );
    } 
    sc.close ();
  }
}
