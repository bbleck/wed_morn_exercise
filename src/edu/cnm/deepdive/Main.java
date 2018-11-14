package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Random;

public class Main {
  private static int[] array1 = new int[50];
  private static int[] array2 = new int[50];
  private static Random rand = new Random();

  public static void main(String[] args) {
    for (int i = 0; i < array1.length; i++) {
      array1[i] = rand.nextInt();
      array2[i] = rand.nextInt();
    }
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
    for (int i = 0; i < array1.length; i++) {
      array1[i] = (array1[i] ^ array2[i]);
      array2[i] = (array1[i] ^ array2[i]);
      array1[i] = (array1[i] ^ array2[i]);
    }
    System.out.println(Arrays.toString(array1));
    System.out.println(Arrays.toString(array2));
  }
}
