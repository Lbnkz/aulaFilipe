package trabarray;


import javax.swing.JOptionPane;
import java.util.ArrayList;

public class ArrayLista {

//        public static void main(String[] args) {
//            //media();
//
//
//            //Utilizando o array list, pegar quantos inteiros o usuario quiser digitar no final 
//            //indique qual o menor, qual o maior e qual a media dos inteiros
//            ArrayList<Integer> numbers = new ArrayList<>();
//            String resp = "";
//
//            while (!resp.equals("x")) {
//                resp = JOptionPane.showInputDialog("Digite um numero inteiro ou x para encerrar: ");
//                    if(!resp.equals("x")){
//                        numbers.add(Integer.parseInt(resp));
//                    }
//            }
//
//            Integer menor = numbers.get(0);
//            Integer maior = numbers.get(0);
//            Integer soma = 0;
//            for (Integer n : numbers) {
//                if(n > menor){
//                    menor = n;
//                }
//                if(n < maior){
//                    maior = n;
//                }
//                soma += n;
//            }
//
//            int media = soma/numbers.size();
//
//
//            JOptionPane.showMessageDialog(null, "O menor numero recebido foi: "+menor+"; o maior foi: "+maior+"; e a media geral foi de: "+media);
//        }
    
    public static void pedirVariasNotas(){
        Double[] nota = new Double[1];
        String resp = "";
        
        int contador = 0;
        
        while(!resp.equals("-1")){
            resp = JOptionPane.showInputDialog("Digite a nota ou -1 para encerrar: ");
            if(!resp.equals("-1")){
                if(nota.length == contador){
                    Double[] newNotas = new Double[contador + 1];
                    for (int i = 0; i < nota.length; i++) {
                        newNotas[i] = nota[i];
                    }
                    nota = newNotas;
                }
                nota[contador] = Double.parseDouble(resp);
                contador++;
            }
        }
    }
    
    public static void media(){
        Double notasAlunos[] = new Double[3];
        Double media;
        for(int i = 0; i < 3; i++){
            notasAlunos[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"° nota: "));
        }
        media = (notasAlunos[0]+notasAlunos[1]+notasAlunos[2])/3;
        JOptionPane.showInputDialog(null, "oi"+media);
        
    }
            
}
