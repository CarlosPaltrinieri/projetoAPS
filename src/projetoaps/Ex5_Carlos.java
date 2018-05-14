
package projetoaps;

import javax.swing.JOptionPane;

public class Ex5_Carlos {

    public static void main(String[] args) {
        int numConj[] = new int[3], qntConj, count = 0, res[] = new int[3];

        qntConj = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo ao cálculo de conjuntos numéricos! \n"
                + "Digite a quantidade de conjuntos que vc quer cálcular"));

        
            for(; count < qntConj; count++) {
                numConj[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número do " + (count + 1) + "º conjunto: "));
                numConj[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número do " + (count + 1) + "º conjunto: "));
                numConj[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número do " + (count + 1) + "º conjunto: "));
            }
		
			if(numConj[0] < numConj[1] || numConj[0] < numConj[2]){
				res[0] = (numConj[0] + numConj[1] + numConj[2]);
				res[1] = (numConj[0] * numConj[1] * numConj[3]);
				res[2] = (res[0] / 3);
			
				JOptionPane.showMessageDialog(null,"A soma do " + (count + 1) + "º conjunto é : " + res[0] + "\n" +
										"O produto do " + (count + 1) + "º conjunto é: " + res[1] + "\n" +
										"A média do " + (count + 1) + "º conjunto é: " + res[2]);
			} else {
				JOptionPane.showMessageDialog(null, "O valor do conjunto não está em forma crescente");
				break;
			}
									
    }

}
