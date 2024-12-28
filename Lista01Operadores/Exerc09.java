package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que transforme a temperatura de Farenheit para Celsius. Peça ao usuário que entre com um valor em Forenheit
// (“Entre com a temperatura em Farenheit:”) e imprima a temperatura em Celsius (“A temperatura ” + f + ” F é igual a ” + c + ” C”),
// utiliza a formula: double c = (5 * (f-32) / 9);.
public class Exerc09 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double farenheit;
        double celsius;
        System.out.println("**Conversão de Farenheit para Celsius**\n");
        System.out.println("Entre com a temperatura em Farenheit: ");
        farenheit = ler.nextDouble();

        celsius = (5* (farenheit-32) / 9);
        //%.2f limita os números a duas casas decimais.
        System.out.printf("%.2f Graus farenheit em Celsius são: %.2f Celsius.%n", farenheit, celsius);

    }
}
