

public class Usuairio {
    
    public static void main(String[] args)  {
      
       //Métodos: Uma classe é definida por atributos e metodos. Os métodos , por sua vez, correspondem a funções ou sub-rotinas disponiveis dentro de nossas classes.
       /*Criterios de nomeação de Métodos
        * Esses criterios não são obrigatorios , mas é recomendado pois facilitam a vida dos programdores ao trabalharem em codigos de forma colaborativas 
        - Deve ser nomeados como verbos
        - Seguir o padrão  camelCase(Todas as letras minúsculas com a exceção da primeira letra da segunda palavra)
        */
        //Exemplos
        SmartTv smartTv = new  SmartTv();

        System.out.println("O volume atual: "+smartTv.volume);
    
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("O volume foi diminuido para o volume: "+smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("O volume foi aumentado para o volume: " + smartTv.volume);

        System.out.println();
        System.out.println("TV está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal ? "+"Canal " + smartTv.canal);
        System.out.println("Qual o volume da Tv?" +" Volume "+ smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Ligar Tv "+ smartTv.ligada);
        smartTv.desligar();
        System.out.println("Desligar Tv "+ smartTv.ligada); 
        System.out.println("O canal atual:" + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("O novo canal foi para: "+ smartTv.canal);


    }



   
}
