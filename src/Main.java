import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".

        System.out.println("Digite um número: ");
        int numero = scan.nextInt();
        String resultado = numero > 0 ? "Número positivo" : "Número negativo";
        System.out.println(resultado);

        //Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        System.out.println("Digite dois numeros: ");
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        String resultado2 = numero1 == numero2 ? "Os números são iguais" : numero1 > numero2 ? "O primeiro número é maior" : "O segundo número é maior";
        System.out.println(resultado2);

        //Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2. Calcular área do círculo". Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

        System.out.println("Escolha opção 1 ou 2: ");
        int opcao = scan.nextInt();

        if(opcao == 1){
            System.out.println("Digite o lado do quadrado: ");
            int lado = scan.nextInt();
            System.out.println("A área do quadrado é: " + (lado * lado));
        } else if(opcao == 2){
            System.out.println("Digite o raio do círculo: ");
            int raio = scan.nextInt();
            System.out.println("A área do círculo é: " + (3.14 * raio * raio));
        }

        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        System.out.println("Digite um número: ");
        int numero3 = scan.nextInt();
        for(int i = 1; i <= 10; i++ ){
            System.out.println(numero3 + " * " + i + " = " + (numero3 * i));
        }

        //Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.

        System.out.println ("Digite um número: ");
        int numero4 = scan.nextInt();
        String resultado3 = numero4 % 2 == 0 ? "Número par" : "Número ímpar";
        System.out.println(resultado3);

        //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

        System.out.println ("Digite um número: ");
        int numero5 = scan.nextInt();
        int fatorial = 1;
        for(int i = 1; i <= numero5; i++){
            fatorial = fatorial * i;
        }
        System.out.println("é " + fatorial);

        //Faixa Etária: Receba a idade de uma pessoa e imprima se ela é: menor de idade, adulta ou idosa (use, por exemplo, 18 para adulta e 60 para idosa).

        System.out.println ("Digite sua idade:");

        int idade = scan.nextInt();
        String resultado4 = idade < 18 ? "menor" : idade < 60 ? "adulto" : "velho";

        System.out.println(resultado4);

        //Soma dos Números Ímpares: Peça ao usuário que insira um número inteiro n. Calcule e imprima a soma dos primeiros n números ímpares. Por exemplo, se o usuário inserir 4, o programa deve calcular a soma de 1 + 3 + 5 + 7 = 16.

        int numero6 = scan.nextInt();
        int soma = 0;
        for(int i = 1; i <= numero6; i++){
            soma += 2 * i - 1;
        }
        System.out.println(soma);

        //Lista de Nomes: Peça ao usuário para inserir 5 nomes (um de cada vez). Após inserir todos os nomes, peça outro nome e use um loop for para percorrer a lista e verificar se o 6º(último) nome digitado está presente no array dos 5 nomes informados inicialmente.

        String[] nomes = new String[5];
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = scan.next();
        }
        System.out.println("Digite um ultimo nome: ");
        String ultimoNome = scan.next();
        for(int i = 1; i <= 5; i++){
            if(nomes[i].equals(ultimoNome)){
                System.out.println("O nome está na lista");
                break;
            }
        }


        //Senha Secreta: Defina uma senha secreta (por exemplo: "Java123"). Use um loop while para pedir ao usuário que insira a senha. Se a senha estiver incorreta, continue pedindo a senha e informe ao usuário que a tentativa foi inválida. Se ele acertar, saia do loop e imprima uma mensagem de sucesso.

        String senha = "Java123";
        String senha1;
        System.out.println("Digite a senha: ");
        senha1 = scan.next();
        while(!senha1.equals(senha)){
            System.out.println("Senha incorreta, tente novamente: ");
            senha1 = scan.next();
        }
        System.out.println("Senha correta");

    }
}