package Home_Work7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DBAdmin {
    String name;
    int age;

    public DBAdmin(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void input() throws MyException, NullPointerException {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            s = reader.readLine();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        assert s != null;
        if (s.equals("")) {
            throw new MyException();
        }
    }
}