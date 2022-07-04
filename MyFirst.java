import main.Account;
import main.Customer;

public class MyFirst {
    public static void main(String[] args) {
        Account a=new Account("123223342","SBAccount",5600.00f);
        Customer c=new Customer("C100","Ajay","AEJPR8553G",a);
        c.display();

    }
}
