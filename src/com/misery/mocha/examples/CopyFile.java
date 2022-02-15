package com.misery.mocha.examples;

import java.io.*;
import java.util.*;
import java.nio.file.Files;

/**
 * Copies/Moves a file to a destination
 */
public class CopyFile {
  File src, dest;
  boolean move;

  /**
   * Copies/Moves a file to a destination
   *
   * @param move
   */
  public CopyFile(String src, String dest, boolean move) throws FileNotFoundException {
    this.src = new File(src);
    this.dest = new File(dest);
    this.move = move;

    if (!this.src.exists()) {
      throw new FileNotFoundException(
          "File not Found: " + this.src.toPath().getFileName().toString());
    }
  }

  public CopyFile(String src, String dest) {
    this.src = new File(src);
    this.dest = new File(dest);
    this.move = false;
  }

  public void copyOrMove() throws IOException {
    // if (!dest.exists()) {
    // dest.createNewFile();
    // }

    Files.copy(src.toPath(), dest.toPath());

    if (this.move) {
      src.delete();
    }
  }

  public static void main(String[] args) {
    String src, dst;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter Source File: ");
    src = scanner.nextLine();
    System.out.println("Enter Destination: ");
    dst = scanner.nextLine();

    try {
      CopyFile self = new CopyFile(src, dst);
      self.copyOrMove();
      System.out.println("File Copied!");
    } catch (Exception err) {
      err.printStackTrace();
    } finally {
      scanner.close();
    }
  }
}
