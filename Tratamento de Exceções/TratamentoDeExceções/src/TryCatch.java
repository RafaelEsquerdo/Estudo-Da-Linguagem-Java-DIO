
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scan.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scan.next();

            System.out.println("Digite sua idade");
            int idade = scan.nextInt();
            
            System.out.println("Digite sua altura");
            double altura = scan.nextDouble();
            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");
            scan.close(); 
        }  
        catch(InputMismatchException e){
            System.err.println("O campos idade e altura precisam ser númericos");
        }
    }
}
