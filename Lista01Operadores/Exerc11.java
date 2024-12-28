package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que calcule o peso ideal IMC, peça que o usuário entre com o peso (“Entre com a altura”), utilize a formula:
// double pesoIdeal = (72.7 * altura) – 58; e imprima a mensagem (“O peso ideal é:  “).
public class Exerc11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double pesoideal;
        double altura;

        System.out.println("**Calcular IMC**\n");

        System.out.println("Digite sua altura: ");
        altura = ler.nextDouble();

        pesoideal = (72.7 * altura) - 58;

        System.out.println("O peso ideal é: " + pesoideal);
    }
}
