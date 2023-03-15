public class Operadores {

    public static void main(String[] args) {
        // classe Operadores.java (concatenação)
        // String nomeCompleto = "Linguagem" + "Java";
        // System.out.println(nomeCompleto);

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";// 31

        concatenacao = 1 + "1" + 1 + 1;// 1111
        concatenacao = 1 + "1" + 1 + "1";// 1111
        concatenacao = "1" + 1 + 1 + 1;// 1111
        /**
         * A partir do momento que a ide identifica a concatenação tudo passará a ser
         * concatenado.
         */

        concatenacao = "1" + (1 + 1 + 1);// 13

        // operadores unários
        int numero = 5;
        System.out.println(-numero); // imprime -5
        System.out.println(numero); // imprime 5
        // não ocorreu a aleração do valor, apenas a impressão
        numero = -numero;
        System.out.println(numero);// -5
        // agora o número foi negativado.

        numero = numero * -1;
        System.out.println(numero);// 5
        // agora o número esta de forma positiva

        System.out.println("------------------------------");

        // Ternário

        int a, b;

        a = 5;
        b = 6;

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        /*
         * String resultado = "";
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a == b) ? "verdadeiro" : "false";
        //Operadores ternarios só funcionam com validações booleanas;

        System.out.println(resultado);

    }

}
