package com.misery.mocha.tutorial.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Covers handling files. (i.e. reading and writing files)
 */
public class FileOps {
  final char newline = '\n';

  /**
   * Reads a file and prints its contents to {@code System.out}
   *
   * @throws FileNotFoundException The file cannot be found
   */
  public void readFile() throws FileNotFoundException {
    try {
      // CH4NGE by Giga. You should watch the video on youtube
      // I translated the lyrics (with google translate)
      File file = new File("./res", "CH4NGE.txt");
      Scanner readScanner = new Scanner(file);

      do {
        // Scanner.nextLine() doesn't add a newline :/
        System.out.print(readScanner.nextLine() + newline);
      } while (readScanner.hasNextLine());

      readScanner.close();
    } catch (FileNotFoundException Error) {
      System.out.println(Error);
    }
  }

  /**
   * Writes {@code text} to a file
   *
   * @param text The text you want to write
   * @throws Exception Various reasons
   */
  public void writeFile(String text) throws Exception {
    try {
      File file = new File("./res", "write.txt");
      String filename = file.toPath().getFileName().toString();

      if (!file.exists()) {
        file.createNewFile();
      }

      if (file.setWritable(true)) {
        System.out.println("Successfully made " + filename + " writable");
      } else {
        throw new Exception("File " + filename + " cannot be made writable");
      }
    } catch (Exception err) {
      throw err;
    }
  }

  public static void main(String[] args) {
  }
}
