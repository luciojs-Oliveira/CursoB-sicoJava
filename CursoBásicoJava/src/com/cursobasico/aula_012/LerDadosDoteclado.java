package com.cursobasico.aula_012;

import java.util.Scanner;

/**
 * @author 
 * @since 20 de set. de 2026
 * 
 * Enunciado:
 * Como ler dados no teclado
 * Ler uma linha inteira
 * Ler tipo de dados especificos
 * 
 * Explicação:
 * Uso da classe Scanner para capturar entradas do usuário no console,
 * abordando leitura de strings, números inteiros, decimais e linhas completas.
 */
public class LerDadosDoteclado {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    // Criando o objeto Scanner para ler dados do teclado
    Scanner scan = new Scanner(System.in);
    
    System.out.println("--- Exemplo 1: Leitura de dados específicos ---");
    
    System.out.print("Digite seu nome (apenas uma palavra): ");
    String primeiroNome = scan.next();
    System.out.println("Você digitou: " + primeiroNome);
    
    System.out.print("Digite sua idade: ");
    int idade = scan.nextInt();
    System.out.println("Sua idade é: " + idade);
    
    System.out.print("Digite sua altura (ex: 1.75): ");
    double altura = scan.nextDouble();
    System.out.println("Sua altura é: " + altura);
    
    // Limpar o buffer do teclado (consome a quebra de linha pendente)
    scan.nextLine(); 
    
    System.out.println("\n--- Exemplo 2: Leitura de uma linha inteira ---");
    
    System.out.print("Digite seu endereço completo: ");
    String endereco = scan.nextLine();
    System.out.println("Endereço cadastrado: " + endereco);
    
    // Fechando o scanner para evitar vazamento de recursos
    scan.close();
    System.out.println("\nPrograma finalizado com sucesso!");
  }
}