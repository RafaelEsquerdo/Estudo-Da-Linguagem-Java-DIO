## Estrutura de Repetição
    Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, 
    são comandos que permitem iteração de código, ou seja, 
    que comandos presentes no bloco sejam repetidos diversas vezes.
    ================================================================================================
### Estrutras de Repetição: **FOR**
    O comando for  permite que uma variável contadora seja testada e incrementada a cada iteração, 
    sendo essas informações definidas na chamada do comando.
    **SINTAXE**
        For(int i = 0; i <=10; i++){

        }
    ================================================================================================    
### Estrutura de Repetição: **FOR em Arrys**
    O uso do for / each está fortemente relacionado com um cenário onde contenha um array ou coleção, e assim, a interação é baseada aos elementos da coleção.
        for(int i = 0 ; i <= x.length; i++) // X é uma variavel qualquer.
        
        OU USAR O FOREACH
        String y = {"A","B","C"}
        for(String x : y){
            sout(x)
        }
    =================================================================================================
### **Break** e **Continue**
    Break, significa: Quebrar, parar, frear, interromper. E é isso que se faz quando o  java encontrar esse comando pela frente. Já o **Continue** interrompe soemnte a iteração atual
    Exemplo Break:

    // class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			break;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }

    Exemplo Continue:

    // class ExemploBreakContinue.java
public class ExemploBreakContinue {
	public static void main(String[] args) {
	
	for(int numero = 1; numero <=5; numero ++){
		if(numero==3)
			continue;
		
		System.out.println(numero);
		
	}
	//Qual a saída no console ?

    }


}
}
## Estrutura de Repetição: **While**
    O laço while (na tradução literal para a língua portuguesa “enquanto”) determina que enquanto uma condição for válida, o bloco de código será executado. O laço while testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste o bloco nem será executado.
    **SINTAXE**
        
            while (expressão booleana de validação)
            {
                // comando que será executado até que a 
                // expressão de validação torne-se falsa 
            }
## Estrutura de repetição: **DoWhile**
    O laço do / while (na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado. Entretanto, do / while testa a condição após executar o código,sendo assim, mesmo que a condição seja considerada inválida no primeiro teste o bloco será executado pelo menos uma vez.
    **SINTAXE**
        do
{
    // comando que será executado até que a 
     // expressão de validação torne-se falsa 
}
while (expressão booleana de validação);