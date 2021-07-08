package programas;

import java.util.Scanner;

/*
  Faça um programa que receba uma frase qualquer e
  mostre-a invertida como no exemplo abaixo:
      Isto é um exemplo -> olpmexe mu é otsI
*/

public class Exercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite uma frase: ");
    String frase = sc.nextLine();

    for (int i = frase.length() - 1; i > -1; i--) {
      System.out.print(frase.charAt(i));
    }

    sc.close();
  }
}
