package com.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a list and add an aleatory number of Strings. In the end, print out how
 * many distinct itens exists on the list.
 *
 */
public class TASK3 {
  public static void main(String[] args) {
    ArrayList<Integer> numero = new ArrayList<Integer>();
    numero.add(10);
    numero.add(5);
    numero.add(1);
    numero.add(9);
    numero.add(4);
    numero.add(8);
    numero.add(2);
    numero.add(7);
    numero.add(3);

    Collections.sort(numero);

    for (int i : numero) {
      System.out.println(i);
    }
  }
}
