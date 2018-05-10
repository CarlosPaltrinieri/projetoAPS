package projetoaps;

import javax.swing.JOptionPane;
        
public class Ex8_Carlos {

    public static void main(String[] args) {

        int pessoas = 15, idade[] = new int[pessoas], mediaIdade = 0, pessoaMesmaIdade[] = new int[4];
        double peso[] = new double[pessoas], mediaPeso[] = new double[4] = 0;
        
        JOptionPane.showMessageDialog(null, "Bem-vindo ao Cálculo médio de peso por Idade");
        
        for(int count = 0; count < pessoas; count++){
           idade[count] = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade da " + (count + 1) + "º  pessoa:"));
           peso[count] = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso da " + (count + 1) + "º pessoas:"));

           if (idade[count] >= 1 && idade[count] <= 10){
				pessoaMesmaIdade[0]++;
				mediaPeso[0] = (mediaPeso[0] + peso[count]);
			} else if(idade[count] >= 11 && idade[count] <= 20){
				pessoaMesmaIdade[1]++;
				mediaPeso[1] = (mediaPeso[1] + peso[count]);
			} else if(idade[count] >= 21 && idade[count] <= 30){
			    pessoaMesmaIdade[2]++;
				mediaPeso[2] = (mediaPeso[2] + peso[count]);
			} else {
				pessoaMesmaIdade[3]++;
				mediaPeso[3] = (mediaPeso[3] + peso[count]);
			}
           
        }
        mediaPeso[0] = mediaPeso[0] / pessoaMesmaIdade[0];
        mediaPeso[1] = mediaPeso[1] / pessoaMesmaIdade[1];
        mediaPeso[2] = mediaPeso[2] / pessoaMesmaIdade[2];
        mediaPeso[3] = mediaPeso[3] / pessoaMesmaIdade[3];
		
        JOptionPane.showMessageDialog(null, "A média de peso das pessoas com idade de 01 ano até 10 anos é: " + mediaPeso[0] + " Kgs \n" 
										+	"A média de peso das pessoas com idade de 11 ano até 20 anos é: " + mediaPeso[1] + " Kgs \n" 
										+	"A média de peso das pessoas com idade de 21 ano até 30 anos é: " + mediaPeso[2] + " Kgs \n" 
										+	"A média de peso das pessoas com mais de 31 anos de idade é: " + mediaPeso[3]);
    }
    
}
