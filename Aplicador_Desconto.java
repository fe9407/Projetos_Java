package questao1;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        
       double valor_unitario,valor_sem_desc,valor_com_desc;
       int quantdade_prod;
       int desconto=0;
       
       Scanner leitor = new Scanner(System.in);
       
       System.out.println("Bem vindo a lojinha");
       System.out.println("Entre com o valor do produto:");
       valor_unitario = leitor.nextDouble();
       System.out.println("Entre com o valor da quantidade:");
       quantdade_prod = leitor.nextInt();
       valor_sem_desc = (valor_unitario*quantdade_prod);
       
       if(quantdade_prod<=0){
        valor_com_desc =valor_sem_desc - (valor_sem_desc * 0);
        desconto = 0;
       }
       else if((quantdade_prod>=10)&& (quantdade_prod<=99)){
        valor_com_desc =valor_sem_desc - (valor_sem_desc * 0.05); 
        desconto = 5;
       }
       else if((quantdade_prod>=100)&& (quantdade_prod<=999)){
        valor_com_desc =valor_sem_desc - (valor_sem_desc * 0.10); 
        desconto = 10;
       }
       else{
       valor_com_desc =valor_sem_desc - (valor_sem_desc * 0.15);
       desconto = 15;
       }
       System.out.println("O valor sem desconto:"+valor_sem_desc);
       System.out.println("O valor com desconto:" +valor_com_desc+ " (desconto de "+desconto+"%)");  
    }
}
