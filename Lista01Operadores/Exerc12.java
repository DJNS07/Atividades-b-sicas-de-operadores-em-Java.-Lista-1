package Lista01Operadores;

import java.util.Scanner;

// (Desafio) Escreva um programa que calcule o valor do salário de um funcionário com seus respectivos descontos: 8% de INSS, 5% Sindicato,
// 11% Imposto de Renda, calcule o total de desconto e o salário líquido. O usuário deve entrar com o valor da hora (“Entre com o valor/hora”) e
// a quantidade de horas trabalhadas no mês (“Entre com a quantidade de horas trabalhadas no mês:”), utilize a questão 8 como referência. Imprima
// no final os seguintes itens: “Salário bruto: “, “INSS: “, “Sindicato: “, “IR: “,  “Total descontos: ” e “Salário líquido: “

// EXERCÍCIO AINDA NÃO COMPLETO

public class Exerc12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("**Calcular o salário do funcionário com descontos**\n");
        double valorhora;
        int horastrabalhadas;
        double salarioliquido;
        double inss;
        double sindicato;
        double impostoderenda;


        System.out.println("Entre com o valor/hora: ");
        valorhora = ler.nextDouble();

        System.out.println("Entre com a quantidade de horas trabalhadas no mês: ");
        horastrabalhadas = ler.nextInt();

        salarioliquido = valorhora * horastrabalhadas;

        inss = (salarioliquido / 8) * 100;
        System.out.println(salarioliquido);
        System.out.println(inss);
    }
}
