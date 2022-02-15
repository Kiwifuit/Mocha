package com.misery.mocha.tutorial.basic;

/**
 * Java Logic and Flow tutorial
 */
public class LogicAndFlow {
  private static void displayArgs(String args[]) {
    System.out.println("Displaying Arguments");
    if (args.length != 0) {
      System.out.println("Index Value");
      for (int i = 0; i < args.length; i++) {
        System.out.println(i + " " + args[i]);
      }
    } else {
      System.out.println("There are no Arguments!");
    }
  }

  public static void main(String args[]) {
    LogicAndFlow.displayArgs(args);
  }
}
