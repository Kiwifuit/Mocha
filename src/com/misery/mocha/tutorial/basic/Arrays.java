package com.misery.mocha.tutorial.basic;

/**
 * Java Arrays tutorial
 */
public class Arrays {
  /**
   * Main Function. Run the script to see output
   */
  public static void main(String args[]) {
    // Array Example
    // Extracting a value from an array is on "LogicAndFlow.java".
    // A pair of square brackets indicates a dimension
    double[] cashOnMe = { 32.5, 412.3, 1231.0 };
    // This is a 2D integer array
    int[][] shimmy = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    // ! For people coming from languages like Python, here are a few things that
    // ! would be good to know:
    // ! 1. Everything is not an object. For primitives, the *wrapper classes* are
    // ! objects
    // ! meaning that calling a method on a primitive int won't work.
    // ! 2. Unlike C/C++, Java has wrapper classes and the String object built-int
    // ! with no libraries to import
    // ! 3. Unfortunately, just like C/C++, arrays use curly braces for

    System.out.println("I have cash in " + cashOnMe.length + " different places:");
    System.out.println(shimmy[1][1]); // returns 5
  }
}
