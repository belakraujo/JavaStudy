package src.main.java.org.example;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
    public static void main(String[] args) {
        //new Random().nextInt(100)
        Random gerador = new Random();

        int tentativas = 5;
        int numAdivinhado = 0;
        int numGerado = 0;

        for (int i = 0; i < 1; i++) {
            numGerado = gerador.nextInt(100);
        }

        while(tentativas > 0){

            Scanner numeros = new Scanner(System.in);
            System.out.println("Digite um número entre 0 a 100. Tentativas restantes: "+ tentativas);
            numAdivinhado = numeros.nextInt();

            if(numAdivinhado == numGerado){
                System.out.println("Número Acertado!");
                break;
            }else {
                if (numAdivinhado > numGerado){
                    System.out.println("Número errado, tente novamente. O seu número é maior que o gerado.");
                }else{
                    System.out.println("Número errado, tente novamente. O seu número é menor que o gerado.");
                }

                tentativas--;
            }

            if(tentativas == 0){
                System.out.println("Numero de tentativas máximas atingidas.O número era: "+ numGerado);
            }
        }


    }
}
