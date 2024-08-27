public class Operadores {
 public static void main(String[] args) {
    // Operadores de atribuição
    //é representado pelo sinal de igual "="
    String nome = "Rafael"; 
    int num = 12;
    //Um dos uso de sinal igual é para atribuir um valor ou nome a uma variavel. Outro uso é sobreescrever o valor de uma variavel.
    System.out.println("==============================================");
 //=================================================
    //Operadores Aritméticos
    //Os operadores aritméticos são usados para realizar operações matemáticas entre valores númericos , podendo se torna ou não uma expressão mais complexas
    
    double soma = 10.5 + 15.7;
    int subtração = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4);

    //Obs o operador de adição "+" ao ser usado em variavesi do tipo texto ele fará a concatenação  de texto, ou seja, a junção dos textos.
     String nomeCompleto = "LINGUAGEM "+" JAVA";
     System.out.println(nomeCompleto);
    // Mix de numero e texto 
    
    String concatenacao ="?"; 
    System.out.println(concatenacao);

    concatenacao = 1+1+1+"1";
    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;
    System.out.println(concatenacao);
    concatenacao = 1+"1"+1+"1";
    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;
    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1);
    System.out.println(concatenacao);
    System.out.println("========================================");
//==================================================
//Operadores Unários
/* Esse operadores são aplicados juntamente com um outro operador arítmetico.Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverte valores númericos e booleanos.

(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
---------------------------------------------------
(-) Operador unário de valor negativo – nega um número ou expressão aritmética;
---------------------------------------------------
(++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;
---------------------------------------------------
(--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;
---------------------------------------------------
(!) Operador unário logico de negação - nega o valor de uma expressão  booleana.
---------------------------------------------------
 */

int numero = 5;
		
//Imprimindo o numero negativo
System.out.println(- numero);

//incrementando numero em mais 1 numero, imprime 6
numero ++; 
System.out.println(numero);

//incrementando numero em mais 1 numero, imprime 7
System.out.println(numero ++);// ops algo de errado não está certo

System.out.println(numero);// agora sim, numero virou 7

//ordem de precedencia conta aqui
System.out.println(++ numero);

boolean verdadeiro = true;

System.out.println("Inverteu " + !verdadeiro);
System.out.println("============================================");
/*Operadores Ternário
 * Operador de condição ternaria é uma forma resumida para definir uma condição e escolher por um dentre dois valores. Voce deve pensar numa condição ternaria como se fosse uma condição IF normal, porem, de uma forma que toda a sua estrutura estará escrita nume única linha.
 * O operador ternario é representado pelos simbolos  "?" ":".
 * 
 */
 int a , b ;
 a = 5;
 b = 6;
 String resultado1 = a == b ? "verdadeiro " : "Falso";
 System.out.println(resultado1);
System.out.println("============================================");
 /*Operadores relacionais 
  * Operadores relacionais avaliam a realção entre duas varieaveis ou expressões.Neste caso, mais precisamente, definem se o operando à  esquerda é igual a , diferente, menor, menor ou igual , maior ou maior ou igual ao da direita. Retorna um valor do tipo booleano
  == Quando desejamos verificar se uma variável é IGUAL A outra.
    != Quando desejamos verificar se uma variável é DIFERENTE da outra.
    --------------------------------------------------
    >  Quando desejamos verificar se uma variável é MAIOR QUE a outra.
    --------------------------------------------------
    >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
    --------------------------------------------------
    < Quando desejamos verificar se uma variável é MENOR QUE outra.
    --------------------------------------------------
    <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
    --------------------------------------------------
  */
  int numero1 = 1;
  int numero2 = 2;
  if(numero1 > numero2)
  System.out.println("numero 1 é maior que numero 2 ");  
  if(numero1 < numero2)
  System.out.println("numero 1 é menor que numero 2");
  if(numero1 >=numero2)
  System.out.println("numero 1 é maior ou igual que numero 2");
  if(numero1 <= numero2)
  System.out.println("numero 1 é menor ou igual que numero 2 ");
  if(numero1 != numero2)
  System.out.println("numero 1 é diferente que numero 2  ");

   String nome1 = "Rafael";
   String nome2 = "RaFaEl";
   System.out.println(nome1 == nome2);
   String nome3 = new String("Rafael");
   System.out.println(nome1.equals(nome3));
   //Quando comparar objeto usar o "equals"
System.out.println("============================================ ");
   /*Operadores Logicos 
    * Representam o recurso que nos permite criar expressões logicas maiores a partir da junção de duas ou mais expressões 
    
    "&&" Operador Lógico "E"
    "||" Operador Lógico "OU"

    */
    // Operadores.java
boolean condicao1=true;

boolean condicao2=false;

/* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
expressões. 
É como se estivesse escrito:
 "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
*/

if(condicao1 && condicao2)
	System.out.print("Os dois valores precisam ser verdadeiros");;

//Se condicao1 OU condicao2 for verdadeira, executar código.
if(condicao1 || condicao2)
	System.out.print("Um dos valores precisa ser verdadeiro");
}   
}
