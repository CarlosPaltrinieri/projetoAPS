package projetoaps;

import java.util.Scanner;

public class Ex1_Bruno {

    public static void main(String[] args) {
        int count;
        float num, result;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um número: ");
        num = entrada.nextFloat();
        
        for (count = 1; count <= 200; count++) {
            result = num * count;
            System.out.print(num + "*" + count + "=" + String.format("%.2f", result) + " | ");
            if (count % 10 == 0) {
                System.out.println("\n");
            }
        }
    }

}
