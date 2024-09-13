package view;
import java.util.Scanner;
import model.Carro;
import model.ContaBancaria;
import model.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Carro CarroFlay = new Carro("123", "Fiat", "Uno", "aaa-1111", 120, 50);
        System.out.println("digite o valor da gasolina");
        CarroFlay.ValorGasolina(scan.nextDouble());
        ContaBancaria conta = new ContaBancaria("João", 1000);
        int opcao = 1;

        while (opcao == 1) {
            System.out.println("Seu saldo é: " + conta.getSaldo() + ". Quer sacar (1) ou depositar (2)?");
            int escolha = scan.nextInt();

            if (escolha == 1) {
                System.out.println("Digite o valor a ser sacado:");
                conta.sacar(scan.nextDouble());
                System.out.println("Saldo: " + conta.getSaldo() + ". Para realizar outra operação digite 1, para seguir digite 2");
                opcao = scan.nextInt();
            }
            else if (escolha == 2) {
                System.out.println("Digite o valor a ser depositado:");
                conta.depositar(scan.nextDouble());
                System.out.println("Saldo: " + conta.getSaldo() + ". Para realizar outra operação digite 1, para seguir digite 2");
                opcao = scan.nextInt();
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        System.out.println("Operações encerradas.");

        Produto bolacha = new Produto ("bolacha", 2.50, 10);
        System.out.println("digite o novo preço da bolacha: ");
        bolacha.setPreco(scan.nextDouble());
        System.out.println("digite a nova quantidade de bolachas: ");
        bolacha.setQuantidade(scan.nextInt());
        System.out.println("O preço da bolacha é: " + bolacha.getPreco() + " e a quantidade é: " + bolacha.getQuantidade());
    }
}