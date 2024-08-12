package verificador_numeros;

import java.util.Scanner;

public class Verificador_numeros {

    public static void main(String[] args) {
    
       int num[] = new int [4]; 
        
       int contador;
       
       contador=0;
       
       int posicao;
       
       posicao=0;
       
       Scanner leitor = new Scanner(System.in);
       
       int ValorAtual;
       
       while ( posicao <= 3 ){
           
           System.out.println("Informe o valor inteiro para a posicao " +posicao);
           ValorAtual=leitor.nextInt();
           
           if( ValorAtual > 0 ){
               
               contador++;
           }
           num[posicao]=ValorAtual;
           
           posicao++;
       }    
       System.out.println("Voce digitou " +contador+ " numeros positivos.");
    }  
}
