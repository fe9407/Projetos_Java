package inversor_valores;

import java.util.Scanner;

public class Inversor_valores {

    public static void main(String[] args) {
        // TODO code application logic here
        int valores[] = new int[10];
        int total=10;
        int qtd=0;
        int media=0;
        Scanner leitor = new Scanner(System.in);
        
        for(int x=0;x<=10;x++){
            System.out.println("Digite um valor para a posicao "+(x+1));
            valores[x]=leitor.nextInt();
            
            total = total+valores[x];
                    qtd=qtd+1;      
        }
        media=total/16;
            System.out.println("A media foi: "+media);     
    }

}
