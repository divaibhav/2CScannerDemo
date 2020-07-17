/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 16-Jul-20
 *  Time: 12:11 PM
 */

/*
An Application to demonstrate use of Scanner class.
Create an application to accept firstname, rollNumber, percentage,
section, year, course from user. And display the output in the below format.
Output
First Name : Vaibhav
rollNUmber : 81
Percentage : 66.31
Section : G
Year : 2
Course : B.Tech CSE
 */

import java.util.Scanner;

public class DemoScannerQue {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your firstName");
        String firstName = object.next();
        System.out.println("enter your rollNumber");
        int rollNUmber = object.nextInt();
        System.out.println("enter your percentage");
        double per = object.nextDouble();
        System.out.println("enter your section");
        String section = object.next();
        System.out.println("enter your course year");
        int year = object.nextInt();
        object.nextLine();
        System.out.println("enter your course");
        String course = object.nextLine();

        //output
        System.out.println("FirstName : " + firstName);
        System.out.println("Roll Number : " + rollNUmber);
        System.out.println("Percentage : " + per);
        System.out.println("Section : " + section);
        System.out.println("Year : " + year);
        System.out.println("Course : " + course);

    }
}
