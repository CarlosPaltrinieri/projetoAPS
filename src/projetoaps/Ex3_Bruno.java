package projetoaps;

public class Ex3_Bruno {

    public static void main(String[] args) {
        int num;
        
        for (num = 1000; num <= 1999; num++) {
            if (num % 11 == 5) {
                System.out.println("Os números são: " + num);
            }
        }
    }

}
