package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //Declare Variables
        String moviename = "";
        int count = 0;

        while (!moviename.equalsIgnoreCase("quit"))//Comparing Strings to one another .equals() tests for value equality (whether they are logically "equal" strings).
        {                                                   //Ignorecase
            System.out.print("Please enter your favorite movies ");//Ask user for Movies input
            moviename = keyboard.nextLine();
            count = count+ 1; //add one to count into your while loop after the input from user.


        }
        count = count -1;
        System.out.println("You have entered " + count + " movies ");
        }

    }
