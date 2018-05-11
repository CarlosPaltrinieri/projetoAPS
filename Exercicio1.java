package aps;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int num, count, result;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe um número: ");
        num = entrada.nextInt();
        for (count = 1; count <= 200; count++) {
            result = num * count;
            System.out.print(+ result+ " ");
            if(count%10==0){
                System.out.println("\n");
            }
        }
    }

}
