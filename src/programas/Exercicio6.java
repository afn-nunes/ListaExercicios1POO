package programas;

import java.util.Scanner;

/*
  Faça um programa que solicite dois valores e imprima todos
  os pares entre o menor valor e o maior valor. Caso os números
  digitados sejam iguais, enviar mensagem ao usuário e imprimir
  os pares de 1 a 10 como exemplo.
*/

public class Exercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero1 = sc.nextInt();

    System.out.print("Digite outro número: ");
    int numero2 = sc.nextInt();

    sc.close();

    int menor, maior;

    if (numero1 < numero2) {
      menor = numero1;
      maior = numero2;
    } else if (numero1 > numero2) {
      menor = numero2;
      maior = numero1;
    } else {
      System.out.println("Os números digitados são iguais.");
      System.out.println("Serão impressos os números pares entre 1 e 10.");
      menor = 1;
      maior = 10;
    }

    // Se o menor número não for par, começo o loop no próximo número
    if(menor % 2 != 0) {
      menor = menor + 1;
    }

    for (int i = menor; i <= maior; i = i + 2) {
      System.err.println(i);
    }
  }
}
