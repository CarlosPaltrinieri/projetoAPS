package projetoaps;

import javax.swing.JOptionPane;

public class Ex5_Carlos {

    public static void main(String[] args) {
        int numConj[] = new int[3], qntConj, count = 0;

        qntConj = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao cálculo de conjuntos numéricos! \n"
                + "Digite a quantidade de conjuntos que vc quer cálcular"));

        do {
            for(; count < qntConj; count++) {
                numConj[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número do conjunto: "));
                numConj[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número do conjunto: "));
                numConj[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número do conjunto: "));
            }
        } while (numConj[0] > numConj[1]);
    }

}
