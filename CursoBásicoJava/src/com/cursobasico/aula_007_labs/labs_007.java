package com.cursobasico.aula_007_labs;

/**
 * @author Seu Nome
 * @since 20 de set. de 2026
 * 
 * Enunciado:
 * Compreender a diferença entre os três principais tipos de erros na programação:
 * 1. Erros de Sintaxe (Syntax Errors)
 * 2. Erros de Semântica (Semantic/Logic Errors)
 * 3. Erros em Tempo de Execução (Runtime Errors)
 * 
 * Explicação:
 * - Sintaxe: Viola as regras da linguagem (o código nem compila).
 * - Semântica/Lógica: O código compila, mas faz algo diferente do que o programador pretendia ou usa variáveis não inicializadas.
 * - Execução: Ocorre enquanto o programa está rodando, geralmente causado por situações inesperadas (como divisão por zero).
 */
public class labs_007 {

  /**
   * @param args argumentos de linha de comando
   */
  public static void main(String[] args) {
    
    // 1. ERRO DE SINTAXE
    // Ocorre quando violamos as regras gramaticais da linguagem Java.
    // Exemplo com erro (faltando o ponto e vírgula):
    // System.out.println("Hello world") -> Descomentar isso impede a compilação.
    System.out.println("Hello world (Sintaxe correta)");
    
    
    // 2. ERRO DE SEMÂNTICA / LÓGICA
    // Ocorre quando o código compila, mas há uma falha na lógica ou uso de 
    // variáveis que não foram inicializadas.
    // Exemplo corrigido inicializando a variável 'cont':
    int cont = 5; 
    System.out.println("Você digitou: " + cont);
    
    
    // 3. ERRO EM TEMPO DE EXECUÇÃO (Runtime Error)
    // Ocorre quando o programa está rodando e encontra uma instrução impossível 
    // de ser executada (como divisão por zero).
    // Exemplo corrigido (evitando a divisão por zero ou tratando a lógica):
    int denominador = 2; // Se fosse 0, geraria ArithmeticException
    if (denominador != 0) {
        System.out.println("Resultado da divisão: " + (1 / denominador));
    } else {
        System.out.println("Não é possível dividir por zero!");
    }

  }
}