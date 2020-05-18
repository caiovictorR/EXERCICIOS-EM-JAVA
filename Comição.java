package comição;

public class Comição {
    public static void main(String[] args) {
   
         double preço,comiçao,quant,resp;
      
      Scanner entrada = new Scanner(System.in);
      
      //entrada
      System.out.println(digite o preço da peca:);
      preço = entrada.nextDouble();
      
        System.out.println(digite a quantidade vendida:);
     quant = entrada.nextDouble();
     
      //processamento
      resp=preco*quant
              
      //saida
      System.out.println(mais a aplicação da comição de 5% voce irá pagar:R$"+resp);        
              

    }
    
}
