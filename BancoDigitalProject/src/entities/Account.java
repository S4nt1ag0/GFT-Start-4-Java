package entities;

import exceptions.DigitalBankException;

public abstract class Account {

    private static int AGENCY_DEFAULT = 3300;
    private static int NUMBER_ACCOUNT = 0;
    private int agency;
    private int number;
    private double balance;
    private String holder;
    private long holder_cpf;

    public static int getAgencyDefault() {
        return AGENCY_DEFAULT;
    }

    public static void setAgencyDefault(int agencyDefault) {
        AGENCY_DEFAULT = agencyDefault;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public long getHolder_cpf() {
        return holder_cpf;
    }

    public void setHolder_cpf(long holder_cpf) {
        this.holder_cpf = holder_cpf;
    }

    public Account(int agency, double balance, String holder) {
        this.agency = agency;
        this.number = NUMBER_ACCOUNT++;
        this.balance = balance;
        this.holder = holder;
    }

    public Account( double balance, String holder) {
        this.agency = AGENCY_DEFAULT;
        this.number = NUMBER_ACCOUNT++;
        this.balance = balance;
        this.holder = holder;
    }

    public double withdraw(double value){
        if(value<=0.0){
            throw new DigitalBankException("invalid value");
        }else if(this.balance<value){
            throw new DigitalBankException("balance insufficient");
        }
        this.balance -=value;
        return value;

    }

    public void deposit(double value){
        if(value<=0.0){
            throw new DigitalBankException("invalid value");
        }
        balance += value;
    }

    public void transfer(double value, Account accountTarget){
        if (accountTarget == null){
            throw new DigitalBankException("invalid account");
        }
        accountTarget.deposit(withdraw(value));

        if(accountTarget.getHolder_cpf() != this.holder_cpf){
            withdraw(5.00); //fees for transfers to different holders
        }

    }

    public void pix(double value, Account accountTarget){
        if (accountTarget == null){
            throw new DigitalBankException("invalid account");
        }
        accountTarget.deposit(withdraw(value));

    }

    @Override
    public String toString() {
        return "agency=" + agency +
                ", number=" + number +
                ", balance=" + balance +
                ", holder='" + holder + '\'' +
                ", holder_cpf=" + holder_cpf;
    }
}
