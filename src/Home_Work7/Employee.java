package Home_Work7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
    String name;
    int age;
    String position;

    public Employee(String name, int age, String position){
        this.name = name;
        this.age = age;
        this.position = position;
    }

    public void readNumFile() throws BadFileNameExcpetion, NullPointerException {
        String path = "C:/JavaProjects/Home_Work/src/Home_Work7/";
        Scanner scanFileName = new Scanner(System.in);
        System.out.println("Укажите имя файла для чтения: ");
        String fileName = scanFileName.nextLine();
        File fileForRead = new File(path + fileName);
        if(fileName.equals("File13.txt")){
            throw new BadFileNameExcpetion();
        }
        Scanner scanFromFile = null;
        try{
            scanFromFile = new Scanner(fileForRead);
        }catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        }finally {
            scanFileName.close();
        }
            while(scanFromFile.hasNextInt()){
                try{
                    System.out.println(scanFromFile.nextInt());
                }catch (InputMismatchException ex){
                    System.out.println("Содержание файла имеет не числовой формат!!!");
                    break;
                }
            }
        scanFileName.close();
        scanFromFile.close();

    }
}
