package conversao
public class conversao {
    
    public static void main(String[]args)
     //definição de variaveis
    double hora,minuto,convert;
    
    //entrada
    Scanner entrada = new Scanner (System.in);
    
    system.out.prinln("que horas são:");
    hora= entrada.nextDouble();
   
        
    system.out.prinln("quantos minutos são:");
    minuto= entrada.nextDouble();
    
    //processamento
    convert=(minuto/60)+hora
            
    //saida
     system.out.prinln("a conversão de minutos para hora é:"+convert);        

}
