package Home_Work6;

import java.util.Objects;

public class Client {
    String name;
    int age;

    public Client(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && Objects.equals(name, client.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}