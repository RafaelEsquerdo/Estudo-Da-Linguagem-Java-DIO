public class condiçãoTernária {
    public static void main(String[] args) {
        // Condição Ternária
        /* 
         * 
            Como vimos em operadores, podemos abreviar nosso algorítmico condicional refatorando com o conceito de operador ternário. Vamos refatorar os exemplos acima para ilustrar o poder deste recurso.
         * 
        */
        //cénario 1
        int nota = 7;
        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
        System.out.println("Resultado nota 1"+resultado);

        //cénario 2
        int nota2 = 6;
        String resultado2 = nota2 >=7  ? "Aprovado" : nota >=5 && nota < 7? "Recuperação" : "Reprovado";
        System.out.println("Resultado nota 2: "+ resultado2);
    }
}
