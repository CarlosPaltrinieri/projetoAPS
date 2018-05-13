package projetoaps;

public class Ex4_Bianca {

    public static void main(String[] args) {
        int numP2 = 1, num1 = 1, Axx = 0;
        System.out.print("1" + " ");
        while (num1 <= 100) {
            System.out.print(num1 + " ");
            Axx = num1;
            num1 = num1 + numP2;
            numP2 = Axx;
        }
    }
}
