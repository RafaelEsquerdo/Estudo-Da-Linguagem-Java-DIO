## Tratamento de Exceções
        Ao executar o código Java, diferentes erros podem acontecer: erros de codificação feitos pelo programador, erros devido a entrada errada ou outros imprevistos.

        Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma exceção (jogará um erro).

        De forma interpretativa em Java, um erro é algo irreparável, a aplicação trava ou é encerrada drasticamente. Já exceções é um fluxo inesperado da  nossa aplicação, exemplo: Querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválida. Todos estes cenários e os demais não são erros mas sim fluxos não previstos pela aplicação.

         É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de Tratamento de Exceçõe
## Tipos de exceções mais comuns:
 java.lang.NullPointerException: 
 **Quando tentamos obter alguma informação de uma variável nula.**

java.lang.ArithmeticException	
**Quando tentamos dividir um valor por zero.**

java.sql.SQLException	
**Quando existe algum erro relacionado a interação com banco de dados.**

java.io.FileNotFoundException	
**Quando tentamos ler ou escrever em um arquivo que não existe.**

## Tratando Exceções
    E quando inevitavelmente ocorrer uma exceção? Como nós desenvolvedores podemos ajustar o nosso algoritmo para amenizar o ocorrido?

    A instrução try permite que você defina um bloco de código para ser testado quanto a erros enquanto está sendo executado.

    A instrução catch permite definir um bloco de código a ser executado, caso ocorra um erro no bloco try.

    A instrução finally permite definir um bloco de código a ser executado independente de ocorrer um erro ou não. As palavras-chave try e catch vêm em pares:

## SINTAXE
try {
  //  bloco de código conforme esperado
}
catch(Exception e) {// precisamos saber qual exceção
  // bloco de código que captura as exceções que podem acontecer
  // em caso de um fluxo não previsto
}
## Hierarquia das Exceções
    A linguagem Java dispõe de uma variedade de classes que representam exceções, e estas classes são organizadas em uma hierarquia denominadas Checked and Unchecked Exceptions ou Exceções Checadas e Não Checadas.
    O que determina uma exceção ser classificado como checada ou não checada ?

    É o risco dela ser disparada logo você precisa tratá-la, exemplo: {% endhint %}

    Vamos imaginar que precisamos realizar de duas maneiras a conversão de uma String para um número, porém o texto contém Alfanuméricos.
## Exceções Customizadas
    Nós podemos criar nossas próprias exceções baseadas em regras de negócio e assim melhor direcionar quem for utilizar os recursos desenvolvidos no projeto, exemplo: