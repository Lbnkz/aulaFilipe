/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafio1207;

/**
 *
 * @author Aluno
 */
public class DesafioBubbleSort {

    /**
     * @param args the command line arguments
     */
//        public static void main(String[] args) {
//            double[] vetor = {12, 11, 17, 54.5, 54.3, 37, 74, 97};
//            double[] vetor2 = {3, 4, 7, 13, 9};
//
//            ordenar(vetor, true);
//            print(vetor);
//            ordenar(vetor, false);
//            print(vetor);
//
//            ordenar(vetor2, true);
//            print(vetor2);
//            ordenar(vetor2, false);
//            print(vetor2);
//        }

     static void ordenar(double[] vet, boolean cresc) {
        if(cresc ){
            System.out.println("Vetor em ordem crescente: ");
        }else{
            System.out.println("Vetor em ordem decrescente: ");
        }
        double aux;
        int n = vet.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (cresc) {
                    if (vet[j] > vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;		
                    }
                } else {
                    if (vet[j] < vet[j + 1]) {
                        aux = vet[j];
                        vet[j] = vet[j + 1];
                        vet[j + 1] = aux;		
                    }
                }
            }
        }
    }

    static void print(double[] vet) {
        for (double num : vet) {
            System.out.print(num + " ");
        }
        System.out.println("");
    }

}
