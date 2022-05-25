package Projects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        //System.out.println(new Ruble().addRub((double) number, Converter.digits2text((double) number)));

        convert(number, new Ruble());



    }

    static String convert(int digit, Currency currency){
        System.out.println(currency.addRub((double) digit, Converter.digits2text((double) digit)));
        return null;
    }
}