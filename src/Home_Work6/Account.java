package Home_Work6;

import java.util.Objects;

public class Account {
    String accountNumber;
    String accountOwner;

    public Account(String accountNumber, String accountOwner){
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountNumber, account.accountNumber) && Objects.equals(accountOwner, account.accountOwner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountOwner);
    }
}
