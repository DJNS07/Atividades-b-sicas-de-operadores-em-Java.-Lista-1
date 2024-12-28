package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que entre com o raio de um circulo (“Entre com o raio do círculo:”) e imprima a área do circulo
// (“A área do círculo é: “). Use a formula: double area = Math.PI * Math.pow(raio, 2);
public class Exerc06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio;
        double area;
        System.out.println("**Programa para achar a área de um círculo**\n");

        System.out.println("Entre com o raio do círculo: ");
        raio = ler.nextDouble();

        area = Math.PI * Math.pow(raio,2);
        System.out.printf("A área do círculo é: %.2f%n", area);

    }
}
