/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Beers
 */

/*
* print a prompt for users to type their names
* store the input
* concatenate the input with a greeting
* print the concatenated string
* */

import java.util.Scanner;
public class Solution01 {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        String greeting = ("Hello, " + name + ", pleased to make your acquaintance!");
        System.out.println(greeting);
    }
}
