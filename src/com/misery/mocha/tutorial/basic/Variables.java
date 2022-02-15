package com.misery.mocha.tutorial.basic;

/**
 * Java Variable Declaration tutorial
 *
 * @see DataTypes How to declare variables with a custom type
 */
public class Variables {
  // There are 3 types of variables: Local Variables, Instance Variables and
  // Static Variables

  // Instance variables are variables declared inside a class but are outside any
  // method, code block, or constructor. These variables are also known as
  // fields or properties
  char php = '\u20B1';

  // Static variables are variables declared with the "static" keyword.
  // These variables are initialized only once and are also used in declaring
  // constants along with the "final" keyword
  static double cash = 200.75;

  public static void main(String args[]) {
    // Local variables are variables declared within a method, code block,
    // or constructor. These variables can only be accessed within the
    // curly braces that surround the variable
    double num = 3e10;
    System.out.println(num);
  }
}
