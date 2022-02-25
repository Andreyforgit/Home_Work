package Home_Work6;


import java.util.*;

public class Main {
    static Map<Account,Client> accountClient = new HashMap<>();
    static Map<Client,List<Account>> clientAccount = new HashMap<>();
    static List<Account> listAccountPetrov = new ArrayList<>();
    static List<Account> listAccountIvanov = new ArrayList<>();

    public static void main(String[] args) {
        Account account1 = new Account("0001", "Petrov");
        Account account4 = new Account("0004", "Petrov");
        Account account2 = new Account("0002", "Ivanov");
        Account account12 = new Account("0012", "Ivanov");
        Account account21 = new Account("0021", "Ivanov");
        Client client1 = new Client("Petrov", 20);
        Client client2 = new Client("Ivanov", 14);

        accountClient.put(account1,client1);
        accountClient.put(account4,client1);
        accountClient.put(account2,client2);
        accountClient.put(account12,client2);
        listAccountPetrov.add(account1);
        listAccountPetrov.add(account4);
        listAccountIvanov.add(account2);
        listAccountIvanov.add(account12);
        listAccountIvanov.add(account21);
        clientAccount.put(client1,listAccountPetrov);
        clientAccount.put(client2,listAccountIvanov);

        newFindClient(account1);
        newGetAccounts(client2);
    }
    public static void newGetAccounts (Client client){
        clientAccount.get(client).forEach(item -> System.out.println(item.accountNumber));
    }
    public static void newFindClient (Account account){
        String clientNameAge = accountClient.get(account).name;
        System.out.println(clientNameAge);
    }
}
