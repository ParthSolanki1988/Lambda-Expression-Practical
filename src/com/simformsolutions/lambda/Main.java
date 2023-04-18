package com.simformsolutions.lambda;

/**
 * Point 2 : Create a main class and use lambda express to call that method using parameters.
 */
public class Main {

  public static void main(String[] args) {

    //Before java 8:

//    Lambda lambda = new Lambda(String name) {
//        public void show() {
//        System.out.println("Before java 8 : create object of interface and add anonymous inner class and write login in it");
//      }
//    };

    //java 8 way:

    Lambda lambda1 = (String name) -> {
      System.out.println("Hello " + name + "\nLight, Camera, Action !! Lambda expressions Rocks");
    };
    lambda1.show("Parth");

  }
}
