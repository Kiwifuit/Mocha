package com.misery.mocha.tutorial.basic;

import java.util.Scanner;

/**
 * Covers reading standard input
 */
public class UserInput {

  /**
   * Reads standard input with a {@link Scanner}
   *
   * @return A string read from stdin
   */
  public String getInput() {
    Scanner userIn = new Scanner(System.in);
    String input;

    System.out.print("Type anything then press enter: ");
    // Valid Methods and what they do:
    // - next() reads a word
    // - nextByte() reads a byte
    // - nextLine() reads a line
    // - nextInt() reads an int
    // - nextLong() reads a long int
    // - nextShort() reads a short int
    // - nextFloat() reads a float
    // - nextDouble() reads a double
    // - nextBoolean() reads a boolean
    input = userIn.nextLine();

    // Easter egg for no reason at all!
    // For some reason, you need to do "res.intern"
    if (input.intern() == "anything") {
      System.out.println("Lmfao");
    }

    // Remember to close the scanner!
    userIn.close();

    System.out.println(input);
    return input;
  }

  public static void main(String args[]) {
    UserInput ui = new UserInput();
    System.out.println("Input: " + ui.getInput());
  }
}
