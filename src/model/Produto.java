package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Preço inválido");
            return;
        }
        else {
        this.preco = preco;}
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0){
            System.out.println("Quantidade inválida");
            return;
        }
        else {
        this.quantidade = quantidade;}
    }
}
