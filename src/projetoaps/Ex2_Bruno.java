package projetoaps;

import java.util.Scanner;

public class Ex2_Bruno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, result;
        
        System.out.println("Digite dois valores para saber o resultado de seu produto");
        System.out.println("Caso desejar sair, digite 0 em ambos valores");
        
        do {
            System.out.print("Insira um numero: ");
            num1 = entrada.nextInt();
            
            System.out.print("Insira um numero: ");
            num2 = entrada.nextInt();
            
            result = num1 * num2;
            System.out.println("O resultado do produto é: " + result);
            
        } while ((num1 != 0) && (num2 != 0));
    }

}

