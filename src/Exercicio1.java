import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Informe um número maior que zero (-1 para sair): ");
        numero = entrada.nextInt();

        while (numero != -1){           
            if (numero > 0){
            System.out.println("Antecessor: " +  (numero -1));
            System.out.println("Sucessor: " +  (numero + 1));
            }
           //limpar o console
           System.out.println("Informe um número maior que zero (-1 para sair): ");
           numero = entrada.nextInt();

           System.out.print("\033[H\033[2J");  
           System.out.flush(); 
        };
        
        System.out.println("Fm do programa: "); 
        entrada.close();
    }    
}