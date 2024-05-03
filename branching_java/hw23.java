/*
Design a Flowchart and then write a Java code of a program that takes 
an integer number as user input and then determines if that number is
divisible by both 5 and 7; otherwise display “No”. For example, 
numbers like 35, 70, 105, 140, 175, 210, 245, 280 etc. can be divisible by both 5 and 7. 
*/

import java.util.Scanner;

public class hw23 {
  public static void main (String [] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println ("enter your number: ");
    int num = sc.nextInt();
    
    if (num % 5 == 0 && num % 7 == 0) {
    System.out.println ("Divisible by Both");
    } else if (num % 5 == 0) {
    System.out.println("Invalid: Divisible by 5 only");
    } else if (num % 7 == 0) {
    System.out.println("Invalid: Divisible by 7 only");
    } else {
    System.out.println("No");}
    sc.close ();
  }
}
