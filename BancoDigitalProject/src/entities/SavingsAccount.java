package entities;

import exceptions.DigitalBankException;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SavingsAccount extends Account{
    private double BASE_YIELD = 0.05;
    private List<Deposit> deposits = new ArrayList<>();

    public List<Deposit> getDeposits() {
        return deposits;
    }

    public SavingsAccount(int agency, double balance, String holder) {
        super(agency, balance, holder);
    }

    public SavingsAccount(double balance, String holder) {
        super(balance, holder);
    }

    @Override
    public void deposit(double value){
        if(value<=0.0){
            throw new DigitalBankException("invalid value");
        }
        deposits.add(new Deposit(new Date(),value));
        super.deposit(value);
    }

    public void refreshBalance(){
        Date today = new Date();
        for (Deposit deposit : deposits) {
            if ((deposit.getDate().getTime() - today.getTime()) == (30 * 24 * 60 * 60 * 1000)) {
                double yield = deposit.getAmount() * BASE_YIELD;
                super.deposit(yield);
            }
        }
    }

    @Override
    public String toString() {
        return "========= SavingsAccount ========== \n" +super.toString();
    }
}
