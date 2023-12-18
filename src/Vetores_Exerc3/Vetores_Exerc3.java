package Vetores_Exerc3;

import javax.swing.*;

public class Vetores_Exerc3 {

    public static void main(String[] args) {
        
        //Questão_3 em Revisão
        int[] V,W,R; V = new int[5]; W = new int[5]; R = new int[5];
        
        for (int i=0;i<8;i++){
            V[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe um Numero Inteiro:"));
            W[i]=Integer.parseInt(JOptionPane.showInputDialog("Informe um Numero Inteiro, para somar com o anterior:"));
            R[i]=V[i]+W[i];
            System.out.println(V[i]+" + "+W[i]+" = "+R[i]);
        }
        double soma=0; int cont=0;
        for (int i=0;i<8;i++){
            if (R[i]>25){
                soma = soma+R[i];
                cont++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A média da soma dos resultados obitidos são = "+soma/cont++);
     
    }
    
}
