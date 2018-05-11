package projetoaps;

import javax.swing.JOptionPane;
        
public class Ex7_Carlos {

    public static void main(String[] args) {

        int pessoas = 25, idade[] = new int[pessoas], mediaPessoa[] = new int[3];
        double peso[] = new double[pessoas], altura[] = new double[pessoas], mediaAltura;
		
		JOptionPane.showMessageDialog(null, "Seja bem-vindo, digite a idade, altura e peso de 25 pessoas para continuar: ");
		
		for(int count = 0; count <= pessoas; count++){
			idade[count] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + (count + 1) + "º  pessoa:"));
			altura[count] = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura da " + (count + 1) + "º  pessoa:"));
			peso[count] = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da " + (count + 1) + "º  pessoa:"));
			
			if(idade[count] == 50){
				mediaPessoa[0]++;
			} else if(idade[count] >= 10 && idade[count] <= 20){
				mediaPessoa[1]++;
				mediaAltura = (mediaAltura + altura[count]);
			}
			
			if(peso[count] <= 40.0){
				mediaPessoa[2]++;
			}
		}
		mediaAltura = mediaAltura / mediaPessoa[1];
		mediaPessoa[2] = mediaPessoa / 100;
				
		JOptionPane.showMessageDialog(null, "A quantidade de pessoas com mais de 50 anos são: " + mediaPessoa[0] + "\n" +
											"A média da altura de pessoas com 10 à 20 anos é de: " mediaAltura + "\n" +
											"A porcentagem de pessoas com peso inferior a 40kgs é de: " + mediaPessoa[2] + "%");
    }
    
}
