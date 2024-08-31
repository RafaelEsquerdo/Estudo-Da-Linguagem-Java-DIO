
import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        //Hierarquia das Exceções
        try{
            //Number valor = Double.valueOf("a1.75");
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println(valor);
        }  
        catch(ParseException e) {
            e.printStackTrace();
        }
    }
}
