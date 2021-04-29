package com.example.javafirst;

public class TestRelational
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        String name1 = "Aisha";
        String name2 = "AIsha";

        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));

        System.out.println("I am comparing my name: " + name1.equals(name2));

    }

}
