package soma;

import jdk.nashorn.internal.parser.Scanner;

public class Soma {

  public static void main(String[] args) {
      //definição de variaveis
      double n1,n2,n3,n4,valor;
      
      Scanner entrada = new Scanner(System.in);
      
      //entrada
      System.out.println(qual o valor do primeiro numero:);
      n1 = entrada.nextDouble();
      
        System.out.println(qual o valor do segundo numero:);
      n2 = entrada.nextDouble();
      
        System.out.println(qual o valor do terceiro numero:);
      n3 = entrada.nextDouble();
      
        System.out.println(qual o valor do quarto numero:);
      n4 = entrada.nextDouble();
      
      //processamento
      valor=(n1^2)+(n2^2)+(n3^2)+(n4^2)
              
      //saida
      System.out.println(a quantidade será:"+valor);        
              

      
  }
       

    
}
