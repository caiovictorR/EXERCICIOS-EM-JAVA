package percurso

import java.util.Scanner;

public class percurso {
    
    public static void main (String[] args)
         //definição de variaveis   
        double percurso,tempo,resp;
        
        //entrada
        Scanner entrada =new Scanner(System.in);
        
        System.out.println("Qual foi o percurso percorrido:")
        percurso= entrada.nextDouble();
        
         System.out.println("Qual o tempo gasto nesse percurso (em decimal):")
        tempo= entrada.nextDouble();
         
         //processamento
         resp= (percurso/tempo)
                 
        //saida
         System.out.println("voce percorreu:"+resp)         
    
}
