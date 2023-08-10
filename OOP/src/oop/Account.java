package oop;


public class Account {
    private String ownerName;
    private Integer accountNumber;
    private Double accountBalance;
    
    public Account(String ownerName, int accountNumber, double accountBalance){
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.accountBalance = 0.0;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }
    
    public Integer getAccountNumber(){
        return this.accountNumber;
    }
    
    public Double getAccountBalance(){
        return this.accountBalance;
    }
    
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    
    public void setAccountNumber(Integer accountNumber){
        this.accountNumber = accountNumber;
    }
    
    public Double depositBalance(Double value){
        return this.accountBalance += value;
    }
    
    public Double withdrawBalance(Double value){
        if(accountBalance < value){
            return -1.0;
        }else{
            this.accountBalance -= value;
            return this.accountBalance;
        }
    }
    
}
