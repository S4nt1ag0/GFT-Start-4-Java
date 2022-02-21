package entities;

import java.util.ArrayList;
import java.util.List;

public class Client {
private long cpf;
private String name;
private List<Account> accounts = new ArrayList<>();

    public Client(long cpf, String name) {
        this.cpf = cpf;
        this.name = name;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }
}
