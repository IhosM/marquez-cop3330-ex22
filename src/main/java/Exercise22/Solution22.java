/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise22;

import java.util.Scanner;

public class Solution22
{

    public static void main( String[] args )

        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter the first number: ");
            int number1 = scan.nextInt();


            System.out.println("Enter the second number: ");
            int number2 = scan.nextInt();

            while(number2 == number1)
            {
                System.out.println("That number was already entered, enter another number: ");
                number2 = scan.nextInt();
            }

            System.out.println("Enter the third number: ");
             int number3 = scan.nextInt();

            while(number3 == number1 || number3 == number2)
            {
                System.out.println("That number was already entered, enter another number: ");
                number3 = scan.nextInt();
            }

           if (number1 > number2 && number1 > number3)
            {
                System.out.println("The largest number is " + number1);
            }

            else if (number2 > number1 && number2 > number3)
            {
                System.out.println("The largest number is " + number2);
            }

            else if (number3 > number1 && number3 > number2)
            {
                System.out.println("The largest number is " + number3);
            }

    }
}
