
package projetoaps;

public class Ex6_Bruno {

    public static void main(String[] args) {
        int num;
        for (num = 0; num < 20; num++) {
            if ((num % 2 == 0) && (num <= 8)) {
                System.out.println("Os núemros pares são: " + num);
            } else if ((num % 1 == 0) && (num <= 7)) {
                System.out.println("Os núemros impares são: " + num);
            }

        }
    }

}
