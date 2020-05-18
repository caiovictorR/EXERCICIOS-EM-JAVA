package custo;

public class Custo {

    public static void main(String[] args) {
        // definição de variaveis
        double custo,porcentagem,valor;
        
        //entrada
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o valor do custo?:");
        custo = entrada.nextDoble();
        
        //processamento
       valor=(custo*1.45*1.28)
               
        //saida
        System.out.println("O valor total é:"+valor);      
    }
    
}
