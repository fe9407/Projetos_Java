package conversor_temperatura;

import java.util.Scanner;

public class Conversor_temperatura {
    
    public static void main(String[] args) {
       
      Scanner leitor = new Scanner(System.in);
      double opcao,c,f;
      
      System.out.println("Converter de celcius para ferenheit(1) converter de farenheit para celcius(2)");
      opcao=leitor.nextDouble();
      
      if(opcao==1){          
        System.out.println("Informe o valor da temperatura em celcius: ");
        c=leitor.nextDouble ();
        f=(c*9/5)+32;     
      System.out.println("valor em farenheit: "+f);  
      }
      
      else if(opcao==2){
        System.out.println("Informe o valor da temperatura em farenheit: ");
        f=leitor.nextDouble();
        c=(f-32)/1.8;  
        System.out.println("valor em celcius: "+c);
      }
      
      else{
        System.out.println("Número invalido");
      }
    }
  }
