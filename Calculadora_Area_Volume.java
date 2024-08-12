package calculadora_volume;

import java.util.Scanner;

public class Calculadora_volume {

    public static void main(String[] args) {
     
        Scanner leitor = new Scanner(System.in);
        double opcao,b,a,h,v;
        
        System.out.println("Informe o que deseja calcular: area(1) ou volume(2)");
        opcao=leitor.nextDouble();
        
        if(opcao==1){
           System.out.println("Informe o comprimento da lateral A centimetros(cm): ");
           a=leitor.nextDouble();
           
           System.out.println("Informe a largura em centimetros(cm): ");
           b=leitor.nextDouble();
                  
           v=b*a;
           
           System.out.println("A area do objeto e de: "+v);
        }
        else if(opcao==2){
           System.out.println("Informe o comprimento em centimetros(cm): ");
           b=leitor.nextDouble();
           
           System.out.println("Informe a largura em centimetros(cm): ");
           a=leitor.nextDouble();
           
           System.out.println("Informe a altura em centimetros(cm): ");
           h=leitor.nextDouble();
           
           v=a*b*h;
           
           System.out.println("O volume e de: "+v+" cm3");
        }
        else{
            System.out.println("Digite somente 1 ou 2");
        }
    } 
}
