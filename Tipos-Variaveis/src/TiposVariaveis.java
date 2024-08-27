public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int inteiro = 1295555555;
        long longo = 98765456789l;
        short pequeno = 120;
        double salarioMinimo = 2500.33;
        inteiro = pequeno;
        pequeno=(short) inteiro; //casting

        //variaveis vs constantes
       // O final não permite a alteração da variaveis.
       final double Valor_De_PI = 3.14;
       System.out.println(Valor_De_PI);
    
    }
}
