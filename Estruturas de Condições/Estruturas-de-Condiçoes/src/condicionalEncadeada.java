

public class condicionalEncadeada {
    public static void main(String[] args) {
        // Condicional Encadeadas
        /*
         *  
            Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else), poderemos ter uma terceira, quarta e ou inúmeras condições.
         *
         */

         int nota = 6;
         

        if(nota >= 7)
            System.out.println("Aprovado");
        else if(nota >= 5 && nota <7)
                System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}
