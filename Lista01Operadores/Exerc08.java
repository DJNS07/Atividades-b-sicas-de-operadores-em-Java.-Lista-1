package Lista01Operadores;

import java.util.Scanner;

// Escreva um programa que calcule o valor do salário de um funcionário, o usuário deve entrar com o valor da hora (“Entre com o valor/hora”)
// e a quantidade de horas trabalhadas no mês (“Entre com a quantidade de horas trabalhadas no mês:”), utilize a formula double salario =
// valorHora * horas;. Imprima o salário do funcionário (“O salário é de: “).
public class Exerc08 {
    public static void main(String[] args) {
        double salarioporhora;
        int horas;
        double salario;
        Scanner ler = new Scanner(System.in);
        System.out.println("**Programa que calcula salário de funcionário**\n");

        System.out.println("Entre com o valor/hora: ");
        salarioporhora = ler.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        horas = ler.nextInt();

        salario = salarioporhora * horas;

        System.out.println("O salário é de: " + salario );
    }

}
