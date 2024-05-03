/*
Write a Java Program, that takes in a BRACU student ID as integer,
and prints out the year and the session the student enrolled in.
*/

import java.util.Scanner;

public class hw43 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your number: ");
        int id = sc.nextInt();

        int y = id / 1000000;
        int x = id / 100000;
        int s = x % 10;

        if (s == 1) {
            System.out.println("Student joined BRAC in Spring " + y);
        } else if (s == 2) {
            System.out.println("Student joined BRAC in Fall " + y);
        } else if (s == 3) {
            System.out.println("Student joined BRAC in Summer " + y);
        }
sc.close ();
    }
}
