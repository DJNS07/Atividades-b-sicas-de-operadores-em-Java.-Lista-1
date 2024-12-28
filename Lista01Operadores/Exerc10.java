package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que transforme a temperatura de Celsius para Forenheit. Peça ao usuário que entre com um valor em Celsius
// (“Entre com a temperatura em Celsius:”) e imprima a temperatura em Forenheit (“A temperatura ” + c + ” C é igual a ” + f + ” F”),
// utiliza a formula: double f = (c * 1.8) + 32;.
public class Exerc10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double celsius;
        double farenheit;

        System.out.println("**Conversão de Celsius para Farenheit**\n");

        System.out.println("Entre com a temperatura em Celsius: ");
        celsius = ler.nextDouble();

        farenheit = (celsius * 1.8) + 32;

        System.out.printf("%.2f Graus celsius em farenheit são: %.2f farenheit.%n", celsius, farenheit);
    }
}
