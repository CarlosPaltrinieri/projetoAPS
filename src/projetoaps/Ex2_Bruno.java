package projetoaps;

import java.util.Scanner;

public class Ex2_Bruno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, result;
        
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
