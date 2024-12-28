package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que escreva na tela “Entre com um número inteiro:”, guarde esse número em uma variável e imprima na
// “O número information foi:” e concatene com o número que o usuário digitou.
public class Exerc02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        System.out.println("Entre com um número inteiro: ");
        num = ler.nextInt();

        System.out.println("O número informado foi: " + num);
    }
}
