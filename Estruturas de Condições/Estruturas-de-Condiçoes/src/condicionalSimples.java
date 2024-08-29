public class condicionalSimples {
    public static void main(String[] args) {
            // Condicional Simples
            /*
            Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura Simples.
            */
    
            double saldo = 25.0;
            double valorSolictado = 26.0;

            if(valorSolictado < saldo)
                saldo = saldo - valorSolictado;

                System.out.println(saldo);

            
        
                
    }
}
