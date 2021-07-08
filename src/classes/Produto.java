package classes;

public class Produto {
    public String nome;
    public double quantidade;
    public double valor;
    public double valorTotal;

    
    public double getValorTotal() {
        return valorTotal;
    }


    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    public Produto(){

    }

    
    public Produto(String nome, double quantidade, double valor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
