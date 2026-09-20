package com.cursobasico.aula_010;

/**
 * @author Lúcio Oliveira
 * @since 20 de set. de 2026
 * 
 * Enunciado: 
 * - O que são variáveis
 * - Como declarar variáveis
 * - Convenção de Nomenclatura
 * - Tipos Primitivos
 * 
 * Explicação:
 * 1. O que são variáveis: São espaços na memória do computador reservados para 
 *    armazenar dados que podem mudar (variar) durante a execução do programa.
 * 
 * 2. Como declarar variáveis: Informamos o tipo de dado seguido pelo nome da 
 *    variável e, opcionalmente, atribuímos um valor inicial.
 *    Sintaxe: `tipo nomeDaVariavel = valor;`
 * 
 * 3. Convenção de Nomenclatura (Padrão CamelCase):
 *    - Devem começar com letras minúsculas, cifrão ($) ou sublinhado (_). Nunca com números.
 *    - Usamos o padrão CamelCase (ex: `idadeDoCliente`, `salarioAtual`).
 *    - Devem ser descritivas (evitar nomes como `a`, `x`, `var1`).
 *    - Não podem ser palavras reservadas da linguagem (ex: `int`, `class`, `public`).
 * 
 * 4. Tipos Primitivos em Java:
 *    Armazenam valores brutos diretamente na memória. São divididos em 4 categorias:
 *    - Inteiros: `byte`, `short`, `int`, `long`
 *    - Ponto Flutuante (Decimais): `float`, `double`
 *    - Caractere: `char`
 *    - Booleano (Lógico): `boolean`
 */
public class IntroduçaoAVariaveis {

  /**
   * @param args argumentos de linha de comando
   */
  public static void main(String[] args) {

    // ==========================================
    // 1. DECLARAÇÃO E USO DE VARIÁVEIS
    // ==========================================
    
    // Declaração de uma variável inteira e atribuição de valor
    int idade = 25;
    
    // Modificando o valor da variável durante a execução
    idade = 26; 
    
    System.out.println("Idade atualizada: " + idade);


    // ==========================================
    // 2. CONVENÇÃO DE NOMENCLATURA (CamelCase)
    // ==========================================
    
    // Bons exemplos de nomes:
    String nomeCompleto = "Maria Silva";
    double salarioMensal = 4500.50;
    int totalDeAlunos = 40;
    
    // Exemplos incorretos ou que violam boas práticas (comentados para não dar erro):
    // int 2dias = 2;          -> Erro: Não pode começar com número.
    // String int = "Teste";   -> Erro: 'int' é uma palavra reservada.
    // double salario_atual;   -> Funciona, mas o padrão Java prefere camelCase (`salarioAtual`).

    System.out.println("Funcionária: " + nomeCompleto + " | Salário: R$ " + salarioMensal +" Total de alunos: " + totalDeAlunos);

    

    // ==========================================
    // 3. TIPOS PRIMITIVOS EM JAVA
    // ==========================================

    // --- Tipos Inteiros ---
    byte varByte = 127;                     // 8 bits (-128 a 127)
    short varShort = 32000;                 // 16 bits
    int idadePessoa = 30;                   // 32 bits (O mais utilizado para números inteiros)
    long populacaoTerra = 8000000000L;      // 64 bits (Necessita do 'L' ou 'l' no final para números grandes)

    // --- Tipos de Ponto Flutuante (Decimais) ---
    float altura = 1.75f;                   // 32 bits (Necessita do 'f' ou 'F' no final)
    double pi = 3.1415926535;               // 64 bits (O mais utilizado para decimais)

    // --- Tipo Caractere ---
    char genero = 'M';                      // 16 bits (Armazena um único caractere entre aspas simples)

    // --- Tipo Booleano ---
    boolean estaCadastrado = true;          // 1 bit (Assume apenas valores `true` ou `false`)

    // Exibindo os valores dos tipos primitivos
    System.out.println("\n--- Exibindo Tipos Primitivos ---");
    System.out.println("Byte: " + varByte);
    System.out.println("Short: " + varShort);
    System.out.println("Int (Idade): " + idadePessoa);
    System.out.println("Long (População): " + populacaoTerra);
    System.out.println("Float (Altura): " + altura);
    System.out.println("Double (Pi): " + pi);
    System.out.println("Char (Gênero): " + genero);
    System.out.println("Boolean (Cadastrado): " + estaCadastrado);
  }
}