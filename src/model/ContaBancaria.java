package model;

public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }
        else {
        this.saldo += valor;}
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido");
            return;
        }

        else if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
            return;
        }

        else{
        this.saldo -= valor;}
    }
}
