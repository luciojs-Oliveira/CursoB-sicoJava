package com.cursobasico.aula_011;

/**
 * @author Lúcio Oliveira
 * @since 20 de set. de 2026
 * 
 * Enunciado:
 * - Tipos inteiros
 * - Tipos de ponto flutuante
 * - Tipo char
 * - Tipo boolean
 * - Literais
 * 
 * Explicação detalhada:
 * 1. Tipos Inteiros: Armazanam números sem parte decimal (positivos e negativos).
 *    - byte (8 bits): -128 a 127
 *    - short (16 bits): -32.768 a 32.767
 *    - int (32 bits): -2.147.483.648 a 2.147.483.647 (O padrão para inteiros)
 *    - long (64 bits): Números inteiros muito grandes. Exige 'L' no final.
 * 
 * 2. Tipos de Ponto Flutuante: Armazanam números com casas decimais.
 *    - float (32 bits): Precisão simples. Exige 'f' ou 'F' no final.
 *    - double (64 bits): Precisão dupla. O padrão para números decimais em Java.
 * 
 * 3. Tipo char: Armazena um único caractere (letra, símbolo ou número na tabela Unicode). 
 *    É delimitado por aspas simples (' '). Ocupa 16 bits.
 * 
 * 4. Tipo boolean: Armazena valores de verdadeiro ou falso (`true` ou `false`).
 * 
 * 5. Literais: São os valores fixos escritos diretamente no código-fonte (ex: 10, 3.14, 'A', true).
 *    O Java interpreta o tipo de um literal com base na sua forma de escrita.
 */
public class Variaveis {

  /**
   * @param args argumentos de linha de comando
   */
  public static void main(String[] args) {

    // ==========================================
    // 1. TIPOS INTEIROS
    // ==========================================
    byte idadeCrianca = 10;
    short codigoProduto = 15000;
    int populacaoCidade = 450000;
    long distanciaEstrelas = 9223372036854775807L; // Note o 'L' no final para literais long

    System.out.println("--- Tipos Inteiros ---");
    System.out.println("Idade (byte): " + idadeCrianca);
    System.out.println("Código (short): " + codigoProduto);
    System.out.println("População (int): " + populacaoCidade);
    System.out.println("Distância (long): " + distanciaEstrelas);


    // ==========================================
    // 2. TIPOS DE PONTO FLUTUANTE (Decimais)
    // ==========================================
    float valorProduto = 19.99f; // Note o 'f' no final. Sem ele, o Java acha que é um double.
    double pi = 3.141592653589793;

    System.out.println("\n--- Tipos de Ponto Flutuante ---");
    System.out.println("Valor do Produto (float): " + valorProduto);
    System.out.println("Valor de Pi (double): " + pi);


    // ==========================================
    // 3. TIPO CHAR (Caractere)
    // ==========================================
    char primeiraLetra = 'J';
    char simboloAscii = 65; // O valor 65 corresponde à letra 'A' na tabela ASCII/Unicode
    
    System.out.println("\n--- Tipo Char ---");
    System.out.println("Primeira Letra: " + primeiraLetra);
    System.out.println("Caractere via código numérico (65): " + simboloAscii);


    // ==========================================
    // 4. TIPO BOOLEAN (Lógico)
    // ==========================================
    boolean estaLogado = true;
    boolean temDesconto = false;

    System.out.println("\n--- Tipo Boolean ---");
    System.out.println("Está logado? " + estaLogado);
    System.out.println("Tem desconto? " + temDesconto);


    // ==========================================
    // 5. EXEMPLOS DE LITERAIS EXTRAS
    // ==========================================
    // Literais inteiros podem ser representados em outras bases também:
    int decimal = 26;          // Base decimal comum
    int binario = 0b11010;     // Prefixo 0b para binário (representa o número 26)
    int hexadecimal = 0x1A;    // Prefixo 0x para hexadecimal (representa o número 26)

    System.out.println("\n--- Exemplos de Literais Numéricos ---");
    System.out.println("Decimal: " + decimal);
    System.out.println("Binário (0b11010): " + binario);
    System.out.println("Hexadecimal (0x1A): " + hexadecimal);
  }
  
  
}