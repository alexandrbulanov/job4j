package ru.job4j.condition;

import java.util.Scanner;

/**
 *@author Alexandr Bulanov
 *@since 19.10.2018
 *@version 0.1
 */
public class Point {
   // переменная для расстояния между точками
   public static int dis;

   public static void main(String[] args) {
      System.out.print("X1: ");
      Scanner keyboard = new Scanner(System.in);
      int x1 = keyboard.nextInt();

      System.out.print("Y1: ");
      Scanner keyboard1 = new Scanner(System.in);
      int y1 = keyboard1.nextInt();

      System.out.print("X2: ");
      Scanner keyboard2 = new Scanner(System.in);
      int x2 = keyboard2.nextInt();

      System.out.print("Y2: ");
      Scanner keyboard3 = new Scanner(System.in);
      int y2 = keyboard3.nextInt();

      //Расчет расстояния
      dis = (int) Math.sqrt(((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
      System.out.println("Расстояние между точками А и В: " + dis);
   }
}