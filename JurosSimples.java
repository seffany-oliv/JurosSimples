import java.util.Scanner;

public class JurosSimples {

    public static void main (String [] args){

        //Declaração de variáveis
        int ju, ca, ta, pra;//ju - Juros; ca - Capital; ta - taxa; pra - Prazo
        int op
        
        //Criação de instância de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa 
        System.out.println("\n\t\t\t--Calculadora de juros simples!!--\n");

        //menu 
        System.out.println("1. Calcular juros!");
        System.out.println("2. Calcular capital!");
        System.out.println("3. Calcular taxa!");
        System.out.println("4. Clacular prazo!");

        //Opição do usuário
        System.out.println("/nOpsão");
        op = entrada.nextInt();


    }
}