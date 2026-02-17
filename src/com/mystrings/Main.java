/**
 *  Java program to demonstrate method concat() and '+' of class String.
 */

package com.mystrings;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating String variable.
        String str = "Hello";

        // Concatenating str with word 'World'.
        str.concat(" World");

        // Printing str to console.
        System.out.println(str); // Output: Hello. We have not assigned a new value.

        // Next try.
        str = str.concat(" World");

        // Printing str to console.
        System.out.println(str); // Output: Hello World.

        // Concantenating with sign +.
        str = str + " from Julia.";

        // Printing str to console.
        System.out.println(str); // Output: Hello World from Julia.

    }
}