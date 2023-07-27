package trabalhandoarrys;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class Main {


    public static void main(String[] args) {
        // TODO - Crie um programa com JOptionPane, que peça 3 notas e informe a media do aluno
        //media();
        
        //pedirVariasNotas();
        
        // Utilizando o array list, pegar quantos inteiros que o usuario quiser digitar
        // no final indique qual o menor número, qual o maior número e qual a média dos inteiros
        //menorMaiorComMedia();
        
        
        // para o array {10, -7, 18, 34, 58, 37}
        //remover ultimo elemento do arraylist
//            ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, -7, 18, 34, 58, 37));
//            numbers.remove(numbers.size() - 1);
//            System.out.println(numbers);
//            //remover primeiro elemento do arraylist
//            numbers.remove(0);
//            System.out.println(numbers);
//            //remover menor número do array
//            int min = numbers.get(0);
//            for (int num : numbers) {
//                if (num < min) {
//                    min = num;
//                }
//            }
//            numbers.remove(Integer.valueOf(min));
//            System.out.println(numbers);

        //para um trecho de texto digitado, transformar as vogais do texto para o formato l33t
        String resp = JOptionPane.showInputDialog("Digite o texto que deseja criptografar as vogais: ");
        leetTradutor(resp);

    }
    public static void leetTradutor(String frase){
        StringBuilder l33tFrase = new StringBuilder();

        for (int aux = 0; aux < frase.length(); aux++) {
            char ch = frase.charAt(aux);
            switch (ch) {
                case 'a':
                case 'A':
                    l33tFrase.append("4"); 
                    break;
                case 'e':
                case 'E':
                    l33tFrase.append("3"); 
                    break;
                case 'i':
                case 'I':
                    l33tFrase.append("1");
                    break;
                case 'o':
                case 'O':
                    l33tFrase.append("0"); 
                    break;
                case 'u':
                case 'U':
                    l33tFrase.append("_"); 
                    break;
                default:
                    l33tFrase.append(ch); 
                    break;
            }
        }

        String leetTexto = l33tFrase.toString();
        JOptionPane.showMessageDialog(null, "Mensagem Criptografada: \n"+leetTexto);
    }
    
    public static void menorMaiorComMedia() {
        ArrayList<Integer> numbers = new ArrayList<>();

        String resp = "";

        //entrada de dados
        while (!resp.equals("x")) {
            resp = JOptionPane.showInputDialog("Digite um número inteiro ou x para sair:");
            if (!resp.equals("x")) {
                numbers.add(Integer.parseInt(resp));
            }
        }
        //System.out.println(numbers);
        
        //pegar menor
        Integer menor = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if(numbers.get(i) < menor){
                menor = numbers.get(i);
            }
        }
        //System.out.println(menor);
        
        Integer maior = numbers.get(0);
        for(Integer n : numbers){
            if(n > maior){
                maior = n;
            }
        }
        
        Double media = 0.0;
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()){
            media+=it.next();
        }
        media /= numbers.size();
        
        JOptionPane.showMessageDialog(null, "Dos números inteiros digitados\n"+
                                                "O menor número é: "+menor+"\n"+
                                                "O maior número é: "+maior+"\n"+
                                                "A média dos números é: "+media);
    }

    public static void pedirVariasNotas() {
        Double[] notas = new Double[1];
        String resp = "";

        int contador = 0;
        while (!resp.equals("-1")) {
            resp = (JOptionPane.showInputDialog("Dige a nota ou -1 para encerrar:"));
            if (!resp.equals("-1")) {
                if (notas.length == contador) {
                    Double[] newNotas = new Double[contador + 1];
                    for (int i = 0; i < notas.length; i++) {
                        newNotas[i] = notas[i];
                    }
                    notas = newNotas;
                }
                notas[contador] = Double.parseDouble(resp);
                contador++;
            }
        }
    }

    public static void media() {

        Double[] notas = new Double[3];

        for (int i = 0; i <= 2; i++) {
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota:"));
        }

        double media = (notas[0] + notas[1] + notas[2]) / 3;

        JOptionPane.showMessageDialog(null, "A média do aluno foi de " + media + ".");
    }

}
