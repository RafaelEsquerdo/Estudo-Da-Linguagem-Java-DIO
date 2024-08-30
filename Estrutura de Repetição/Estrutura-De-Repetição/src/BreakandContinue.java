public class BreakandContinue {
    public static void main(String[] args) {
        //Break
        // class ExemploBreakContinue.java
        for(int numero = 1; numero <=5; numero ++){
		    if(numero==3)
			break;
		
		    System.out.println(numero);
            
	    }
        System.out.println("\n========================================\n");
        //Continue
        for(int numeroC = 1; numeroC <=5; numeroC ++){
            if(numeroC==3)
                continue;
            
            System.out.println(numeroC);
            
        }

    }
}
    

