package Cotaçao; 
        
import java.util.Scanner;

public class Cotaçao {
    
    public static void main (String[] args)  
            
      //definição de variaveis     
      double dolar,valor,result;
      
      //entrada
      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Qual o valor do dolar hj?:");
      dolar = entrada.nextDouble();
      
       System.out.println("Quanto voce quer converter?:");
      valor = entrada.nextDouble();
      
      
      //processamento
      result = valor/dolar;
      
      
      //saida
      
      System.out.println("Você tem:$"+result);
      
     }

