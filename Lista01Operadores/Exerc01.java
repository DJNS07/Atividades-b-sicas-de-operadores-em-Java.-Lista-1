package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que Imprima seu nome completo
public class Exerc01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome completo:");
        nome = ler.nextLine();
        System.out.println("Seja bem vindo " + nome + "!");
    }
}
