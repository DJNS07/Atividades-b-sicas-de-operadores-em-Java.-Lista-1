package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que calcule a área de um quadrado, o programa deve pedir para que o usuário entre com o lado do quadrado
// (“Entre com o tamanho do lado do quadrado:”) e imprima a área do quadrado (“A área do quadrado é: “), utilize a formula:
// double area = Math.pow(lado, 2);. E posteriormente imprima o dobro da área do quadrado (“O dobro da área do quadrado é: “), utilize a formula:
// (area * 2).
public class Exerc07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double area;
        double ladodoquadrado;
        System.out.println("**Programa que calcula a área do quadrado**");
        System.out.println("Entre com o tamanho do lado do quadrado: ");
        ladodoquadrado = ler.nextDouble();
        area = Math.pow(ladodoquadrado,2);
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));


    }
}
