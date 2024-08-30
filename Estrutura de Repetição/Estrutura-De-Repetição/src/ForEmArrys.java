public class ForEmArrys {
    public static void main(String[] args) {
    String alunos[] = {"Felipe","Jonas","Julia","Marcos"};
        for (int i = 0; i < alunos.length ; i++) {
            System.out.println("O aluno no indice x= "+ i + " : é " + alunos[i]);
        }
        System.out.println("============================================");
        //Outra forma de busca de for usar o for each
        System.out.println("============================================");
        for(String aluno : alunos){
            System.out.println("O nome do aluno é: "+aluno);
        }

    }
}
