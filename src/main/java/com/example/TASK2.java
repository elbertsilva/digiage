package com.example;

import java.util.ArrayList;

/**
 * Task here is to write a list. Each element must know the element before and
 * after it. Print out your list and them remove the element in the middle of
 * the list. Print out again.
 *
 */

public class TASK2 {
  public static void main(String[] args) {
    ArrayList<String> numero = new ArrayList<String>();
    numero.add("um");
    numero.add("dois");
    numero.add("tres");
    numero.add("quatro");
    numero.add("cinco");
    System.out.println(numero);
    numero.remove(2);
    System.out.println(numero);
  }
}
