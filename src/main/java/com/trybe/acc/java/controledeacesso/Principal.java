package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Scanner scanner = new Scanner(System.in);
    int opcao = 2;
    int menor = 0;
    int adulta = 0;
    int idoso = 0;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostar relatório");
      opcao = Integer.parseInt(scanner.next());

      if (opcao == 1) {
        System.out.println("Entre com a sua idade:");
        int idade = Integer.parseInt(scanner.next());
        String frase = "";

        if (idade < 18) {
          menor += 1;
          frase = "Pessoa cliente menor de idade, catraca liberada!";
        } else if (idade <= 50) {
          adulta += 1;
          frase = "Pessoa adulta, catraca liberada!";
        } else {
          idoso += 1;
          frase = "Pessoa adulta maior de 50, catraca liberada!";
        }
        System.out.println(frase);
      }
      int total = menor + adulta + idoso;
      double menorPorcentagem = (menor * 100 / total);
      double adultoPorcentagem = (adulta * 100 / total);
      double idosoPorcentagem = (idoso * 100 / total);
      if (opcao == 2) {

        System.out.println("----- Quantidade -----");
        System.out.println("menores: " + menor);
        System.out.println("adultas: " + adulta);
        System.out.println("maiores que 50: " + idoso);

        System.out.println("----- Percentual -----");
        System.out.println("menores: " + menorPorcentagem);
        System.out.println("adultas: " + adultoPorcentagem);
        System.out.println("maiores que 50: " + idosoPorcentagem);
        System.out.println("TOTAL: " + total);
      }

    } while (opcao != 2);
    scanner.close();
  }
}
