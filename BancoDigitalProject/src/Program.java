import entities.Account;
import entities.CheckingAccount;
import entities.Client;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Client santiago = new Client(00000000,"santiago");
        Account c1 = new CheckingAccount(3000,300.00,santiago.getName());
        Account c2 = new SavingsAccount(300.00,santiago.getName());
        santiago.getAccounts().add(c1);
        santiago.getAccounts().add(c2);
        c2.deposit(200.00);

        c1.deposit(100.00);
        c1.transfer(50.00,c2);

        for(Account account: santiago.getAccounts()){
            System.out.println(account);
        }

    }
}
