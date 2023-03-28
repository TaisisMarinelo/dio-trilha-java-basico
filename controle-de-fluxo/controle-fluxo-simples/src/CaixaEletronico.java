public class CaixaEletronico {

    public static void main(String[] args) {

        double saldo = 25.0;
        //double valorSolicitado = 17.0; //EXECUTA O FLUXO
        double valorSolicitado = 26.0;  //NÃO EXECUTA O FLUXO
 
        if(valorSolicitado < saldo)
         saldo = saldo - valorSolicitado;
 
         System.out.println(saldo);
        
        
    }
    
}
