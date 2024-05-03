/*
 Draw a flowchart and then write a calculator program in Java that takes two integers and an operator (+, -, *, /)
 as input and performs the corresponding calculation.
Please use the equals( ) method for string comparison. 
You can check the hint below:
*/

import java.util.Scanner;

public class hw13  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String x = sc.next();
        
       
           if (x.equals ( "+")) {
            System.out.println (num1 + num2);
        } else if (x.equals ( "-"))  {
            System.out.println (num1 - num2);
        } else if (x.equals ("*")) {
            System.out.println (num1 * num2);
        } else if (x.equals ("/")) {
            System.out.println (num1 / num2);
        } else {
            System.out.println("Invalid Operator");               
        }
        sc.close ();
    }
}


