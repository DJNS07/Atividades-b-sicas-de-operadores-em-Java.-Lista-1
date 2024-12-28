package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que peça ao usuário quatro notas e imprima na tela a média. (nota1 + nota2 + nota3 +nota4)/4
public class Exerc04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        int n3;
        int n4;
        int media;
        String aluno;
        System.out.println("**Média do aluno** \n");
        System.out.println("Digite o nome completo do aluno: ");
        aluno = ler.nextLine();
        System.out.println("Digite a primeira nota: ");
        n1 = ler.nextInt();
        System.out.println("Digite a segunda nota: ");
        n2 = ler.nextInt();
        System.out.println("Digite a terceira nota: ");
        n3 = ler.nextInt();
        System.out.println("Digite a quarta nota: ");
        n4 = ler.nextInt();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média do aluno "+ aluno + " é: " +  media);
    }
}
