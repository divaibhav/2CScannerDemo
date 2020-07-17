/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 15-Jul-20
 *  Time: 1:15 PM
 */
/*
Application to demonstrate use of Scanner Class
Create an Application to accept name, age,
4-digit code, cpi, mobile no, passed and display these values
to user in the given format
Name : Ramesh Suresh
Age : 36
4-digit Code : 1122
cpi : 6.6
Mobile No : 9826798267
Passed : false
 */

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your full name");
        //declaring a String object to store full name
        String name = object.nextLine();
        System.out.println("Enter your age");
        byte age = object.nextByte();
        System.out.println("enter 4 digit code");
        short code = object.nextShort();
        System.out.println("Enter your CPI");
        double cpi = object.nextDouble();
        System.out.println("Enter your mobile number");
        long mobile = object.nextLong();
        System.out.println("Enter your exam status true for pass/false for fail");
        boolean passed = object.nextBoolean();
        //output
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("4-digit code : " + code);
        System.out.println("CPI : " + cpi);
        System.out.println("Mobile Number : " + mobile);
        System.out.println("Passed : " + passed);
    }
}
