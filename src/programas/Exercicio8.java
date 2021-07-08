package programas;

import java.util.Scanner;

public class Exercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = sc.nextInt();

    sc.close();

    int fatorial = 1;
    while (numero > 1) {
      fatorial = fatorial * numero;
      numero = numero - 1;
    }

    System.out.println("O fatorial desse número é " + fatorial);
  }
}
