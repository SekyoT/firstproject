package com.example.javafirst;

import android.renderscript.ScriptGroup;

import java.lang.reflect.TypeVariable;
import java.util.Scanner;

public class MyJavaScript
{
    public static void main(String[] args)
    {
        /*
        String name = "John";
        String price1 = "12.90";
        double price2 = 12.90;

        double lengthOfTable = 1.6;
        String girlName = "Angelica";
        double IphonePrice = 1119.99;
        int studentAge = 17;
        char Grade = 'B';
        boolean rainStopped = true;



        System.out.println("Hello World!");
        System.out.println("My name is " + name + ".");

        int number1 = 10;
        int number2 = 29;

        if(price1.equals(price2))
        {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println("The length of this table is " + lengthOfTable + "m");
        System.out.println("The name of this flower is " + girlName);
        System.out.println("The price of the Iphone is $" + IphonePrice);
        System.out.println("The age of student is " + studentAge + " years old");
        System.out.println("The Grade of Chemistry is " + Grade);
        System.out.println("It is " + rainStopped + " that the rain has stopped");

         */

        //Question 1
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNumber = sc.nextInt();

        if(firstNumber < secondNumber && firstNumber < thirdNumber)
        {
            System.out.println("The smallest number is " + firstNumber);
        }
        else if (secondNumber < firstNumber && secondNumber < thirdNumber)
        {
            System.out.println("The smallest number is " + secondNumber);
        }
        else if (thirdNumber < firstNumber && thirdNumber < secondNumber)
        {
            System.out.println("The smallest number is " + thirdNumber);
        }

         */

        //Question 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower limit: ");
        int lowerNumber = sc.nextInt();
        lowerNumber++;

        System.out.print("Enter upper limit: ");
        int upperNumber = sc.nextInt();

        if(lowerNumber < upperNumber)
        {
            System.out.print("Counting ");

            for (int i = lowerNumber; i < upperNumber; i++)
            {
                System.out.print(" " + i);
            }
        }
        else
        {
            System.out.println("Upoper limit is bigger than the lower limit");
        }
        */

        //Question 3
        int[] myNumbers = {55,24,65,41,13,22,76,90};

        for (int i = 0; i < myNumbers.length; i++)
        {
            if(i >= 55)
            {
                System.out.println(myNumbers);
            }
        }





    }

}
