package Home_Work6;


import java.util.*;

public class Main {
    static ArrayList<Account> accountList = new ArrayList<>();
    static ArrayList<Client> clientList = new ArrayList<>();

    public static void main(String[] args) {
        Account account1 = new Account("0001", "Petrov");
        Account account4 = new Account("0004", "Petrov");
        Account account2 = new Account("0002", "Ivanov");
        Account account12 = new Account("0012", "Ivanov");
        Account account21 = new Account("0021", "Ivanov");
        Account account3 = new Account("0003", "Von");

        Client client1 = new Client("Petrov", 20);
        Client client2 = new Client("Ivanov", 14);
        Client client3 = new Client("Von", 18);

        accountList.add(account1);
        accountList.add(account2);
        accountList.add(account3);
        accountList.add(account4);
        accountList.add(account12);
        accountList.add(account21);

        clientList.add(client1);
        clientList.add(client2);
        clientList.add(client3);


        getAccounts(client1);
        findClient(account3);

    }
    public static void getAccounts(Client client){
        System.out.println("Список счётов клиента: " + client.name);
        for (int i = 0; i < clientList.size(); i++) {
            if(clientList.get(i).hashCode()==client.hashCode()) {
                if (clientList.get(i).equals(client)) {
                    for (int j = 0; j < accountList.size(); j++) {
                        if (accountList.get(j).accountOwner.equals(client.name)) {
                            System.out.println(accountList.get(j).accountNumber);
                        }
                    }
                }
            }
        }
    }
    public static void findClient(Account account){
        System.out.println("Владелец счёта №" + account.accountNumber);
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).hashCode()==account.hashCode()) {
                if (accountList.get(i).equals(account)) {
                    for (int j = 0; j < clientList.size(); j++) {
                        if (clientList.get(j).name.equals(account.accountOwner)) {
                            System.out.println(clientList.get(j).name + " " + clientList.get(j).age + " лет");
                        }
                    }
                }
            }
        }
    }

}
