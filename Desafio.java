package src.main.java.org.example;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Isabela Araujo";
        String tipoConta = "Corrente";
        double valorConta = 1500;

        System.out.println("***********************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + valorConta);
        System.out.println("\n***********************");

        Scanner scanner = new Scanner(System.in);

        int escolha = 0;
        while (escolha != 4){
            System.out.println("\n------ Operações ------");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("\nDigite a opção desejada: ");
            escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("\nO seu saldo é: "+valorConta);
                    break;
                case 2:
                    System.out.println("\nInforme o valor a receber: ");
                    double valorAdd = scanner.nextDouble();
                    double novoValor = valorConta + valorAdd;
                    System.out.println("\nSaldo atualizado R$: "+novoValor);
                    valorConta = novoValor;
                    break;
                case 3:
                    System.out.println("\nInforme o valor que deseja transferir/sacar: ");
                    double valorRetirada = scanner.nextDouble();
                    if(valorRetirada < valorConta){
                        valorConta = valorConta - valorRetirada;
                        System.out.println("\nSaldo atualizado para: "+valorConta);
                    }else {
                        System.out.println("\nNão há saldo suficiente para realizar esta operação.");
                    }
                    break;
                case 4:
                    break;
            }

            if(escolha > 4){
                System.out.println("Opção Inválida");
            }
            if(escolha < 1){
                System.out.println("Opção Inválida");
            }

        }


    }
}
