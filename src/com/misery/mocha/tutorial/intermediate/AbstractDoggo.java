package com.misery.mocha.tutorial.intermediate;

import java.util.Random;

// Abstract classes are weird in the way that they can have final, static,
// private, protected, and public variables and methods. It can also provide
// implementations of interface like a normal class, and at the same time act
// like an interface with abstract methods
/**
 * Covers abstract classes
 */
public abstract class AbstractDoggo implements DogInterface {
  final public String name, breed;
  final public int weight;
  final public int age;
  final public int id;

  public AbstractDoggo(String name, String breed, int weight, int age) {
    Random numGen = new Random();

    this.id = numGen.nextInt(10);
    this.weight = weight;
    this.name = name;
    this.age = age;
    this.breed = breed;
  }

  // Abstract methods
  public abstract void bark();

  public abstract void sit();

  // Concrete method
  public String introduce() {
    // Would return something like "Fido is a poodle who is 6 years old and weighs
    // 21 kilograms!"
    return String.format("%s is a %s who is %s years old and weighs %s kilograms%s", this.name,
        this.breed, this.age, this.weight, this.weight > 20 ? "!" : "");
  }
}

// The end-developer would be able to create the AbstractDoggo object, call the
// introduce() method, implement the bark() and sit() methods and access the
// internal variables
/**
 * This class is made to test the {@link AbstractDoggo} class
 */
class Test extends AbstractDoggo {
  /**
   * {@link Test} constructor
   *
   * @param name   The doggo's name
   * @param breed  The doggo's breed
   * @param weight The doggo's weight
   * @param age    The doggo's age
   * @see AbstractDoggo The Abstract class this class inherits
   */
  public Test(String name, String breed, int weight, int age) {
    super(name, breed, weight, age);
  }

  // Here we implement AbstractDoggo's sit and bark methods
  @Override
  public void sit() {
    System.out.println(String.format("%s sits...", this.name));
  }

  @Override
  public void bark() {
    System.out.println("BARK!!!");
  }

  public static void main(String[] args) {
    Test self = new Test("Tasha", "Beagle", 21, 4);

    System.out.println(String.format("Doggo #%s will introduce, bark, and sit shortly", self.id));

    System.out.println(self.introduce());
    self.bark();
    self.sit();
  }
}