package com.cursobasico.aula_013;

/**
 * @author Lúcio Oliveira
 * @since 20 de set. de 2026
 * 
 * Enunciado:
 * Estudo e aplicação prática dos principais operadores da linguagem Java:
 * - Operadores Aritméticos: realizam cálculos matemáticos básicos.
 * - Operadores Relacionais: comparam valores e retornam um resultado booleano (true ou false).
 * - Operadores Lógicos: combinam expressões booleanas para formar regras complexas.
 * 
 * Explicação:
 * - Aritméticos: Utilizados para adição (+), subtração (-), multiplicação (*), divisão (/) e resto da divisão (%).
 * - Relacionais: Usados para verificar igualdade (==), diferença (!=), maior que (>), menor que (<), maior ou igual (>=) e menor ou igual (<=).
 * - Lógicos: Utilizados para representar a conjunção "E" (&&), a disjunção "OU" (||) e a negação "NÃO" (!).
 */
public class OperadoresAritimeticos {

  /**
   * @param args argumentos da linha de comando
   */
  public static void main(String[] args) {
      
      // ==========================================
      // 1. OPERADORES ARITMÉTICOS
      // ==========================================
      int a = 10;
      int b = 3;
      
      System.out.println("=== OPERADORES ARITMÉTICOS ===");
      System.out.println("Valor de a: " + a + " | Valor de b: " + b);
      System.out.println("Soma (a + b)           : " + (a + b));
      System.out.println("Subtração (a - b)      : " + (a - b));
      System.out.println("Multiplicação (a * b)  : " + (a * b));
      System.out.println("Divisão (a / b)        : " + (a / b)); // Divisão inteira
      System.out.println("Módulo / Resto (a % b) : " + (a % b));
      
      // ==========================================
      // 2. OPERADORES RELACIONAIS
      // ==========================================
      System.out.println("\n=== OPERADORES RELACIONAIS ===");
      boolean igual       = (a == b);
      boolean diferente   = (a != b);
      boolean maior       = (a > b);
      boolean menor       = (b < a);
      boolean maiorOuIgual = (a >= 10);
      boolean menorOuIgual = (b <= 3);

      System.out.println("a == b (Igual?)           : " + igual);
      System.out.println("a != b (Diferente?)       : " + diferente);
      System.out.println("a > b  (Maior?)           : " + maior);
      System.out.println("b < a  (Menor?)           : " + menor);
      System.out.println("a >= 10 (Maior ou igual?) : " + maiorOuIgual);
      System.out.println("b <= 3  (Menor ou igual?) : " + menorOuIgual);

      // ==========================================
      // 3. OPERADORES LÓGICOS
      // ==========================================
      System.out.println("\n=== OPERADORES LÓGICOS ===");
      boolean condicao1 = true;
      boolean condicao2 = false;

      System.out.println("condicao1 (true) && condicao2 (false) [E] : " + (condicao1 && condicao2));
      System.out.println("condicao1 (true) || condicao2 (false) [OU]: " + (condicao1 || condicao2));
      System.out.println("!condicao1 (NÃO true)                     : " + (!condicao1));

      // Exemplo prático combinado
      int idade = 20;
      boolean temCarteiraHabilitacao = true;
      boolean podeDirigir = (idade >= 18) && temCarteiraHabilitacao;
      
      System.out.println("\nExemplo Prático (Pode dirigir?): " + podeDirigir);
  }
}