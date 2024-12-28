package Lista01Operadores;

import java.util.Scanner;

//Escreva um programa que solicite ao usuário dois números inteiros e imprima na tela a soma deles.
public class Exerc03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        System.out.println("Digite o primeiro número: ");
        num1 = ler.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = ler.nextInt();

        soma = num1 + num2;

        System.out.println("A soma entre " + num1 + " e " + num2 + " é: " + soma);
    }
}
