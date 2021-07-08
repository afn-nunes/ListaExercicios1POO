package programas;

import java.util.Scanner;

/*
  Crie um programa que imprima os ímpares de 1 até N,
  sendo N solicitado ao usuário.
*/

public class Exercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int numero = sc.nextInt();

    for (int i = 1; i <= numero; i = i + 2) {
      System.out.println(i);
    }

    sc.close();
  }
}
