import java.util.Scanner;

public class JurosSimples {

    public static void main (String [] args){

        //Declaração de variáveis
        double ju, ca, ta, pra;//ju - Juros; ca - Capital; ta - Taxa; pra - Prazo
        int op;
        
        //Criação de instância de entrada
        Scanner entrada = new Scanner(System.in);

        //Apresentação do programa 
        System.out.println("\n\t\t\t--Calculadora de juros simples!!--\n");

        //Menu 
        System.out.println("1. Calcular juros!");
        System.out.println("2. Calcular capital!");
        System.out.println("3. Calcular taxa!");
        System.out.println("4. Calcular prazo!");

        //Opção do usuário
        System.out.println("Opção: ");
        op = entrada.nextInt();

        if (op == 1){
            System.out.println("Calcular juros!");

            //Entradas
            System.out.println("Informe o Capital: ");
            ca = entrada.nextDouble();
            System.out.println("Informe a Taxa:");
            ta = entrada.nextDouble();
            System.out.println("Informe o Prazo: ");
            pra= entrada.nextDouble();

            //Processamento

            ju = (ca * ta * pra) /100;

            //Saida
            System.out.println("O valor do juros é: " + ju + "\n");
      
        }

        if (op == 2){
            System.out.println("Calcular capital!");

            //Entradas
            System.out.println("Informe o Juros: ");
            ju = entrada.nextDouble();
            System.out.println("Informe a Taxa:");
            ta = entrada.nextDouble();
            System.out.println("Informe o Prazo: ");
            pra= entrada.nextDouble();

            //Processamento

            ca =  ju / ((ta / 100) * pra);

            //Saida
            System.out.printf("O valor do capital é: R$ %.2f\n\n", ca);

        }

        if (op == 3){
            System.out.println("Calcular a taxa!");

            //Entrada
            System.out.println("Informe o Juros:");
            ju = entrada.nextDouble();
            System.out.println("Informe o Capital:");
            ca = entrada.nextDouble();
            System.out.println("Informe o Prazo:");
            pra = entrada.nextDouble();

            //Processamento

            ta = ju / ( ca * pra ) * 100;

            //Saída 
            System.out.printf("A ataxa será de: " + ta + "\n");

        }
    }
}