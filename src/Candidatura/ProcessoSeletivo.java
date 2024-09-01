package Candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"Felipe", "Marcia","Julia","Paulo","Augusto"};
        for (String candidato : candidatos){
                entrandoEmContato(candidato);
        }
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe", "Marcia","Julia","Paulo","Augusto"};
        System.out.println("Imprimindo a lista do candidato, informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length ; indice++) {
            System.out.println("O candidato de número: " + (indice+1)+ " é " + candidatos[indice]);

        }
        System.out.println("----------------------------------------------------------------");
        for(String candidato : candidatos){
            System.out.println("0 candidato selecionado foi: " + candidato);
        }
    }
    static void selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniela","Jorge"};
        int candidatosSelecionados = 0;
        int candidatoAtual=0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato: " + candidato + " Solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato: " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            else{
                System.out.println("O candidato: "+ candidato + " não foi selecionado para a vaga");
            }
            candidatoAtual++;


        }


    }
    static void analisarCandidato(double salarioPretendido){
            double salarioBase = 2000.0;
            if(salarioBase >  salarioPretendido)
                System.out.println("Ligar para o candidato. ");
            else if(salarioBase == salarioPretendido)
                System.out.println("Ligar para o candidato com contra proposta. ");
            else
                System.out.println("Aguardando  resultado demais candidatos. ");


    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static boolean atender(){
        return new Random().nextInt(3)==1;
    }
    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do{
            atendeu = atender();
            continuarTentando =! atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else System.out.println("Contato realizado com sucesso");
        }while(continuarTentando && tentativasRealizadas<3);
        if(atendeu)
            System.out.println("Conseguimos entrar em contato com: "+ candidato+ " Na " +tentativasRealizadas);
        else
            System.out.println("Não conseguimos entrar em contato com: "+ candidato+" O numero de tentativas foram de: "+ tentativasRealizadas+ " Realizadas" );



    }
}
