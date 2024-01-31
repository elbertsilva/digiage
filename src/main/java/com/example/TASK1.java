package com.example;

//import java.util.Scanner;
/**
 * 
 *
 * Task here is to implement a function that says if a given string is
 * palindrome.
 * 
 * 
 * 
 * Definition=> A palindrome is a word, phrase, number, or other sequence of
 * characters which reads the same backward as forward, such as madam or
 * racecar.
 */
public class TASK1 {
  public static void main(String[] args) {
    System.out.println("Starting...");
    String frente = "palindrome";
    String tras = "";
    System.out.println(frente);

    for (int i = 0; i < frente.length(); i++) {
      tras = frente.charAt(i) + tras;
    }

    System.out.println(tras);
  }
}
