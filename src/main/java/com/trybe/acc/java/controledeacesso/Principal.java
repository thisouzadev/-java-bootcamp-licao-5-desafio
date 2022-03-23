package com.trybe.acc.java.controledeacesso;

import java.util.Scanner;

public class Principal {

  /**
   * Método principal.
   */
  public static void main(String[] args) {
    // ESCREVA SEU CÓDIGO AQUI
    Scanner scanner = new Scanner(System.in);
    int opcao = 0;
    do {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Acessar o estabelecimento");
      System.out.println("2 - Finalizar sistema e mostar relatório");
      opcao = Integer.parseInt(scanner.nextLine());

      if (opcao == 1) {
        System.out.println("Entre com a sua idade:");
        int idade = Integer.parseInt(scanner.nextLine());
        String frase = "";
        if (idade < 18) {
          frase = "Pessoa cliente menor de idade, catraca liberada!";
        } else if (idade >= 18 && idade <= 50) {
          frase = "Pessoa adulta, catraca liberada!";
        } else {
          frase = "Pessoa adulta maior de 50, catraca liberada!";
        }
        System.out.print(frase);
      }

    } while (opcao != 0);
    scanner.close();
  }
}
