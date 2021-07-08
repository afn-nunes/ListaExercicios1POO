package programas;

import java.util.Scanner;

/*
  Faça um programa para ler três valores decimais que correspondem
  aos lados de um triângulo e, depois, se é um triângulo eqüilátero,
  isóscele ou escaleno.
*/

public class Exercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Lado 1 do triângulo: ");
    double lado1 = sc.nextDouble();

    System.out.print("Lado 2 do triângulo: ");
    double lado2 = sc.nextDouble();

    System.out.print("Lado 3 do triângulo: ");
    double lado3 = sc.nextDouble();

    //Equilátero: 3 lados iguais
    if (lado1 == lado2 && lado2 == lado3) {
      System.out.println("Triângulo equilátero");
    } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
      //Escaleno: 3 lados diferentes
      System.out.println("Triângulo escaleno");
    } else {
      // Isósceles: 2 lados iguais
      System.out.println("Triângulo isósceles");
    }

    sc.close();
  }
}
