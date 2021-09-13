/*
 *  UCF COP3330 Fall 2021 Assignment 6 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.time.Year;
import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is your current age? ");
        int curAge = Integer.parseInt(input.nextLine());

        System.out.println("At what age would you like to retire?");
        int retAge = Integer.parseInt(input.nextLine());

        int year = Year.now().getValue();

        System.out.println("You have " + (retAge - curAge) + " years left until you can retire.\nIt's " + year + ", so you can retire in " + (year + (retAge-curAge)) + ".");
    }
}