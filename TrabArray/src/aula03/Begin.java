/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Aluno
 */
public class Begin {

    /**
     * @param args the command line arguments
     */
//        public static void main(String[] args) {
//            // TODO code application logic here
//
//            System.out.println("Alô mundo!");
//
//            int idade; //declarei uma variavel
//            idade = 32; //inicializei a variavel
//
//            System.out.println("A minha idade é " + idade);
//
//            //Exercicio 4 - Faça um Programa que verifique se cada letra do array é vogal ou consoante
//            String[] arrayDeLetras = {"a", "A", "z", "t", "e", "Y", "u", "O"};
//
//            int i;
//            for (i = 0; i < arrayDeLetras.length; i++) {
//                //System.out.println(""+i);
//
//                String letra = arrayDeLetras[i].toUpperCase();
//                if (letra.equals("A") || letra.equals("E") || letra.equals("I")
//                        || letra.equals("O") || letra.equals("U")) {
//
//                    System.out.println("Encontrei uma Vogal!");
//                } else {
//                    System.out.println("Encontrei uma Consoante!");
//                }
//            }
//            System.out.println("" + i);
//
//            //Exemplo escopo de variavel
//            //scopo a
//            {//scopo b ---- herda de a
//                float n1 = (float) 0.8;
//
//                System.out.println(n1);
//                {//scopo c ----- herda de b e a
//                    float n2 = (float) 0.9;
//                    n2 += n1; //n2 = n1+n2; 
//                    System.out.println(n2);
//                }
//            }
//            {
//                float n1 = (float) 0.5;
//
//                System.out.println(n1);
//            }
//
//            double[] lista = {1, 2, 3, 4, 5, 6, 7.6, 8, 9, 10};
//            somaVetor(lista);
//
//
//
//
//        }

    static void somaVetor(double[] vetor) {
        Double result = new Double(0);
        for (int index = 0; index < vetor.length; index++) {
            result += vetor[index];
        }
        System.out.println(result);
    }
}
