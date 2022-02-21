package entities;

import exceptions.DigitalBankException;

public class CheckingAccount extends Account{

    public CheckingAccount(int agency, double balance, String holder) {
        super(agency, balance, holder);
    }

    public CheckingAccount( double balance, String holder) {
        super(balance, holder);
    }

    @Override
    public void transfer(double value, Account accountTarget){
        if (accountTarget == null){
            throw new DigitalBankException("invalid account");
        }
        accountTarget.deposit(super.withdraw(value));

        if(accountTarget.getHolder_cpf() != super.getHolder_cpf()){
            super.withdraw(2.00); //fees for transfers to different holders
        }

    }

    @Override
    public String toString() {
        return "========= CheckingAccount ========== \n"+super.toString();
    }
}
