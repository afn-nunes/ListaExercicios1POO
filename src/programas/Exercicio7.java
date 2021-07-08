package programas;

/*
  Faça um programa que leia N nomes de alunos e suas médias finais
  – sendo N informado pelo usuário – e que, ao final, forneça o
  percentual de alunos aprovados (média >= 6) e também os nomes e
  médias desses alunos.
*/

import java.util.Scanner;

import classes.Aluno;

public class Exercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos alunos serão cadastrados? ");
    int numAlunos = sc.nextInt();

    Aluno[] alunos = new Aluno[numAlunos];
    int aprovados = 0;

    for (int i = 0; i < numAlunos; i = i + 1) {
      sc.nextLine(); // tira o [ENTER] que ficou lá
      Aluno aluno = new Aluno();

      // Separando a leitura em dois passos para facilitar compreensão
      System.out.print("Nome: ");
      String nome = sc.nextLine();
      aluno.setNome(nome);

      // Porém, pode-se fazer tudo em uma "tacada só"
      System.out.print("Média: ");
      aluno.setMedia(sc.nextDouble());

      alunos[i] = aluno; // armazeno o aluno lido no passo atual do loop

      if (aluno.getMedia() >= 6) {
        aprovados = aprovados + 1; // conto meu número de aprovados
      }
    }

    sc.close();

    double percAprovados = (aprovados * 100.0) / numAlunos;
    System.out.println("O percentual de aprovados é: " + percAprovados + "%");

    for (Aluno aluno : alunos) { // para cada aluno dentro da coleção alunos, faça
      System.out.printf("Nome: %s\n", aluno.getNome()); // o \n significa nova linha (vulgo ENTER)
      System.out.printf("Média: %.2g\n", aluno.getMedia());
      System.out.println("===========================");
    }
  }
}