public class Conta {
    double saldo = 10.00;

    public void sacar (Double valor){
        //variavel local do método : Valor
        double novoSaldo = saldo - valor;
    }
    public void imprimirSaldo(){
        //disponivel em toda classse: Saldo
        saldo++;
        System.out.println(saldo);
        //somente o metodo sacar  conhece essa variavel
       // System.out.println(novoSaldo);\\

      
    
    }
    public double calcularDividaExponencial(){
        //variavel local de método: valorParcela
        //variavel local de método: valorMontate
        double valorParcela = 50.00;
        double valorMontante = 0.0; // começando com o valor zero
        for(int x = 1; x<=5;x++){//x variável de escopo de fluxo
			//esta variável será reiniciada a cada execução for
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;

        }
        return valorMontante;

       }
}
