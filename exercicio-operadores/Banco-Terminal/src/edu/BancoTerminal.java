package edu;

/**Exercício operadores
Crie o programa chamado BancoTerminal.java para implementar o algorítmo conforme abaixo:
O programa deverá simular uma operação de saque onde:
Terá uma variável denominada saldo do tipo double contendo o valor inicial igual a 25;
Terá uma variável denominada de valor solicitado do tipo double contendo o valor inicial igual a 18;
Criar uma expressão relacional para que caso o saldo seja maior que o valor solicitado, o saldo recebe o novo valor como saldo é igual saldo menos o valor solicitado. Caso o saldo seja menor que o valor solicitado, devemos exibir a mensagem "Saldo insuficiente";
Imprima o valor do saldo;
Em seguida, realize a mesma execução do programana agora com os valores saldo igual a 15 e valor solicitado igual a 22 e exiba o resultado; */

import java.util.Scanner;

public class BancoTerminal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 25;
        double valorSolicitado = 18;

        sacar(saldo, valorSolicitado);

        sc.close();
    }

    static void sacar( double saldo, double valorSolicitado){
        if (saldo > valorSolicitado) {
            double novoSaldo = saldo - valorSolicitado;
            System.out.println(novoSaldo);

        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
}
