package main;

public class Customer {
         String custId;
         String custName;
         String panCard;
         Account myAccount;

    public Customer(String custId, String custName, String panCard,Account a) {
        this.custId = custId;
        this.custName = custName;
        this.panCard = panCard;
        this.myAccount=a;
    }

    public void display(){
        System.out.println(custId+"\t"+custName+"\t"+panCard);
        System.out.println("AcctNo : "+ myAccount.acctNum+"\t Balance : "+ myAccount.balance);
        System.out.println("Hello World");
    }
}

