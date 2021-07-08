import java.util.Scanner;

import classes.Produto;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Produto[] produto = new Produto[3]; //quantidade de produtos a serem solicitados, coloquei menos para teste
        //variáveis temporárias que serão usadas para o construtor do produto
        String nome;
        double quantidade, valor;

        //variável para armazenar e imprimir a soma dos valores dos itens
        double valorVenda = 0;

        limpartela();

        for (int i = 0; i < produto.length; i++) {
            System.out.println("Informe o nome do produto : " + (i + 1));
            nome = entrada.next();

            System.out.println("Informe a quantidade do produto:  " + (i + 1));
            quantidade = entrada.nextDouble();
        
            System.out.println("Informe o valor do produto: " + (i + 1));
            valor = entrada.nextDouble();         

            Produto p = new Produto(nome, quantidade, valor);
            p.setValorTotal(quantidade * valor);
            
            produto[i] = p;

            valorVenda += (quantidade * valor);   
            
            limpartela();
        }

        System.out.println(String.format("%50s", "Cupom fiscal"));
        System.out.println(String.format("%20s", "nome") + String.format("%20s", "quantidade") + String.format("%20s", "valor"));

        for (int i = 0; i < produto.length; i++) {
            System.out.println(String.format("%20s",produto[i].getNome()) + String.format("%20s",produto[i].getQuantidade()) + String.format("%20s", produto[i].getValor()));
        }
        System.out.println("Valor total da venda: " + String.format("%,.2f", valorVenda));
        entrada.close();

    }

    private static void limpartela(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
    }
}
