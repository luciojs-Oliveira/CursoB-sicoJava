/**
 * @author Lúcio Oliveira
 * @since 20 de set. de 2026
 * 
 * Enunciado:
 * Passar argumentos para o programa java utilizando linha de comando.
 * 
 * Explicação:
 * O array 'args' armazena os argumentos passados via linha de comando ao executar o programa.
 * É importante verificar se há argumentos disponíveis antes de acessá-los para evitar o erro ArrayIndexOutOfBoundsException.
 */
package com.cursobasico.aula_006;

public class Argumentos {

  /**
   * Método principal da aplicação.
   * 
   * @param args Argumentos da linha de comando.
   */
  public static void main(String[] args) {
    System.out.println("Hoje é domingo");

    if (args.length > 0) {
      System.out.println("Você digitou: " + args[0]);
    } else {
      System.out.println("Nenhum argumento foi passado na linha de comando.");
    }
  }
}