package com.misery.mocha.examples;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

/**
 * Dumps the System {@link Properties} into a file
 */
public class GetSysProperties {

  /**
   * Grabs the system's properties and then dumps to a {@link File}
   *
   * @param path File to dump the System Properties
   * @throws Exception {@link Exception} raised when running (the function
   *                     re-raises the error it catches)
   */
  public void dumpProperties(String path) throws Exception {
    try {
      Properties systemProperties = System.getProperties();
      FileWriter outputFile = new FileWriter(path);
      Properties outputProperties = new Properties();
      Set<Entry<Object, Object>> entrySet = systemProperties.entrySet();
      Iterator<Entry<Object, Object>> entryIterator = entrySet.iterator();

      do {
        Entry<Object, Object> entry = entryIterator.next();
        outputProperties.setProperty((String) entry.getKey(), (String) entry.getValue());
      } while (entryIterator.hasNext());

      outputProperties.store(outputFile, "System Properties Dump created by Misery");
      outputFile.close();
    } catch (Exception err) {
      throw err;
    }
  }

  public static void main(String[] args) {
    final String outPath = "system.properties";
    System.out.println("Dumping System Properties. Please wait");
    try {
      new GetSysProperties().dumpProperties(outPath);
    } catch (Exception err) {
      System.err.println(err);
      System.exit(-1);
    }
    System.out.println("Dumped System Properties to " + outPath);
  }
}
