
import java.util.concurrent.ThreadLocalRandom;
;



public class While {
    public static void main(String[] args) throws Exception {
       double mesada = 50.0;
       while (mesada >0){
        Double valorDoce = valorAleatorio();
        if(valorDoce >= mesada)
            valorDoce = mesada;


            System.out.println("O doce da valor: R$: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
       }
       System.out.println("A mesada do João agora é de: "+ mesada);
       System.out.println("Joãozinho gastou toda a sua mesada em doces");
       
    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
