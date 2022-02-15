package com.misery.mocha.tutorial.basic;

/**
 * Custom user-defined Data Type
 */
class CustomDataType {
  /**
   * Prints text to {@code System.out}
   *
   * @param text
   */
  public void echo(String text) {
    System.out.println(text);
  }
}

/**
 * Java Data Types tutorial
 *
 * @see Variables How to declare a variable in Java
 */
public class DataTypes {
  public static void main(String args[]) {
    // Declare a variable with the following syntax
    // <type> <name> = <value>;
    // Like this
    CustomDataType data = new CustomDataType();
    // Same goes for primitives like int, float, byte, char, boolean, etc.
    data.echo("JOE BIDEN");
  }
}
