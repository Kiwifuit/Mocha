package com.misery.mocha.tutorial.intermediate;

import java.io.*;
import java.util.Properties;

/**
 * Reads a {@code .properties} file and prints a formatted string
 */
public class ReadProperties {
  public static void main(String[] args) {
    try {
      FileReader file = new FileReader("./res/project.properties");
      Properties props = new Properties();
      props.load(file);

      System.out.println(props.getProperty("project.name")
          .concat(" by ".concat(props.getProperty("project.author"))));
      System.out.println(props.getProperty("project.description"));

      file.close();
    } catch (Exception err) {
      // Catching Exception instead of a specific subclass is pretty good
      System.err.println(err);
    }
  }
}
