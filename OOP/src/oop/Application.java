package oop;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;



public class Application {    
    
    public List<Account> listAccount;
            
    public void init(){
       System.out.println("Iniciando aplicacao...");
            
       listAccount = new ArrayList<>();
       
       {//populate listAccount
        Account acc = new Account("Lucas", 123, 1000.0);
        
//        acc.setOwnerName("Lucas");
//        acc.setNumberAccount(123);
        
        listAccount.add(acc);
       }
       {//populate listAccount
        Account acc = new Account("Kaue", 124, 2000.00);
        
//        acc.setOwnerName("Kaue");
//        acc.setNumberAccount(124);
        
        listAccount.add(acc);
       }
       {//populate listAccount
        Account acc = new Account("Filipe", 125, 3000.00);
        
//        acc.setOwnerName("Filipe");
//        acc.setNumberAccount(125);
        
        listAccount.add(acc);
       }
       {//populate listAccount
        Account acc = new Account("Erik", 126, 4000.00);
 
//        acc.setOwnerName("Erik");
//        acc.setNumberAccount(126);
        
        listAccount.add(acc);
       }
       
    }
    
    public void run(){
        
//        for (int i = 0; i < listAccount.size(); i++) {
//            
//            if(listAccount.get(i).getOwnerName().equals("Lucas")){
//                
//                System.out.println(listAccount.get(i).getAccountNumber() + " // "+ listAccount.get(i).getOwnerName()+" // "+listAccount.get(i).getAccountBalance());
//                
//                
//                listAccount.get(i).depositBalance(1000000.0);
//                System.out.println(listAccount.get(i).getAccountBalance());
//                
//                Double newBalance = listAccount.get(i).withdrawBalance(973000.0);
//                System.out.println(listAccount.get(i).getAccountBalance());
//                System.out.println(newBalance);
//            }
//            
//            //System.out.println(listAccount.get(i).getOwnerName().equals("Thiago"));
//        }
        
        int escolha;

        do {
            String[] opcoes = { "Create Account", "Look Account", "Withdraw",
                    "Deposit", "Exit" };

            escolha = JOptionPane.showOptionDialog(null, "Choose an option:", "My Bank", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

            switch (escolha) {
                case 0 -> createNewAccount();
                case 1 -> lookAccount();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> JOptionPane.showMessageDialog(null, "Saindo...");
                default -> showMessage("Opção inválida!");
            }
        } while (escolha != 4);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private void deposit() {
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da sua conta: "));
        
        Account acc = null;
        
        for (int i = 0; i < listAccount.size(); i++) {            
            if(listAccount.get(i).getAccountNumber().equals(accountNumber)){
                acc = listAccount.get(i);
            }            
        }
        
        if(acc != null){
            Double value = Double.valueOf(JOptionPane.showInputDialog("Digite abaixo quanto você deseja depositar: "));
            acc.depositBalance(value);            
        }else{
            showMessage("Erro: Conta não encontrada! Operação cancelada");
        }
    }

    private void withdraw() {
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da sua conta: "));
        String ownerAccount = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta: ");
        
        Account acc = null;
        
        for (int i = 0; i < listAccount.size(); i++) {            
            if(listAccount.get(i).getAccountNumber().equals(accountNumber) && listAccount.get(i).getOwnerName().equals(ownerAccount)){
                acc = listAccount.get(i);
            }            
        }
        
        if(acc != null){
            Double value = Double.valueOf(JOptionPane.showInputDialog("Digite abaixo quanto você deseja retirar: "));
            
            Double newBalance = acc.withdrawBalance(value);         
            
            if(newBalance == -1.0){
                showMessage("Erro: Valor indisponível para saque!");
            }else {
                showMessage("Você ainda tem disponível o valor de R$"+newBalance);
            }
        }else{
            showMessage("Erro: Conta não encontrada! Operação cancelada");
        }
    }

    private void lookAccount() {
        int accountNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero da sua conta: "));
        String ownerAccount = JOptionPane.showInputDialog(null, "Digite o nome do titular da conta: ");
        
        Account acc = null;
        
        for (int i = 0; i < listAccount.size(); i++) {            
            if(listAccount.get(i).getAccountNumber().equals(accountNumber) && listAccount.get(i).getOwnerName().equals(ownerAccount)){
                acc = listAccount.get(i);
            }            
        }
        
        if(acc != null){
            String nmOwner = acc.getOwnerName();
            Integer numberAcc = acc.getAccountNumber();
            Double balance = acc.getAccountBalance();
            
            JOptionPane.showMessageDialog(null, "O titular da conta é "+nmOwner+", o numero da sua conta é "+numberAcc+" e o saldo total é R$"+balance);
            
        }else{
            showMessage("Erro: Conta não encontrada! Operação cancelada");
        }
    }

    private void createNewAccount() {
    String ownerName = JOptionPane.showInputDialog("Digite o seu nome: ");
    
    int maxAccountNumber = listAccount.stream().mapToInt(Account::getAccountNumber).max().orElse(0);
    
    int nextAccountNumber = maxAccountNumber + 1;
    
    listAccount.add(new Account(ownerName, nextAccountNumber, 0.0));
    
    JOptionPane.showMessageDialog(null, "Nova conta criada para " + ownerName + " o seu número de conta " + nextAccountNumber);
}

}
