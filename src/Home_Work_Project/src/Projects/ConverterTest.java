package Projects;

import org.junit.jupiter.api.Assertions;

class ConverterTest {

    @org.junit.jupiter.api.Test
    void digits2text() {
        String scenario = "Тест преобразования числа";
        try {

            String actual1 = Converter.digits2text(3.0);
            Assertions.assertEquals("Три рубля 00 копеек", actual1);

            String actual2 = Converter.digits2text(33.0);
            Assertions.assertEquals("Тридцать три рубля 00 копеек", actual2);

            String actual3 = Converter.digits2text(333.0);
            Assertions.assertEquals("Триста тридцать три рубля 00 копеек", actual3);

            System.out.printf("\"%s\" passed %n", scenario);

        }catch(Throwable e) {
            System.err.printf("\"%s\" fails with message \"%s\" %n", scenario, e.getMessage());
        }

    }
}