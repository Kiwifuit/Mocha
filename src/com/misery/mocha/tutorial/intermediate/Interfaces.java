package com.misery.mocha.tutorial.intermediate;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Implements the {@code DogInterface} interface
 *
 * @see DogInterface The interface this class implements
 */
public class Interfaces implements DogInterface {
  /** Counter for Dog's ID, incremented after a constructor call */
  static int nextID;
  int doggoID;

  // Visible fields
  String name, breed;
  int age, weight;

  /**
   * Constructor for the {@link Interfaces} class
   *
   * @param name   Name of the dog
   * @param breed  Breed of the dog
   * @param age    Age of the dog
   * @param weight Weight of the dog
   */
  public Interfaces(String name, String breed, int age, int weight) {
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.breed = breed;
    this.weight = weight;
    this.doggoID = nextID;
    nextID++;
  }

  public String introduce() {
    return String.format("%s is a %s-year-old %s who weighs %s kilograms", this.name, this.age,
        this.breed, this.weight);
  }

  public void bark() {
    System.out.println("WOOF!");
  }

  /**
   * Converts an array of {@link Character}s into a single {@link String}
   *
   * @param chars Array of {@link Character}s to convert
   * @return A {@link String} of {@code chars}
   */
  public static String collectChars(char[] chars) {
    String res = "";

    for (int i = 0; i < chars.length; i++) {
      res += chars[i];
    }

    return res;
  }

  /**
   * Converts a character {@code chr} into its uppercase counterpart. Returns
   * itself if it cannot find that uppercase counterpart
   *
   * @param chr
   * @return Upper-cased counterpart of {@code chr}
   * @apiNote {@code toUpperCase('[') -> '['}
   * @apiNote {@code toUpperCase('d') -> 'D'}
   */
  public static char toUpperCase(char chr) {
    switch (chr) {
    case 'a':
      return 'A';
    case 'b':
      return 'B';
    case 'c':
      return 'C';
    case 'd':
      return 'D';
    case 'e':
      return 'E';
    case 'f':
      return 'F';
    case 'g':
      return 'G';
    case 'h':
      return 'H';
    case 'i':
      return 'I';
    case 'j':
      return 'J';
    case 'k':
      return 'K';
    case 'l':
      return 'L';
    case 'm':
      return 'M';
    case 'n':
      return 'N';
    case 'o':
      return 'O';
    case 'p':
      return 'P';
    case 'q':
      return 'Q';
    case 'r':
      return 'R';
    case 's':
      return 'S';
    case 't':
      return 'T';
    case 'u':
      return 'U';
    case 'v':
      return 'V';
    case 'w':
      return 'W';
    case 'x':
      return 'X';
    case 'y':
      return 'Y';
    case 'z':
      return 'Z';
    default:
      return chr;
    }
  }

  // To the person who is reading this, I have absolutely no idea why I wrote this
  // function. Could it be that an idea struck? Or does this function originally
  // have a purpose, now lost forever? The same can be said for collectChars() and
  // toUpperCase, which is what this function calls.
  //
  // I'd say it's a very clunky implementation of "str.titlecase()"

  /**
   * Title-cases a string. Returns the same output as Python's
   * {@code str.titlecase()} method, where the first character of each word
   * (separated by a space) is capitalized, as opposed to following English' rules
   * on capitalization. On most cases, this is fine, but on some it might look
   * weird, so it might be better to use RegEx to titlecase text
   *
   * @param sentence The sentence to title-case
   * @return A title-cased {@link String} of {@code sentence}
   * @apiNote If you're curious, you can check the source code of this file or use
   *          a decompiler like FernFlower to see how this function was
   *          implemented
   */
  public static String titleCase(String sentence) {
    // I will both explain the code and write its Python equivalent, just for the
    // memes. Pythonic code will be comments that have "?" in them after the "//",
    // which would be highlighted if you have VS Code's Better Comments extension

    // Create a tokenizer, which will be used to iterate over
    // ? tokenizer = sentence.split()
    StringTokenizer tokenizer = new StringTokenizer(sentence);

    // Create an expandable array, since we don't know how many words ("tokens") are
    // in the "sentence"
    // ? titleCase = []
    ArrayList<String> titleCase = new ArrayList<String>();

    // ? res = ""
    String res = "";

    // ? for word in tokenizer:
    do {
      // This entire block can be achieved by the following Python code:
      // ? word[0] = word[0].upper()
      // ? titleCase.append(word)
      char[] broken = tokenizer.nextToken().toCharArray();

      // Here, I could've used a hashmap BUT I have no clue on how to add elements on
      // the line where you declare the hashmap, so I used switch/case blocks. I
      // could, in theory, use a properties file, but that's too much work for too
      // little reward
      broken[0] = toUpperCase(broken[0]);

      titleCase.add(collectChars(broken));
    } while (tokenizer.hasMoreTokens());

    // For loop and res.strip() can be achieved by the following Python code:
    // ? return " ".join(titleCase)
    for (int i = 0; i < titleCase.size(); i++) {
      res += titleCase.get(i);
      res += " ";
    }

    // Here I strip one more time, since "res" is guaranteed to have a trailing
    // whitespace
    return res.strip();
  }

  public static void main(String[] args) {
    Interfaces tasha = new Interfaces("Tasha", "Beagle", 4, 60);

    System.out.println(tasha.introduce());
  }
}