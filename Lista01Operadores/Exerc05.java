package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que transforme metros em centímetros. O programa deve pedir ao usuário que “Entre com a quantidade de metros” use a
// formula double cm = metros * 100; e imprima o resultado na tela.
public class Exerc05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double cm;
        double metros;
        System.out.println("**Conversão de centimetros para metros**\n");
        System.out.println("Entre com a quantidade de metros: ");
        metros = ler.nextDouble();
        cm = metros * 100;
        System.out.println("A conversão de " + metros + " metros para centímetros é: " + cm );
    }
}
