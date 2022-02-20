package Home_Work7;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        DBAdmin dbAdmin1 = new DBAdmin("Vasya",23);
        Employee employee1 = new Employee("Vanya", 20, "Bookkeeper1");

        try{
            dbAdmin1.input();
        }catch (NullPointerException | MyException ex){
            System.out.println("Нет данных");
        }

        try{
            try{
            employee1.readNumFile();
            }catch (BadFileNameExcpetion ex){
                throw new IOException();
            }
        }catch(IOException ex){
            System.out.println("Введён плохой номер для чтения файла");
        }catch (NullPointerException ex){

        }
    }
}
